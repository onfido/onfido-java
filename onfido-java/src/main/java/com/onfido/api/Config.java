package com.onfido.api;

import com.onfido.Onfido;

/** The Configuration class for the Onfido object. */
public class Config {

  private final String apiToken;
  private final String apiUrl;

  /**
   * Instantiates a new Config.
   *
   * @param builder the builder from the parent Onfido object
   */
  public Config(Onfido.Builder builder) {
    apiToken = builder.apiToken;
    apiUrl = builder.apiUrl;
  }

  /**
   * Gets the api token.
   *
   * @return the api token
   */
  public String getApiToken() {
    return apiToken;
  }

  /**
   * Gets the api url.
   *
   * @return the api url
   */
  public String getApiUrl() {
    return apiUrl;
  }
}
