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

/** Contains a public method for verifying webhook responses. */
public class WebhookEventVerifier {

  private ApiJson<WebhookPayload> parser = new ApiJson<>(WebhookPayload.class);
  private final String webhookToken;

  /**
   * Instantiates a new WebhookEventVerifier.
   *
   * @param webhookToken the webhook token
   */
  public WebhookEventVerifier(String webhookToken) {
    this.webhookToken = webhookToken;
  }

  /**
   * Takes in a webhook response and signature and verifies it against the instance's token
   *
   * @param rawEventBody the raw event body
   * @param hexSignature the hex signature
   * @return the webhook event
   * @throws OnfidoException the onfido exception
   */
  public WebhookEvent readPayload(String rawEventBody, String hexSignature) throws OnfidoException {
    Mac sha256Hmac;
    SecretKeySpec secretKey;

    try {
      sha256Hmac = Mac.getInstance("HmacSHA256");
      secretKey = new SecretKeySpec(webhookToken.getBytes(), "HmacSHA256");
      sha256Hmac.init(secretKey);
    } catch (Exception ex) {
      throw new OnfidoException("Invalid webhook token", ex);
    }

    String eventSignature =
        new String(
            Hex.encodeHex(sha256Hmac.doFinal(rawEventBody.getBytes(StandardCharsets.UTF_8))));

    // MessageDigest.isEqual() is a time safe comparison
    if (!MessageDigest.isEqual(eventSignature.getBytes(), hexSignature.getBytes())) {
      throw new OnfidoException("Invalid signature for webhook event");
    }

    return parser.parse(rawEventBody).getPayload();
  }
}
