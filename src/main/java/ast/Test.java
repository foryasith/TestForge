package ast;
import java.util.*;

public class Test {
    private final String name;
    private final List<Statement> statements;

    public Test(String name, List<Statement> stmts) {
        this.name = name;
        this.statements = stmts;
    }

    public String getName() { return name; }
    public List<Statement> getStatements() { return statements; }
}
