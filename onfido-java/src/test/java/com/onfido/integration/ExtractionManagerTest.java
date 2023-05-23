package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Extraction;
import com.onfido.models.Applicant;
import com.onfido.models.Document;

import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

// Authored by akrasnoshchok

public class ExtractionManagerTest extends TestBase {
  private Applicant applicant;
  private Document document;

  @BeforeMethod
  public void setup() throws Exception {
    applicant = createApplicant();
    document = uploadDocument(applicant, "file.png");
  }

  @Test
  public void performExtractionTest() throws Exception {
    prepareMock(new JsonObject().add("document_id", document.getId())
                                .add("document_classification", new JsonObject()
                                  .add("document_type", "driving_licence")
                                  .add("issuing_country", "GBR"))
                                .add("extracted_data", new JsonObject()
                                  .add("date_of_birth", "1976-03-11")
                                  .add("date_of_expiry", "2031-05-28")));

    Extraction extraction = onfido.getExtractionManager().perform(document.getId());

    takeRequest("/extractions/");

    assertRequestField("document_id", document.getId());
    assertEquals(document.getId(), extraction.getDocumentId());
    assertEquals("driving_licence", extraction.getDocumentClassification().getDocumentType());
    assertEquals("GBR", extraction.getDocumentClassification().getIssuingCountry());
    assertEquals(LocalDate.of(1976, 3, 11), extraction.getExtractedData().getDateOfBirth());
    assertEquals(LocalDate.of(2031, 5, 28), extraction.getExtractedData().getDateOfExpiry());
  }

  @Test
  public void performExtractionWhenJsonDateOfBirthOrDateOfExpiryIsNullTest() throws Exception {
    skipTestIfMockingNotEnabled();

    prepareMock(new JsonObject().add("document_id", document.getId())
                                .add("extracted_data", new JsonObject()
                                  .add("date_of_birth", null)
                                  .add("date_of_expiry", null)));

    Extraction extraction = onfido.getExtractionManager().perform(document.getId());

    takeRequest("/extractions/");

    assertRequestField("document_id", document.getId());
    assertEquals(document.getId(), extraction.getDocumentId());
    assertEquals(null, extraction.getExtractedData().getDateOfBirth());
    assertEquals(null, extraction.getExtractedData().getDateOfExpiry());
  }

  @Test
  public void performExtractionWhenJsonDateOfBirthOrDateOfExpiryIsEmptyTest() throws Exception {
    skipTestIfMockingNotEnabled();

    prepareMock(new JsonObject().add("document_id", document.getId())
                                .add("extracted_data", new JsonObject()
                                  .add("date_of_birth", "")
                                  .add("date_of_expiry", "")));

    Extraction extraction = onfido.getExtractionManager().perform(document.getId());

    takeRequest("/extractions/");

    assertRequestField("document_id", document.getId());
    assertEquals(document.getId(), extraction.getDocumentId());
    assertEquals(null, extraction.getExtractedData().getDateOfBirth());
    assertEquals(null, extraction.getExtractedData().getDateOfExpiry());
  }

  @Test
  public void performExtractionWithAdditionalFieldsTest() throws Exception {
    skipTestIfMockingNotEnabled();

    prepareMock(new JsonObject().add("document_id", document.getId())
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
                                    .add("place_of_birth", "San Francisco")));

    Extraction extraction = onfido.getExtractionManager().perform(document.getId());

    takeRequest("/extractions/");

    assertRequestField("document_id", document.getId());
    assertEquals(document.getId(), extraction.getDocumentId());

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
