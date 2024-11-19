package com.onfido.integration;

import com.onfido.ApiException;
import com.onfido.FileTransfer;
import com.onfido.model.Applicant;
import com.onfido.model.Document;
import com.onfido.model.Document.FileTypeEnum;
import com.onfido.model.DocumentTypes;
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
    document =
        uploadDocument(applicant, "sample_driving_licence.png", DocumentTypes.DRIVING_LICENCE);
  }

  @Test
  public void uploadDocumentTest() throws Exception {
    Assertions.assertEquals("sample_driving_licence.png", document.getFileName());

    Assertions.assertNotNull(document.toJson());
  }

  @Test
  public void downloadDocumentTest() throws Exception {
    FileTransfer download = onfido.downloadDocument(document.getId());

    Assertions.assertEquals("image/png", download.getContentType());
    Assertions.assertTrue(download.getFilename() != null);
    Assertions.assertTrue(download.getByteArray().length > 0);
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
    Assertions.assertNotNull(lookupDocument.toJson());
  }

  @Test
  public void listDocumentsTest() throws Exception {
    uploadDocument(applicant, "another_sample_driving_licence.jpeg", DocumentTypes.UNKNOWN);

    List<Document> documents =
        onfido.listDocuments(applicant.getId()).getDocuments().stream()
            .sorted(Comparator.comparing(Document::getFileName))
            .collect(Collectors.toList());

    Assertions.assertEquals("another_sample_driving_licence.jpeg", documents.get(0).getFileName());
    Assertions.assertEquals(FileTypeEnum.JPEG, documents.get(0).getFileType());
    Assertions.assertEquals(DocumentTypes.UNKNOWN, documents.get(0).getType());

    Assertions.assertEquals("sample_driving_licence.png", documents.get(1).getFileName());
    Assertions.assertEquals(FileTypeEnum.PNG, documents.get(1).getFileType());
    Assertions.assertEquals(DocumentTypes.DRIVING_LICENCE, documents.get(1).getType());

    Assertions.assertNotNull(documents.get(0).toJson());
    Assertions.assertNotNull(documents.get(1).toJson());
  }

  @Test
  public void nullParamRequestTest() throws Exception {
    try {
      onfido.uploadDocument(null, null, null, "file.png", null, null, null, null);
      Assertions.fail();
    } catch (ApiException ex) {
      Assertions.assertEquals(0, ex.getCode());
    }
  }
}
