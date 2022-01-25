package vuclip;

public class ApiVersionEntity {
    private final String app;
    private final String api;
    private final String version;

    public ApiVersionEntity(String app, String api, String version) {
        this.app = app;
        this.api = api;
        this.version = version;
    }

    public String getApp() {
        return app;
    }

    public String getApi() {
        return api;
    }

    public String getVersion() {
        return version;
    }
}
