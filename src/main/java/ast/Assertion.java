package ast;

public class Assertion extends Statement {
    public enum Type { STATUS, HEADER_EQUALS, HEADER_CONTAINS, BODY_CONTAINS }

    private final Type type;
    private final String key, value;
    private final int code;

    private Assertion(Type t, String k, String v, int c) {
        this.type = t; this.key = k; this.value = v; this.code = c;
    }

    public static Assertion status(int code) { return new Assertion(Type.STATUS, null, null, code); }
    public static Assertion headerEquals(String k, String v) { return new Assertion(Type.HEADER_EQUALS, k, v, 0); }
    public static Assertion headerContains(String k, String v) { return new Assertion(Type.HEADER_CONTAINS, k, v, 0); }
    public static Assertion bodyContains(String v) { return new Assertion(Type.BODY_CONTAINS, null, v, 0); }

    public Type getType() { return type; }
    public String getKey() { return key; }
    public String getValue() { return value; }
    public int getCode() { return code; }
}
