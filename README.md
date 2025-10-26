🧪 **TestForge**



*TestForge* is a simple domain-specific language (DSL) and compiler written in Java, designed to define and generate automated tests from custom `.test` files.





🚀 Features



\- Custom test language for defining API tests.

\- Lexer built with JFlex.

\- Parser built with \*\*CUP\*\* (Constructor of Useful Parsers).

\- Generates a Java file (`GeneratedTests.java`) after parsing.

\- Easy to extend for automated test generation.





🧰 Project Structure



TestForge/
├── lib/
│   ├── java-cup-11b.jar
│   └── jflex-full-1.9.1.jar
├── src/
│   ├── main/java/
│   │   ├── ast/
│   │   │   ├── Assertion.java
│   │   │   ├── Config.java
│   │   │   ├── HttpMethod.java
│   │   │   ├── Program.java
│   │   │   ├── Request.java
│   │   │   ├── Statement.java
│   │   │   ├── Test.java
│   │   │   └── Variable.java
│   │   └── com/testforge/
│   │       ├── Main.java
│   │       ├── Parser.java
│   │       ├── sym.java
│   │       ├── TestForgeScanner.java
│   │       ├── Parser.cup
│   │       └── Scanner.flex
│   └── test/
│       └── example.test
│       └── example_1.test
│       └── example_2.test


