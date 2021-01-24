package com.onfido;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Extraction;
import okhttp3.OkHttpClient;

/**
 * Manager class for the Extraction resource type. Contains resource-specific methods for interacting
 * with the API.
 *
 * Authored by akrasnoshchok
 */
public class ExtractionManager extends ResourceManager {
    private ApiJson<Extraction> extractionParser = new ApiJson<>(Extraction.class);
    private ApiJson<Extraction.Request> requestFormatter = new ApiJson<>(Extraction.Request.class);

    protected ExtractionManager(Config config, OkHttpClient client) {
        super("extractions/", config, client);
    }

    /**
     * Initiates an extraction for a document.
     *
     * @param request the request body
     * @return the Extraction
     * @throws OnfidoException the onfido exception
     */
    public Extraction create(Extraction.Request request) throws OnfidoException {
        return extractionParser.parse(post("", requestFormatter.toJson(request)));
    }

}