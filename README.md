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

│

├── lib/			 # Contains CUP and JFlex JARs

├── src/

│ ├── main/java/

│ │ ├── com/testforge/

│ │ │ ├── Main.java

│ │ │ ├── Parser.java

│ │ │ ├── TestForgeScanner.java

│ │ │ └── sym.java

│ │ └── ast/			 # AST (Abstract Syntax Tree) classes

│ └── test/	

│ └── example.test		 # Example input file

│

├── Scanner.flex 		 # JFlex lexer definition

├── Parser.cup 			 # CUP grammar definition

└── README.md			 # Project documentation









