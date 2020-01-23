package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.SdkToken;

public class SdkTokenManager extends ResourceManager {

    private ApiJson<SdkToken> sdkTokenParser = new ApiJson<>(SdkToken.class);
    private ApiJson<SdkToken.Request> requestParser = new ApiJson<>(SdkToken.Request.class);

    public SdkTokenManager(Config config) {
        super("sdk_token/", config);
    }

    public String generate(SdkToken.Request request) throws OnfidoException {
        return sdkTokenParser.parse(post("", requestParser.toJson(request))).getToken();
    }
}
