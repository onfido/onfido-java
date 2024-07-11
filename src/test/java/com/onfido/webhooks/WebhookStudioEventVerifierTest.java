package com.onfido.webhooks;

import com.onfido.OnfidoInvalidSignatureError;
import com.onfido.WebhookEventVerifier;
import com.onfido.integration.TestBase;
import com.onfido.model.WebhookEvent;
import com.onfido.model.WebhookEventPayload;
import com.onfido.model.WebhookEventPayloadObject;
import com.onfido.model.WebhookEventType;
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
          .status("started")
          .href(
              "https://api.eu.onfido.com/v3.6/workflow_runs/bc77c6e5-753a-4580-96a6-aaed3e5a8d19/tasks/profile_1eb92");

  private static final String expectedResource =
      "{created_at=2024-07-10T12:49:09Z, id=profile_1eb92,"
          + " workflow_run_id=bc77c6e5-753a-4580-96a6-aaed3e5a8d19,"
          + " updated_at=2024-07-10T12:49:09Z, input={}, task_def_version=null,"
          + " task_def_id=profile_data, output=null}";

  @Test
  public void validSignatureTest() throws Exception {
    final String signature = "c95a5b785484f6fa1bc25f381b5595d66bf85cb442eefb06aa007802ee6a4dfa";

    WebhookEvent event = webhookEventVerifier.readPayload(rawEvent, signature);
    WebhookEventPayload webhookPayload = event.getPayload();

    Assertions.assertEquals(webhookPayload.getAction(), WebhookEventType.WORKFLOW_TASK_STARTED);
    Assertions.assertEquals(webhookPayload.getResourceType(), "workflow_task");
    Assertions.assertEquals(webhookPayload.getObject(), expectedObject);
    Assertions.assertEquals(webhookPayload.getResource().toString(), expectedResource);
  }

  @Test
  public void invalidSignatureTest() throws Exception {
    final String signature = "c95a5b785484f6fa1bc25f381b5595d66bf85cb442eefb06aa007802ee6a4dfc";

    Assertions.assertThrows(
        OnfidoInvalidSignatureError.class,
        () -> webhookEventVerifier.readPayload(rawEvent, signature));
  }
}
