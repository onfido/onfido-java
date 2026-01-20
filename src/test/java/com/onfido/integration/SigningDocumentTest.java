package com.onfido.integration;

import com.onfido.ApiException;
import com.onfido.FileTransfer;
import com.onfido.model.Applicant;
import com.onfido.model.SigningDocument;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SigningDocumentTest extends TestBase {
  private Applicant applicant;
  private SigningDocument signingDocument;

  @BeforeEach
  public void setupTest() throws Exception {
    applicant = createApplicant();
    signingDocument = uploadSigningDocument(applicant, "sample_signing_document.pdf");
  }

  @Test
  public void uploadSigningDocumentTest() {
    Assertions.assertEquals("sample_signing_document.pdf", signingDocument.getFileName());
    Assertions.assertEquals("pdf", signingDocument.getFileType());
    Assertions.assertEquals(applicant.getId(), signingDocument.getApplicantId());
    Assertions.assertNotNull(signingDocument.getHref());
    Assertions.assertNotNull(signingDocument.getDownloadHref());
    Assertions.assertTrue(signingDocument.getFileSize() > 0);
    Assertions.assertNotNull(signingDocument.toJson());
  }

  @Test
  public void downloadSigningDocumentTest() throws Exception {
    FileTransfer download = onfido.downloadSigningDocument(signingDocument.getId());

    Assertions.assertEquals("application/pdf", download.getContentType());
    Assertions.assertNotNull(download.getFilename());
    Assertions.assertEquals("%PDF", new String(download.getByteArray(), 0, 4));
    Assertions.assertTrue(download.getByteArray().length > 0);
  }

  @Test
  public void findSigningDocumentTest() throws Exception {
    SigningDocument found = onfido.findSigningDocument(signingDocument.getId());

    Assertions.assertEquals(signingDocument.getId(), found.getId());
    Assertions.assertEquals("sample_signing_document.pdf", found.getFileName());
    Assertions.assertEquals("pdf", found.getFileType());
    Assertions.assertEquals(applicant.getId(), found.getApplicantId());
    Assertions.assertNotNull(found.getDownloadHref());
    Assertions.assertNotNull(found.toJson());
  }

  @Test
  public void listSigningDocumentsTest() throws Exception {
    List<SigningDocument> documents =
      onfido.listSigningDocuments(applicant.getId()).getSigningDocuments();

    Assertions.assertNotNull(documents);
    Assertions.assertTrue(
        documents.stream().anyMatch(d -> d.getId().equals(signingDocument.getId())));
  }

  @Test
  public void uploadSigningDocumentNullParamsTest() {
    try {
      onfido.uploadSigningDocument(null, null);
      Assertions.fail();
    } catch (ApiException ex) {
      Assertions.assertEquals(0, ex.getCode());
    }
  }

  @Test
  public void downloadSigningDocumentErrorTest() {
    try {
      onfido.downloadSigningDocument(nonExistingId);
      Assertions.fail();
    } catch (ApiException ex) {
      Assertions.assertEquals(404, ex.getCode());
    }
  }
}
