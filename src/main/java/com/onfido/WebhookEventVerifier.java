package com.onfido;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.onfido.model.WebhookEvent;
import com.onfido.model.WebhookEventType;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.OffsetDateTime;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/** Contains a public method for verifying webhook responses. */
public class WebhookEventVerifier {
  private final String webhookToken;
  private Gson gson;

  /**
   * Instantiates a new WebhookEventVerifier.
   *
   * @param webhookToken the webhook token
   */
  public WebhookEventVerifier(String webhookToken) {
    this.webhookToken = webhookToken;
    this.gson =
        new GsonBuilder()
            .registerTypeAdapter(
                WebhookEventType.class,
                new TypeAdapter<WebhookEventType>() {
                  @Override
                  public void write(JsonWriter out, WebhookEventType value) throws IOException {
                    out.value(value.name().toLowerCase().replace("_", "."));
                  }

                  @Override
                  public WebhookEventType read(JsonReader in) throws IOException {
                    return WebhookEventType.valueOf(
                        in.nextString().toUpperCase().replace(".", "_"));
                  }
                })
            .registerTypeAdapter(
                OffsetDateTime.class,
                (JsonDeserializer<OffsetDateTime>)
                    (json, type, context) -> OffsetDateTime.parse(json.getAsString()))
            .setFieldNamingStrategy(
                new FieldNamingStrategy() {
                  @Override
                  public String translateName(Field field) {
                    String name =
                        FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES.translateName(field);

                    // To handle object (and possibily others) prefixed with _ since reserved
                    if (name.startsWith("_")) {
                      return name.substring(1);
                    }

                    return name;
                  }
                })
            .create();
  }

  /**
   * Takes in a webhook response and signature and verifies it against the instance's token
   *
   * @param rawEventBody the raw event body
   * @param hexSignature the hex signature
   * @return the webhook event
   * @throws OnfidoInvalidSignatureError the onfido exception
   */
  public WebhookEvent readPayload(String rawEventBody, String hexSignature)
      throws OnfidoInvalidSignatureError {
    Mac sha256Hmac;
    SecretKeySpec secretKey;

    try {
      sha256Hmac = Mac.getInstance("HmacSHA256");
      secretKey = new SecretKeySpec(webhookToken.getBytes(), "HmacSHA256");
      sha256Hmac.init(secretKey);
    } catch (Exception ex) {
      throw new OnfidoInvalidSignatureError(ex);
    }

    String eventSignature =
        new String(
            encodeHexString(sha256Hmac.doFinal(rawEventBody.getBytes(StandardCharsets.UTF_8))));

    // MessageDigest.isEqual() is a time safe comparison
    if (!MessageDigest.isEqual(eventSignature.getBytes(), hexSignature.getBytes())) {
      throw new OnfidoInvalidSignatureError("Invalid signature for webhook event");
    }

    try {
      JsonReader jsonReader = new JsonReader(new StringReader(rawEventBody));
      jsonReader.setLenient(true);

      return gson.fromJson(jsonReader, WebhookEvent.class);
    } catch (JsonParseException e) {
      throw new OnfidoInvalidSignatureError("Invalid payload for webhook event", e);
    }
  }

  private String encodeHexString(byte[] byteArray) {
    StringBuffer hexStringBuffer = new StringBuffer();
    for (int i = 0; i < byteArray.length; i++) {
      hexStringBuffer.append(byteToHex(byteArray[i]));
    }
    return hexStringBuffer.toString();
  }

  private String byteToHex(byte num) {
    char[] hexDigits = new char[2];
    hexDigits[0] = Character.forDigit((num >> 4) & 0xF, 16);
    hexDigits[1] = Character.forDigit((num & 0xF), 16);
    return new String(hexDigits);
  }
}
