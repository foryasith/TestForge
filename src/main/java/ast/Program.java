package ast;
import java.util.*;

public class Program {
    private Config config;
    private final List<Variable> variables = new ArrayList<>();
    private final List<Test> tests = new ArrayList<>();

    public void setConfig(Config cfg) { this.config = cfg; }
    public void addVariable(Variable v) { variables.add(v); }
    public void addTest(Test t) { tests.add(t); }

    public Config getConfig() { return config; }
    public List<Variable> getVariables() { return variables; }
    public List<Test> getTests() { return tests; }
}
