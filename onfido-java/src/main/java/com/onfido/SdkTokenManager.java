package com.onfido;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.SdkToken;
import okhttp3.OkHttpClient;

/**
 * Manager class for the Sdk token resource type. Contains resource-specific methods for interacting
 * with the API.
 */
public class SdkTokenManager extends ResourceManager {
  private ApiJson<SdkToken> sdkTokenParser = new ApiJson<>(SdkToken.class);
  private ApiJson<SdkToken.Request> requestFormatter = new ApiJson<>(SdkToken.Request.class);

  /**
   * Instantiates a new Sdk token manager.
   *
   * @param config the config
   */
  protected SdkTokenManager(Config config, OkHttpClient client) {
    super("sdk_token/", config, client);
  }

  /**
   * Generate an SDK token.
   *
   * @param request the request
   * @return the SDK token
   * @throws OnfidoException the onfido exception
   */
  public String generate(SdkToken.Request request) throws OnfidoException {
    return sdkTokenParser.parse(post("", requestFormatter.toJson(request))).getToken();
  }
}
