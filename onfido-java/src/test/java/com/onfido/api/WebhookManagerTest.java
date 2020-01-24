package com.onfido.api;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Webhook;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * The type Webhook manager test.
 */
public class WebhookManagerTest extends ApiIntegrationTest {

    /**
     * Create webhook.
     *
     * @throws Exception the exception
     */
    @Test
    public void createWebhook() throws Exception {
        String response = new JsonObject()
                .add("url", "url")
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        Webhook webhook = onfido.webhook.create(Webhook.request().url("url"));

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/webhooks/", request.getPath());

        // Correct request body
        String json = request.getBody().readUtf8();
        JsonObject jsonObject = JsonObject.parse(json);
        assertEquals("url", jsonObject.get("url"));

        // Correct response body
        assertEquals("url", webhook.getUrl());
    }

    /**
     * Find webhook.
     *
     * @throws Exception the exception
     */
    @Test
    public void findWebhook() throws Exception {
        String response = new JsonObject()
                .add("url", "url")
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        Webhook webhook = onfido.webhook.find("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/webhooks/id", request.getPath());

        // Correct response body
        assertEquals("url", webhook.getUrl());
    }

    /**
     * Update webhook.
     *
     * @throws Exception the exception
     */
    @Test
    public void updateWebhook() throws Exception {
        String response = new JsonObject()
                .add("url", "url")
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        Webhook webhook = onfido.webhook.update("id", Webhook.request().url("url"));

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/webhooks/id", request.getPath());

        // Correct request body
        String json = request.getBody().readUtf8();
        JsonObject jsonObject = JsonObject.parse(json);
        assertEquals("url", jsonObject.get("url"));

        // Correct response body
        assertEquals("url", webhook.getUrl());
    }


    /**
     * Delete webhook.
     *
     * @throws Exception the exception
     */
    @Test
    public void deleteWebhook() throws Exception {
        MockWebServer server = mockRequestResponse("");

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        onfido.webhook.delete("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/webhooks/id", request.getPath());
    }

    /**
     * List webhooks.
     *
     * @throws Exception the exception
     */
    @Test
    public void listWebhooks() throws Exception {
        String response = new JsonObject().add("webhooks", Arrays.asList(
                new JsonObject().add("url", "url1").map,
                new JsonObject().add("url", "url2").map))
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        List<Webhook> webhooks = onfido.webhook.list();

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/webhooks/", request.getPath());

        // Correct response body
        assertEquals("url1", webhooks.get(0).getUrl());
        assertEquals("url2", webhooks.get(1).getUrl());
    }
}
