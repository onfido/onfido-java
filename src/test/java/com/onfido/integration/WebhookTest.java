package com.onfido.integration;

import com.onfido.model.Webhook;
import com.onfido.model.WebhookBuilder;
import com.onfido.model.WebhookEventType;
import com.onfido.model.WebhookResend;
import com.onfido.model.WebhookUpdater;
import com.onfido.model.WebhooksResendItem;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WebhookTest extends TestBase {
  private Webhook webhook;

  @BeforeEach
  public void setup() throws Exception {
    webhook = createWebhook("https://example.com/webhook");
  }

  @AfterEach
  public void tearDown() throws Exception {
    cleanUpWebhooks();
  }

  private Webhook createWebhook(String url) throws Exception {
    return onfido.createWebhook(new WebhookBuilder().url(url));
  }

  @Test
  public void createWebhookTest() throws Exception {
    Assertions.assertEquals("https://example.com/webhook", webhook.getUrl());

    Assertions.assertNotNull(webhook.toJson());
  }

  @Test
  public void findWebhookTest() throws Exception {
    Webhook lookupWebhook = onfido.findWebhook(webhook.getId());

    Assertions.assertEquals("https://example.com/webhook", lookupWebhook.getUrl());

    Assertions.assertNotNull(lookupWebhook.toJson());
  }

  @Test
  public void updateWebhookTest() throws Exception {
    Webhook updatedWebhook =
        onfido.updateWebhook(
            webhook.getId(), new WebhookUpdater().url("https://example.com/webhook/updated"));

    Assertions.assertEquals("https://example.com/webhook/updated", updatedWebhook.getUrl());

    Assertions.assertNotNull(updatedWebhook.toJson());
  }

  @Test
  public void deleteWebhookTest() throws Exception {
    onfido.deleteWebhook(webhook.getId());
  }

  @Test
  public void listWebhooksTest() throws Exception {
    createWebhook("https://example.com/firstWebhook");
    createWebhook("https://example.com/secondWebhook");

    List<Webhook> webhooks =
        onfido.listWebhooks().getWebhooks().stream()
            .sorted(Comparator.comparing(Webhook::getUrl))
            .collect(Collectors.toList());

    Assertions.assertEquals(3, webhooks.size());
    Assertions.assertEquals("https://example.com/firstWebhook", webhooks.get(0).getUrl());
    Assertions.assertEquals("https://example.com/secondWebhook", webhooks.get(1).getUrl());

    Assertions.assertNotNull(webhooks.get(0).toJson());
    Assertions.assertNotNull(webhooks.get(1).toJson());
  }

  @Test
  public void resendWebhooksTest() throws Exception {
    onfido.resendWebhooks(
        new WebhookResend()
            .data(
                Arrays.asList(
                    new WebhooksResendItem()
                        .resourceId(UUID.randomUUID())
                        .event(WebhookEventType.CHECK_COMPLETED),
                    new WebhooksResendItem()
                        .resourceId(UUID.randomUUID())
                        .event(WebhookEventType.CHECK_COMPLETED))));
  }
}
