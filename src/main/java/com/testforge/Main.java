package com.testforge;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java com.testlangpp.Main <inputfile.test>");
            return;
        }

        String filename = args[0];
        System.out.println("Parsing file: " + filename);

        FileReader reader = new FileReader(filename);
        TestForgeScanner scanner = new TestForgeScanner(reader);
        Parser parser = new Parser(scanner);

        parser.parse();
        System.out.println("Parsing complete! GeneratedTests.java created.");
    }
}
