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

    protected ExtractionManager(Config config, OkHttpClient client) {
        super("extractions/", config, client);
    }

    /**
     * Initiates an extraction for a document.
     *
     * @param document_id the unique identifier of the uploaded document to run extraction on
     * @return the Extraction
     * @throws OnfidoException the onfido exception
     */
    public Extraction perform(String document_id) throws OnfidoException {
        return extractionParser.parse(post("", String.format("{ \"document_id\": \"%s\" }", document_id)));
    }

}
