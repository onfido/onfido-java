package com.onfido.integration;

import static com.onfido.model.ReportStatus.COMPLETE;

import com.onfido.model.*;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReportSchemasTest extends TestBase {
  private Applicant applicant;
  private Document document;

  @BeforeEach
  public void setup() throws Exception {
    applicant = createApplicant();
    document = uploadDocument(applicant, "sample_driving_licence.png", "driving_licence");
  }

  @Test
  public void schemaOfDocumentReportIsValid() throws Exception {
    Check check =
        createCheck(
            applicant,
            document,
            new CheckBuilder().reportNames(Arrays.asList(ReportName.DOCUMENT)));

    DocumentReport documentReport =
        (DocumentReport)
            repeatRequestUntilStatusChanges(
                "findReport", new Object[] {check.getReportIds().get(0)}, COMPLETE, 10, 1000);

    Assertions.assertEquals(COMPLETE, documentReport.getStatus());
    Assertions.assertEquals(ReportName.DOCUMENT, documentReport.getName());
    Assertions.assertEquals(check.getId(), documentReport.getCheckId());
    Assertions.assertNotNull(documentReport.getBreakdown());
    Assertions.assertNotNull(documentReport.getProperties());
    Assertions.assertNotNull(documentReport.getResult());
    Assertions.assertNotNull(documentReport.getSubResult());
  }

  @Test
  public void schemaOfFacialSimilarityPhotoReportIsValid() throws Exception {
    uploadLivePhoto(applicant, "sample_photo.png");

    Check check =
        createCheck(
            applicant,
            document,
            new CheckBuilder()
                .reportNames(Arrays.asList(ReportName.FACIAL_SIMILARITY_PHOTO_FULLY_AUTO)));

    FacialSimilarityPhotoFullyAutoReport facialSimilarityPhotoFullyAutoReport =
        (FacialSimilarityPhotoFullyAutoReport)
            repeatRequestUntilStatusChanges(
                "findReport", new Object[] {check.getReportIds().get(0)}, COMPLETE, 10, 1000);

    Assertions.assertEquals(COMPLETE, facialSimilarityPhotoFullyAutoReport.getStatus());
    Assertions.assertEquals(
        ReportName.FACIAL_SIMILARITY_PHOTO_FULLY_AUTO,
        facialSimilarityPhotoFullyAutoReport.getName());
    Assertions.assertEquals(check.getId(), facialSimilarityPhotoFullyAutoReport.getCheckId());
    Assertions.assertNotNull(facialSimilarityPhotoFullyAutoReport.getBreakdown());
    Assertions.assertNotNull(facialSimilarityPhotoFullyAutoReport.getResult());
    Assertions.assertNotNull(facialSimilarityPhotoFullyAutoReport.getProperties());
  }
}
