package com.onfido.integration;

import static org.junit.Assert.assertEquals;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Webhook;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.UUID;

import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebhookManagerTest extends TestBase {
  private Webhook webhook;

  @BeforeMethod
  public void setup() throws Exception {
    webhook = createWebhook("https://example.com/webhook");
  }

  private Webhook createWebhook(String url) throws Exception {
    prepareMock(new JsonObject().add("url", url)
                                .add("id", UUID.randomUUID().toString()));

    Webhook webhook = onfido.webhook.create(Webhook.request().url(url));

    takeRequest("/webhooks/");

    assertRequestField("url", url);

    return webhook;
  }

  @Test
  public void createWebhookTest() throws Exception {
    assertEquals("https://example.com/webhook", webhook.getUrl());
  }

  @Test
  public void findWebhookTest() throws Exception {
    prepareMock(new JsonObject().add("url", "https://example.com/webhook"));

    Webhook lookupWebhook = onfido.webhook.find(webhook.getId());

    takeRequest("/webhooks/" + webhook.getId());

    assertEquals("https://example.com/webhook", lookupWebhook.getUrl());
  }

  @Test
  public void updateWebhookTest() throws Exception {
    prepareMock(new JsonObject().add("url", "https://example.com/webhook/updated"));

    Webhook updatedWebhook =
      onfido.webhook.update(webhook.getId(),
                            Webhook.request().url("https://example.com/webhook/updated"));

    takeRequest("/webhooks/" + webhook.getId());

    assertRequestField("url", "https://example.com/webhook/updated");

    assertEquals("https://example.com/webhook/updated", updatedWebhook.getUrl());
  }

  @Test
  public void deleteWebhookTest() throws Exception {
    prepareMock("", null, 204);

    onfido.webhook.delete(webhook.getId());

    takeRequest("/webhooks/" + webhook.getId());
  }

  @Test
  public void listWebhooksTest() throws Exception {
    Webhook firstWebhook = createWebhook("https://example.com/firstWebhook");
    Webhook secondWebhook = createWebhook("https://example.com/secondWebhook");

    prepareMock(new JsonObject().add("webhooks",
                                     Arrays.asList(
                                        new JsonObject().add("url", "https://example.com/firstWebhook").map,
                                        new JsonObject().add("url", "https://example.com/secondWebhook").map)));

    List<Webhook> webhooks = onfido.webhook.list().stream()
                                           .sorted(Comparator.comparing(Webhook::getUrl))
                                           .collect(Collectors.toList());

    takeRequest("/webhooks/");

    assertEquals("https://example.com/firstWebhook", webhooks.get(0).getUrl());
    assertEquals("https://example.com/secondWebhook", webhooks.get(1).getUrl());
  }
}
