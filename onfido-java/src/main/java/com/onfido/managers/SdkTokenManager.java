package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.SdkToken;

/**
 * Manager class for the Sdk token resource type. Contains resource-specific methods for interacting with the API.
 */
public class SdkTokenManager extends ResourceManager {

    private ApiJson<SdkToken> sdkTokenParser = new ApiJson<>(SdkToken.class);
    private ApiJson<SdkToken.Request> requestParser = new ApiJson<>(SdkToken.Request.class);

    /**
     * Instantiates a new Sdk token manager.
     *
     * @param config the config
     */
    public SdkTokenManager(Config config) {
        super("sdk_token/", config);
    }

    /**
     * Generate string.
     *
     * @param request the request
     * @return the string
     * @throws OnfidoException the onfido exception
     */
    public String generate(SdkToken.Request request) throws OnfidoException {
        return sdkTokenParser.parse(post("", requestParser.toJson(request))).getToken();
    }
}
