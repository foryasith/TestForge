package com.testforge;

import java.io.*;
import java_cup.runtime.Symbol;
import ast.*;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java com.testforge.Main <input.test>");
            System.exit(1);
        }

        try (FileReader reader = new FileReader(args[0])) {
            TestForgeScanner scanner = new TestForgeScanner(reader);
            Parser parser = new Parser(scanner);
            Symbol result = parser.parse();
            Program program = (Program) result.value;

            System.out.println("✅ Parsed successfully!");
            System.out.println("Tests found: " + program.getTests().size());
            // Here you'll later generate GeneratedTests.java
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
