package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Webhook;

import java.util.List;

/**
 * Manager class for the Webhook resource type. Contains resource-specific methods for interacting with the API.
 */
public class WebhookManager extends ResourceManager {

    private ApiJson<Webhook> webhookParser = new ApiJson<>(Webhook.class);
    private ApiJson<Webhook.Request> requestParser = new ApiJson<>(Webhook.Request.class);

    /**
     * Instantiates a new WebhookManager.
     *
     * @param config the configuration for the parent Onfido object
     */
    public WebhookManager(Config config) {
        super("webhooks/", config);
    }

    /**
     * Registers a webhook.
     *
     * @param request the request body
     * @return the Webhook
     * @throws OnfidoException the onfido exception
     */
    public Webhook create(Webhook.Request request) throws OnfidoException {
        return webhookParser.parse(post("", requestParser.toJson(request)));
    }

    /**
     * Retrieves a single webhook.
     *
     * @param webhookId the webhook id
     * @return the Webhook
     * @throws OnfidoException the onfido exception
     */
    public Webhook find(String webhookId) throws OnfidoException {
        return webhookParser.parse(get(webhookId));
    }

    /**
     * Edits a webhook.
     *
     * @param webhookId the webhook id
     * @param request   the request body
     * @return the Webhook
     * @throws OnfidoException the onfido exception
     */
    public Webhook update(String webhookId, Webhook.Request request) throws OnfidoException {
        return webhookParser.parse(put(webhookId, requestParser.toJson(request)));
    }

    /**
     * Deletes a webhook. If successful, returns a 204 No Content response.
     *
     * @param webhookId the webhook id
     * @throws OnfidoException the onfido exception
     */
    public void delete(String webhookId) throws OnfidoException {
        deleteRequest(webhookId);
    }

    /**
     * Lists all webhooks you’ve created.
     *
     * @return the list of Webhooks
     * @throws OnfidoException the onfido exception
     */
    public List<Webhook> list() throws OnfidoException {
        return webhookParser.parseWrappedList(get(""), "webhooks");
    }
}
