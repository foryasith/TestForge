package ast;
import java.util.*;

public class Config {
    private String baseUrl;
    private final Map<String,String> headers = new LinkedHashMap<>();

    public void setBaseUrl(String url) { this.baseUrl = url; }
    public String getBaseUrl() { return baseUrl; }

    public void addHeader(String k, String v) { headers.put(k, v); }
    public Map<String,String> getHeaders() { return headers; }
}
