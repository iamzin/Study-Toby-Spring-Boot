package tobysrping.config.autoconfig;

public class ServerProperties {
    private String contextPath;

    private int port;

    public String getContextPath() {
        return contextPath;
    }

    public int getPort() {
        return port;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
