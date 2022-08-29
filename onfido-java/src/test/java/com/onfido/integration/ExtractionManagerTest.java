package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Extraction;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.Test;
import java.time.LocalDate;

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

    @Test
    public void preformExtractionWhenJsonDateOfBirthOrDateOfExpiryIsNullThenSetNull() throws Exception {
        String response = new JsonObject()
                .add("document_id", "id")
                .add("extracted_data", new JsonObject()
                        .add("date_of_birth", null)
                        .add("date_of_expiry", null))
                .toJson();

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
        assertEquals(null, extraction.getExtractedData().getDateOfBirth());
        assertEquals(null, extraction.getExtractedData().getDateOfExpiry());
    }

    @Test
    public void preformExtractionWhenJsonDateOfBirthOrDateOfExpiryIsEmptyThenSetNull() throws Exception {
        String response = new JsonObject()
                .add("document_id", "id")
                .add("extracted_data", new JsonObject()
                        .add("date_of_birth", "")
                        .add("date_of_expiry", ""))
                .toJson();

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
        assertEquals(null, extraction.getExtractedData().getDateOfBirth());
        assertEquals(null, extraction.getExtractedData().getDateOfExpiry());
    }

    @Test
    public void preformExtractionWithAdditionalFields() throws Exception {
        String response = new JsonObject()
                .add("document_id", "id")
                .add("document_classification", new JsonObject()
                        .add("document_type", "national_identity_card")
                        .add("issuing_country", "USA")
                        .add("subtype", "subtype")
                        .add("version", "2022"))
                .add("extracted_data", new JsonObject()
                        .add("spouse_name", "Spouse name")
                        .add("widow_name", "Widow name")
                        .add("alias_name", "Alias name")
                        .add("date_of_birth", "2000-08-30")
                        .add("date_of_expiry", "2024-08-30")
                        .add("expiry_date", "2024-08-30")
                        .add("issuing_authority", "auth01")
                        .add("document_type", "national_identity_card")
                        .add("issuing_state", "CA")
                        .add("issuing_country", "USA")
                        .add("issuing_date", "2014-08-30")
                        .add("personal_number", "20-10563145-8")
                        .add("place_of_birth", "San Francisco"))
                .toJson();

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

        // Check response body
        assertEquals("id", extraction.getDocumentId());

        // Check response body: document classification
        assertEquals("national_identity_card", extraction.getDocumentClassification().getDocumentType());
        assertEquals("USA", extraction.getDocumentClassification().getIssuingCountry());
        assertEquals("subtype", extraction.getDocumentClassification().getSubtype());
        assertEquals("2022", extraction.getDocumentClassification().getVersion());

        // Check response body: extracted data
        assertEquals("Spouse name", extraction.getExtractedData().getSpouseName());
        assertEquals("Widow name", extraction.getExtractedData().getWidowName());
        assertEquals("Alias name", extraction.getExtractedData().getAliasName());
        assertEquals(LocalDate.of(2000, 8, 30), extraction.getExtractedData().getDateOfBirth());
        assertEquals(LocalDate.of(2024, 8, 30), extraction.getExtractedData().getDateOfExpiry());
        assertEquals(LocalDate.of(2024, 8, 30), extraction.getExtractedData().getExpiryDate());
        assertEquals("auth01", extraction.getExtractedData().getIssuingAuthority());
        assertEquals("national_identity_card", extraction.getExtractedData().getDocumentType());
        assertEquals("CA", extraction.getExtractedData().getIssuingState());
        assertEquals("USA", extraction.getExtractedData().getIssuingCountry());
        assertEquals(LocalDate.of(2014, 8, 30), extraction.getExtractedData().getIssuingDate());
        assertEquals("20-10563145-8", extraction.getExtractedData().getPersonalNumber());
        assertEquals("San Francisco", extraction.getExtractedData().getPlaceOfBirth());
    }

}
