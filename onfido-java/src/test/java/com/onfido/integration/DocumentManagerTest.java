package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.exceptions.ApiException;
import com.onfido.models.Document;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DocumentManagerTest extends ApiIntegrationTest{

    @Test
    public void uploadDocument() throws Exception {
        String response = new JsonObject()
                .add("file_name", "file.png")
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        InputStream inputStream = new ByteArrayInputStream("testing testing 1 2".getBytes());
        Document.Request documentRequest = Document.request().applicantId("test id").issuingCountry("USA").side("front").type("passport");
        Document document = onfido.document.upload(inputStream, "file.png", documentRequest);

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/documents/", request.getPath());

        // Correct request body
        String requestBody = request.getBody().readUtf8();
        Assert.assertTrue(requestBody.contains("applicant_id"));
        Assert.assertTrue(requestBody.contains("test id"));
        Assert.assertTrue(requestBody.contains("issuing_country"));
        Assert.assertTrue(requestBody.contains("USA"));
        Assert.assertTrue(requestBody.contains("side"));
        Assert.assertTrue(requestBody.contains("front"));
        Assert.assertTrue(requestBody.contains("type"));
        Assert.assertTrue(requestBody.contains("passport"));
        Assert.assertTrue(requestBody.contains("testing testing 1 2"));

        // Correct response body
        assertEquals("file.png", document.getFileName());
    }

    @Test
    public void downloadDocument() throws Exception{
        MockWebServer server = mockFileRequestResponse();

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        InputStream inputStream = onfido.document.download("document id").content;

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/documents/document%20id/download", request.getPath());

        // Correct response body
        assertTrue(inputStream != null);
    }

    @Test
    public void downloadError() throws Exception{
        MockWebServer server = mockErrorResponse("error");

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        try {
            onfido.document.download("document id");
            Assert.fail();
        } catch (ApiException ex) {
            Assert.assertEquals(403, ex.getStatusCode());
        }
    }
}
