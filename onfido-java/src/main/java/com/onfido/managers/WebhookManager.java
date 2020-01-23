package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Webhook;

import java.util.List;

public class WebhookManager extends ResourceManager {

    private ApiJson<Webhook> webhookParser = new ApiJson<>(Webhook.class);
    private ApiJson<Webhook.Request> requestParser = new ApiJson<>(Webhook.Request.class);

    public WebhookManager(Config config) {
        super("webhooks/", config);
    }

    public Webhook create(Webhook.Request request) throws OnfidoException {
        return webhookParser.parse(post("", requestParser.toJson(request)));
    }

    public Webhook find(String webhookId) throws OnfidoException {
        return webhookParser.parse(get(webhookId));
    }

    public Webhook update(String webhookId, Webhook.Request request) throws OnfidoException {
        return webhookParser.parse(put(webhookId, requestParser.toJson(request)));
    }

    public void delete(String webhookId) throws OnfidoException {
        deleteRequest(webhookId);
    }

    public List<Webhook> list() throws OnfidoException {
        return webhookParser.parseWrappedList(get(""), "webhooks");
    }
}
