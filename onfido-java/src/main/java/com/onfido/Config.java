package com.onfido;

public class Config {

    private final String apiToken;
    private final String apiUrl;

    public Config(Onfido.Builder builder) {
        apiToken = builder.apiToken;
        apiUrl = builder.apiUrl;
    }

    public String getApiToken() {
        return apiToken;
    }

    public String getApiUrl() {
        return apiUrl;
    }
}
