package com.onfido.api;

import com.onfido.WebhookEventVerifier;
import com.onfido.exceptions.OnfidoException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebhookEventVerifierTest {

    String webhookToken = "_ABC123abc123ABC123abc123ABC123_";
    WebhookEventVerifier verifier = new WebhookEventVerifier(webhookToken);

    String rawEvent = "{\"payload\":{\"resource_type\":\"check\",\"action\":\"check.completed\",\"object\":{\"id\":\"check-123\",\"status\":\"complete\",\"completed_at_iso8601\":\"2020-01-01T00:00:00Z\",\"href\":\"https://api.onfido.com/v3/checks/check-123\"}}}";

    WebhookEvent expectedEvent;

    @BeforeMethod
    public void setup() {
        WebhookObject object = new WebhookObject(
                "check-123",
                "complete",
                "https://api.onfido.com/v3/checks/check-123",
                "2020-01-01T00:00:00Z"
        );

        expectedEvent = new WebhookEvent(
                "check",
                "check.completed",
                object
        );
    }

    @Test
    public void readValidPayload() throws OnfidoException {
        String signature = "a0082d7481f9f0a2907583dbe1f344d6d4c0d9989df2fd804f98479f60cd760e";

        WebhookEvent event = verifier.readPayload(rawEvent, signature);

        Assert.assertEquals(expectedEvent, event);
    }

    @Test
    public void readInvalidPayload() throws OnfidoException {
        try {
            String signature = "b0082d7481f9f0a2907583dbe1f344d6d4c0d9989df2fd804f98479f60cd760e";

            verifier.readPayload(rawEvent, signature);

            Assert.fail();
        } catch (OnfidoException ex) {
            Assert.assertEquals(ex.getMessage(), "Invalid signature for webhook event");
        }
    }
}
