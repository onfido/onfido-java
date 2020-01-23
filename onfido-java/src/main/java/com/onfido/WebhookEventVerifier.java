package com.onfido;

import com.onfido.api.ApiJson;
import com.onfido.api.WebhookEvent;
import com.onfido.api.WebhookPayload;
import com.onfido.exceptions.OnfidoException;
import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class WebhookEventVerifier {

    private ApiJson<WebhookPayload> parser = new ApiJson<>(WebhookPayload.class);
    private final String webhookToken;


    public WebhookEventVerifier(String webhookToken) {
        this.webhookToken = webhookToken;
    }

    public WebhookEvent readPayload(String rawEventBody, String hexSignature) throws OnfidoException {
        try {
            Mac sha256Hmac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKey = new SecretKeySpec(webhookToken.getBytes(), "HmacSHA256");
            sha256Hmac.init(secretKey);

            String eventSignature = new String(Hex.encodeHex(sha256Hmac.doFinal(rawEventBody.getBytes(StandardCharsets.UTF_8))));

            // MessageDigest.isEqual() is a time safe comparison
            if (!MessageDigest.isEqual(eventSignature.getBytes(), hexSignature.getBytes())) {
                throw new Exception();
            }

            return parser.parse(rawEventBody).getPayload();
        } catch (Exception ex) {
            throw new OnfidoException("Invalid signature for webhook event", ex);
        }
    }
}
