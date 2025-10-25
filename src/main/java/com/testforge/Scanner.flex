package com.testforge;

import java_cup.runtime.*;

%%

// --- JFlex Directives ---
%class TestForgeScanner
%unicode
%cup
%line
%column

%{
  // helper methods for creating java_cup Symbols with line/col
  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

// --- Macros ---
NUMBER      = [0-9]+
IDENTIFIER  = [a-zA-Z_][a-zA-Z0-9_]*
STRING      = \"([^\"\n\r\\]|\\\"|\\\\)*\"

// --- Lexical Rules ---
%%
<YYINITIAL> {

    // Keywords (case-sensitive per spec)
    "config"      { return symbol(sym.CONFIG); }
    "base_url"    { return symbol(sym.BASE_URL); }
    "test"        { return symbol(sym.TEST); }
    "expect"      { return symbol(sym.EXPECT); }
    "status"      { return symbol(sym.STATUS); }
    "body"        { return symbol(sym.BODY); }
    "header"      { return symbol(sym.HEADER); }
    "contains"    { return symbol(sym.CONTAINS); }
    "let"         { return symbol(sym.LET); }

    // HTTP verbs (uppercase in spec examples)
    "GET"         { return symbol(sym.GET); }
    "POST"        { return symbol(sym.POST); }
    "PUT"         { return symbol(sym.PUT); }
    "DELETE"      { return symbol(sym.DELETE); }

    // Symbols
    "="           { return symbol(sym.EQUALS); }
    "{"           { return symbol(sym.LBRACE); }
    "}"           { return symbol(sym.RBRACE); }
    ";"           { return symbol(sym.SEMICOLON); }

    // Literals
    {NUMBER}      { return symbol(sym.NUMBER, yytext()); }   // keep as string; parser parses int when needed
    {IDENTIFIER}  { return symbol(sym.IDENTIFIER, yytext()); }

    {STRING} {
                  String val = yytext().substring(1, yytext().length()-1);
                  val = val.replace("\\\"", "\"")
                           .replace("\\\\", "\\")
                           .replace("\\n", "\n")
                           .replace("\\r", "\r")
                           .replace("\\t", "\t");
                  return symbol(sym.STRING, val);
              }

    // Whitespace & comments
    [ \t\r\n]+     { /* skip whitespace */ }
    "//".*         { /* skip single-line comments */ }

    // Error handling: report and skip one char (do NOT crash)
    .              {
                     System.err.println("Scanner: unknown character '" + yytext() + "' at line " + (yyline+1));
                     /* skip it */
                   }
}
