package ast;

public class Variable {
    private final String name;
    private final String value;

    public Variable(String name, Object value) {
        this.name = name;
        this.value = String.valueOf(value);
    }

    public String getName() { return name; }
    public String getValue() { return value; }
}
