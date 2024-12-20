package com.onfido.webhooks;

import com.onfido.OnfidoInvalidSignatureError;
import com.onfido.WebhookEventVerifier;
import com.onfido.integration.TestBase;
import com.onfido.model.WebhookEvent;
import com.onfido.model.WebhookEventObjectStatus;
import com.onfido.model.WebhookEventPayload;
import com.onfido.model.WebhookEventPayloadObject;
import com.onfido.model.WebhookEventPayloadResource;
import com.onfido.model.WebhookEventResourceType;
import com.onfido.model.WebhookEventType;
import java.io.File;
import java.nio.file.Files;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WebhookStudioEventVerifierTest extends TestBase {
  private static final String rawEvent =
      "{\"payload\":{\"resource_type\":\"workflow_task\",\"action\":\"workflow_task.started\",\"object\":{\"id\":\"profile_1eb92\","
          + "\"task_spec_id\":\"profile_1eb92\",\"task_def_id\":\"profile_data\",\"workflow_run_id\":\"bc77c6e5-753a-4580-96a6-aaed3e5a8d19\""
          + ",\"status\":\"started\",\"started_at_iso8601\":\"2024-07-10T12:49:09Z\",\"href\":\"https://api.eu.onfido.com/v3.6/workflow_runs/"
          + "bc77c6e5-753a-4580-96a6-aaed3e5a8d19/tasks/profile_1eb92\"},\"resource\":{\"created_at\":\"2024-07-10T12:49:09Z\",\"id\":"
          + "\"profile_1eb92\",\"workflow_run_id\":\"bc77c6e5-753a-4580-96a6-aaed3e5a8d19\",\"updated_at\":\"2024-07-10T12:49:09Z\""
          + ",\"input\":{},\"task_def_version\":null,\"task_def_id\":\"profile_data\",\"output\":null}}}";

  private static final String webhookToken = "YKOC6mkBxi6yK2zlUIrLMvsJMFEZObP5";

  private WebhookEventVerifier webhookEventVerifier = new WebhookEventVerifier(webhookToken);

  private static final WebhookEventPayloadObject expectedObject =
      new WebhookEventPayloadObject()
          .id("profile_1eb92")
          .status(WebhookEventObjectStatus.STARTED)
          .startedAtIso8601(OffsetDateTime.parse("2024-07-10T12:49:09Z"))
          .href(
              "https://api.eu.onfido.com/v3.6/workflow_runs/bc77c6e5-753a-4580-96a6-aaed3e5a8d19/tasks/profile_1eb92");

  private static final WebhookEventPayloadResource expectedResource =
      new WebhookEventPayloadResource()
          .createdAt(OffsetDateTime.parse("2024-07-10T12:49:09Z"))
          .id("profile_1eb92")
          .workflowRunId(UUID.fromString("bc77c6e5-753a-4580-96a6-aaed3e5a8d19"))
          .updatedAt(OffsetDateTime.parse("2024-07-10T12:49:09Z"))
          .input(new HashMap<>())
          .taskDefId("profile_data");

  @Test
  public void validSignatureTest() throws Exception {
    final String signature = "c95a5b785484f6fa1bc25f381b5595d66bf85cb442eefb06aa007802ee6a4dfa";

    WebhookEvent event = webhookEventVerifier.readPayload(rawEvent, signature);
    WebhookEventPayload webhookPayload = event.getPayload();

    Assertions.assertEquals(WebhookEventType.WORKFLOW_TASK_STARTED, webhookPayload.getAction());
    Assertions.assertEquals(
        WebhookEventResourceType.WORKFLOW_TASK, webhookPayload.getResourceType());
    Assertions.assertEquals(expectedObject, webhookPayload.getObject());
    Assertions.assertEquals(expectedResource, webhookPayload.getResource());
  }

  @Test
  public void invalidSignatureTest() throws Exception {
    final String signature = "c95a5b785484f6fa1bc25f381b5595d66bf85cb442eefb06aa007802ee6a4dfc";

    Assertions.assertThrows(
        OnfidoInvalidSignatureError.class,
        () -> webhookEventVerifier.readPayload(rawEvent, signature));
  }

  @Test
  public void validSignatureWithObjectInOutputTest() throws Exception {
    final String signature = "e3e5565647f5ccf07b2fd8ac22eab94a0a0619413d981fb768295c820523f7d7";

    String rawEventFromFile =
        new String(
            Files.readAllBytes(
                new File("media/studio_webhook_event_with_object_in_output.json").toPath()));

    WebhookEvent event = webhookEventVerifier.readPayload(rawEventFromFile, signature);

    Assertions.assertTrue(
        event
            .getPayload()
            .getResource()
            .getOutput()
            .toString()
            .contains(
                "properties={date_of_birth=1990-01-01, date_of_expiry=2031-05-28,"
                    + " document_numbers=[{type=document_number, value=999999999}]"));
  }

  @Test
  public void validSignatureWithListInOutputTest() throws Exception {
    final String signature = "f3a5170acfcecf8c1bf6d9cb9995c0d9dec941af83056a721530f8de7af2c293";

    String rawEventFromFile =
        new String(
            Files.readAllBytes(
                new File("media/studio_webhook_event_with_list_in_output.json").toPath()));

    WebhookEvent event = webhookEventVerifier.readPayload(rawEventFromFile, signature);

    Assertions.assertEquals(
        event.getPayload().getResource().getOutput().toString(),
        "[{type=document_photo, id=7af75a3a-ba34-4aa5-9e3e-096c9f56256b,"
            + " checksum_sha256=hiwV2PLmeQZzeySPGGwVL48sxVXcyfpXy9LDl1u3lWU=}]");
  }
}
