package com.onfido;

public final class RequestOptions {
  // Marked volatile for thread safety.
  private static volatile RequestOptions defaults = RequestOptions.builder().build();

  private static final String DEFAULT_API_URL = "https://api.onfido.com/v3/";
  private static final String US_API_URL = "https://api.us.onfido.com/v3/";

  private final String apiToken;
  private final String apiUrl;

  private RequestOptions(Builder builder) {
    this.apiToken = builder.apiToken;
    this.apiUrl = builder.apiUrl;
  }

  public static final class Builder {
    private String apiToken = "";
    private String apiUrl = DEFAULT_API_URL;

    private Builder() {}

    public RequestOptions build() {
      return new RequestOptions(this);
    }

    public Builder apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    public Builder regionUS() {
      this.apiUrl = US_API_URL;
      return this;
    }

    public Builder unknownApiUrl(String apiUrl) {
      this.apiUrl = apiUrl;
      return this;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  public static void setDefaults(RequestOptions defaults) {
    RequestOptions.defaults = defaults;
  }

  public static RequestOptions getDefaults() {
    return defaults;
  }

  public String getApiToken() {
    return apiToken;
  }

  public String getApiUrl() {
    return apiUrl;
  }
}
