package com.onfido;

import com.onfido.managers.ApplicantManager;

public final class Onfido {

  private static final String DEFAULT_API_URL = "https://api.onfido.com/v3/";
  private static final String US_API_URL = "https://api.us.onfido.com/v3/";

  public final Config config;

  public final ApplicantManager applicant;

  private Onfido(Builder builder) {
    config = new Config(builder);
    applicant = new ApplicantManager(this.config);
  }

  public static final class Builder {
    public String apiToken = "";
    public String apiUrl = DEFAULT_API_URL;

    private Builder() {}

    public Onfido build() {
      return new Onfido(this);
    }

    public Builder apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    public Builder regionUS() {
      this.apiUrl = US_API_URL;
      return this;
    }

    public Builder unknownApiUrl(String url) {
      this.apiUrl = url;
      return this;
    }
  }

  public static Builder builder() {
    return new Builder();
  }
}
