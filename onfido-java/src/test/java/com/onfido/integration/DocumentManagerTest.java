package com.onfido.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.api.FileDownload;
import com.onfido.exceptions.ApiException;

import com.onfido.models.Applicant;
import com.onfido.models.Document;
import com.onfido.models.Location;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DocumentManagerTest extends TestBase {
  private Applicant applicant;
  private Document document;

  @BeforeMethod
  public void setupTest() throws Exception {
    applicant = createApplicant();
    document = uploadDocument(applicant, "file.png");
  }

  @Test
  public void uploadDocumentTest() throws Exception {
    assertRequestBodyContains("applicant_id");
    assertRequestBodyContains(applicant.getId());
    assertRequestBodyContains("issuing_country");
    assertRequestBodyContains("USA");
    assertRequestBodyContains("side");
    assertRequestBodyContains("front");
    assertRequestBodyContains("type");
    assertRequestBodyContains("passport");
    assertRequestBodyContains("{\"country_of_residence\":\"GBR\",\"ip_address\":\"127.0.0.1\"}");

    assertEquals("file.png", document.getFileName());
  }

  @Test
  public void downloadDocumentTest() throws Exception {
    prepareMock("test", "image/png", 0);

    FileDownload download = onfido.getDocumentManager().download(document.getId());

    takeRequest("/documents/" + document.getId() + "/download");

    assertTrue(download.content.length > 0);
    assertEquals("image/png", download.contentType);
  }

  @Test
  public void downloadErrorTest() throws Exception {
    prepareMock("error", null, 400);

    try {
      onfido.getDocumentManager().download("document-id");
      Assert.fail();
    } catch (ApiException ex) {
      takeRequest("/documents/document-id/download");
      Assert.assertEquals(400, ex.getStatusCode());
    }
  }

  @Test
  public void findDocumentTest() throws Exception {
    prepareMock(new JsonObject().add("file_name", document.getFileName()));

    Document lookupDocument = onfido.getDocumentManager().find(document.getId());

    takeRequest("/documents/" + document.getId());

    assertEquals("file.png", lookupDocument.getFileName());
  }

  @Test
  public void listDocumentsTest() throws Exception {
    Document anotherDocument = uploadDocument(applicant, "anotherFile.png");

    prepareMock(new JsonObject().add(
                    "documents",
                    Arrays.asList(
                        new JsonObject().add("file_name", "anotherFile.png").map,
                        new JsonObject().add("file_name", "file.png").map)));

    List<Document> documents = onfido.getDocumentManager().list(applicant.getId()).stream()
                                              .sorted(Comparator.comparing(Document::getFileName))
                                              .collect(Collectors.toList());

    takeRequest("/documents/?applicant_id=" + applicant.getId());

    assertEquals("anotherFile.png", documents.get(0).getFileName());
    assertEquals("file.png", documents.get(1).getFileName());
  }

  @Test
  public void nullParamRequestTest() throws Exception {
    prepareMock("error", null, 400);

    InputStream inputStream = new ByteArrayInputStream("testing testing 1 2".getBytes());

    try {
      onfido.getDocumentManager().upload(inputStream, "file.png", Document.request());
      Assert.fail();
    } catch (ApiException ex) {
      takeRequest("/documents/");
      Assert.assertEquals(400, ex.getStatusCode());
    }
  }
}
