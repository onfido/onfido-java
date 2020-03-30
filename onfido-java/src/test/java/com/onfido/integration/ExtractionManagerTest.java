package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Extraction;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class ExtractionManagerTest extends ApiIntegrationTest {

  @Test
  public void createExtraction() throws Exception {
    String response = new JsonObject().add("document_id", "id").toJson();

    MockWebServer server = mockRequestResponse(response);

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    Extraction extraction = onfido.extraction.create(Extraction.request().documentId("id"));

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/extractions/", request.getPath());

    // Correct response body
    assertEquals("id", extraction.getDocumentId());
  }

}
