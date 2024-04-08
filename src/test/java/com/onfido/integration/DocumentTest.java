package com.onfido.integration;

import com.onfido.ApiException;
import com.onfido.model.Applicant;
import com.onfido.model.Document;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentTest extends TestBase {
  private Applicant applicant;
  private Document document;

  @BeforeEach
  public void setupTest() throws Exception {
    applicant = createApplicant();
    document = uploadDocument(applicant, "sample_driving_licence.png", "driving_licence");
  }

  @Test
  public void uploadDocumentTest() throws Exception {
    Assertions.assertEquals("sample_driving_licence.png", document.getFileName());
  }

  @Test
  public void downloadDocumentTest() throws Exception {
    File download = onfido.downloadDocument(document.getId());

    Assertions.assertTrue(download.length() > 0);
  }

  @Test
  public void downloadErrorTest() throws Exception {
    try {
      onfido.downloadDocument(nonExistingId);
      Assertions.fail();
    } catch (ApiException ex) {
      Assertions.assertEquals(404, ex.getCode());
    }
  }

  @Test
  public void findDocumentTest() throws Exception {
    Document lookupDocument = onfido.findDocument(document.getId());

    Assertions.assertEquals("sample_driving_licence.png", lookupDocument.getFileName());
  }

  @Test
  public void listDocumentsTest() throws Exception {
    uploadDocument(applicant, "another_sample_driving_licence.png", "driving_licence");

    List<Document> documents =
        onfido.listDocuments(applicant.getId()).getDocuments().stream()
            .sorted(Comparator.comparing(Document::getFileName))
            .collect(Collectors.toList());

    Assertions.assertEquals("another_sample_driving_licence.png", documents.get(0).getFileName());
    Assertions.assertEquals("sample_driving_licence.png", documents.get(1).getFileName());
  }

  @Test
  public void nullParamRequestTest() throws Exception {
    // InputStream inputStream = new ByteArrayInputStream("testing testing 1 2".getBytes());

    try {
      onfido.uploadDocument(null, null, null, "file.png", null, null, null, null);
      Assertions.fail();
    } catch (ApiException ex) {
      Assertions.assertEquals(400, ex.getCode());
    }
  }
}
