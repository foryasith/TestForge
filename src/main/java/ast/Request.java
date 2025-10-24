package ast;

public class Request extends Statement {
    private final HttpMethod method;
    private final String path;
    private String body;

    public Request(HttpMethod method, String path) {
        this.method = method;
        this.path = path;
    }

    public HttpMethod getMethod() { return method; }
    public String getPath() { return path; }

    public void setBody(String body) { this.body = body; }
    public String getBody() { return body; }
}
