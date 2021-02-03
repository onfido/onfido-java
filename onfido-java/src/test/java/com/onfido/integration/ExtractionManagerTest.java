package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Extraction;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

// Authored by akrasnoshchok

public class ExtractionManagerTest extends ApiIntegrationTest {

    @Test
    public void preformExtraction() throws Exception {
        String response = new JsonObject().add("document_id", "id").toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido =
                Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

        Extraction extraction = onfido.extraction.perform("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/extractions/", request.getPath());

        // Correct request body
        String json = request.getBody().readUtf8();
        JsonObject jsonObject = JsonObject.parse(json);
        assertEquals("id", jsonObject.get("document_id"));

        // Correct response body
        assertEquals("id", extraction.getDocumentId());
    }

}
