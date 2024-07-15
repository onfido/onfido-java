package com.onfido.webhooks;

import com.onfido.OnfidoInvalidSignatureError;
import com.onfido.WebhookEventVerifier;
import com.onfido.integration.TestBase;
import com.onfido.model.WebhookEvent;
import com.onfido.model.WebhookEventPayload;
import com.onfido.model.WebhookEventPayloadObject;
import com.onfido.model.WebhookEventType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WebhookClassicEventVerifierTest extends TestBase {
  private static final String rawEvent =
      "{\"payload\":{\"resource_type\":\"check\",\"action\":\"check.completed\",\"object\":{\"id\":\"f2302f45-227d-413d-ad61-09ec077a086a\""
          + ",\"status\":\"complete\",\"completed_at_iso8601\":\"2024-04-04T09:21:21Z\""
          + ",\"href\":\"https://api.onfido.com/v3.6/checks/f2302f45-227d-413d-ad61-09ec077a086a\"}}}";

  private static final String webhookToken = "wU99mE6jJ7nXOLFwZ0tJymM1lpI15pZh";

  private WebhookEventVerifier webhookEventVerifier = new WebhookEventVerifier(webhookToken);

  private static final WebhookEvent expectedEvent =
      new WebhookEvent()
          .payload(
              new WebhookEventPayload()
                  .action(WebhookEventType.CHECK_COMPLETED)
                  .resourceType("check")
                  ._object(
                      new WebhookEventPayloadObject()
                          .id("f2302f45-227d-413d-ad61-09ec077a086a")
                          .href(
                              "https://api.onfido.com/v3.6/checks/f2302f45-227d-413d-ad61-09ec077a086a")
                          .status("complete")
                          .completedAtIso8601(OffsetDateTime.parse("2024-04-04T09:21:21Z"))));

  @Test
  public void validSignatureTest() throws Exception {
    final String signature = "77ebc3e418f26be6eebb47f7ebe551321de26734fc273961e075fc9ab163d9c7";

    WebhookEvent event = webhookEventVerifier.readPayload(rawEvent, signature);

    Assertions.assertEquals(expectedEvent, event);
  }

  @Test
  public void invalidSignatureTest() throws Exception {
    final String signature = "77ebc3e418f26be6eebb47f7ebe551321de26734fc273961e075fc9ab163d9c8";

    Assertions.assertThrows(
        OnfidoInvalidSignatureError.class,
        () -> webhookEventVerifier.readPayload(rawEvent, signature));
  }
}
