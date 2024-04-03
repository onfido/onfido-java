package com.onfido.integration;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.onfido.model.Applicant;
import com.onfido.model.CountryCodes;
import com.onfido.model.Document;
import com.onfido.model.DocumentTypes;
import com.onfido.model.ExtractRequest;
import com.onfido.model.Extraction;
import com.onfido.model.ExtractionDocumentClassification;
import com.onfido.model.ExtractionExtractedData;
import com.onfido.model.ExtractionExtractedData.GenderEnum;

// Authored by akrasnoshchok

public class ExtractionTest extends TestBase {
  private Applicant applicant;

  @BeforeEach
  public void setup() throws Exception {
    applicant = createApplicant();
  }

  @Test
  public void performExtractionTest() throws Exception {

    Document document = uploadDocument(applicant, "sample_driving_licence.png", "driving_licence");
    Extraction extraction = onfido.extract(new ExtractRequest().documentId(document.getId()));

    Assertions.assertEquals(document.getId(), extraction.getDocumentId());

    ExtractionDocumentClassification documentClassification = extraction.getDocumentClassification();
    ExtractionExtractedData extractedData = extraction.getExtractedData();

    // Check response body: document classification
    Assertions.assertNotNull(documentClassification);
    Assertions.assertEquals(DocumentTypes.DRIVING_LICENCE, documentClassification.getDocumentType());
    Assertions.assertEquals(CountryCodes.GBR, documentClassification.getIssuingCountry());

    // Check response body: extracted data
    Assertions.assertNotNull(extractedData);
    Assertions.assertEquals(LocalDate.of(1976, 3, 11), extractedData.getDateOfBirth());
    Assertions.assertEquals(LocalDate.of(2031, 5, 28), extractedData.getDateOfExpiry());
    Assertions.assertEquals("200407512345", extractedData.getDocumentNumber());
    Assertions.assertEquals("SARAH", extractedData.getFirstName());
    Assertions.assertEquals("MORGAN", extractedData.getLastName());
    Assertions.assertEquals(GenderEnum.FEMALE, extractedData.getGender());
  }
}