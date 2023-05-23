package com.onfido.integration;

import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;

import com.onfido.Onfido;
import com.onfido.Onfido.Builder;
import com.onfido.JsonObject;
import com.onfido.exceptions.OnfidoException;
import com.onfido.exceptions.ApiException;

import com.onfido.models.Applicant;
import com.onfido.models.Check;
import com.onfido.models.Document;
import com.onfido.models.Location;
import com.onfido.models.Webhook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import org.testng.annotations.AfterTest;
import org.testng.SkipException;

public class TestBase {

  static private String apiToken = System.getenv("ONFIDO_API_TOKEN");
  static protected String sampleApplicantId = System.getenv("ONFIDO_SAMPLE_APPLICANT_ID");

  private Onfido.Builder builder = Onfido.builder();
  protected Onfido onfido;

  private MockWebServer server;
  private String request;

  public TestBase() {
    if (!isMockingEnabled()) {
      onfido = builder.apiToken(apiToken).regionEU().build();
    }
  }

  @AfterTest
  private void tearDownAndCleanUp() throws IOException, OnfidoException {
    if (isMockingEnabled() && server != null) {
      server.shutdown();
    }

    cleanUpApplicants();
    cleanUpWebhooks();
  }

  static protected boolean isMockingEnabled() {
    return apiToken == null || "".equals(apiToken);
  }

  protected void skipTestIfMockingNotEnabled() {
    if (!isMockingEnabled()) {
      throw new SkipException("Skipping test because mocking is not enabled.");
     }
  }

  protected void prepareMock(String content, String contentType, int status) throws IOException {
    if (isMockingEnabled()) {
      server = new MockWebServer();
      MockResponse mockResponse = new MockResponse().setBody(content);

      if (contentType != null) {
        mockResponse.addHeader("content-type", contentType);
      }

      if (status > 0) {
        mockResponse.setResponseCode(status);
      }

      server.enqueue(mockResponse);
      server.start();

      onfido = builder.apiToken("token").unknownApiUrl(server.url("/").toString()).build();
    }
  }

  protected void prepareMock(JsonObject content) throws IOException {
    prepareMock(content.toJson(), null, 0);
  }

  protected void takeRequest(String path) throws InterruptedException {
    if (isMockingEnabled()) {
      RecordedRequest recordedRequest = server.takeRequest();
      request = recordedRequest.getBody().readUtf8();
      assertEquals(path, recordedRequest.getPath());
    }
  }

  public Applicant createApplicant(String first_name) throws IOException, InterruptedException, OnfidoException {
    prepareMock(new JsonObject().add("first_name", first_name)
                                .add("last_name", "Last")
                                .add("id", UUID.randomUUID().toString()));

    Applicant applicant = onfido.applicant.create(Applicant.request().firstName(first_name)
                                                                     .lastName("Last")
                                                                     .location(Location.request()
                                                                        .ipAddress("127.0.0.1")
                                                                        .countryOfResidence("GBR")));

    takeRequest("/applicants/");

    return applicant;
  }

  public Applicant createApplicant() throws IOException, InterruptedException, OnfidoException {
    return createApplicant("First");
  }

  protected Document uploadDocument(Document.Request documentRequest, String filename) throws IOException, InterruptedException, OnfidoException {
    prepareMock(new JsonObject().add("file_name", filename)
                                .add("id", UUID.randomUUID().toString()));

    File file = new File("media/sample_driving_licence.png");
    InputStream inputStream = new FileInputStream(file);

    Document document = onfido.getDocumentManager().upload(inputStream, filename, documentRequest);

    takeRequest("/documents/");

    return document;
  }

  protected Document uploadDocument(Applicant applicant, String filename) throws IOException, InterruptedException, OnfidoException {

    Location.Request locationRequest =
    Location.request()
        .ipAddress("127.0.0.1")
        .countryOfResidence("GBR");

    Document.Request documentRequest =
        Document.request()
            .applicantId(applicant.getId())
            .issuingCountry("USA")
            .side("front")
            .type("passport")
            .location(locationRequest);

    return uploadDocument(documentRequest, filename);
  }

  protected Check createCheck( Applicant applicant, Document document, Check.Request request ) throws IOException, InterruptedException, OnfidoException {
    prepareMock(new JsonObject().add("applicant_id", applicant.getId())
                                .add("webhook_ids", null)
                                .add("privacy_notices_read_consent_given", true)
                                .add("report_ids", Arrays.asList("report_id1", "report_id2")));

    Check check = onfido.check.create(request.applicantId(applicant.getId())
                                             .reportNames( Arrays.asList("document", "identity_enhanced"))
                                             .documentIds(document.getId())
                                             .privacyNoticesReadConsentGiven(true));

    takeRequest("/checks/");

    return check;
  }

  private boolean isAValidUuid( String uuid )
  {
    return uuid != null && uuid.length() == 36;
  }

  public void cleanUpApplicants() throws IOException, OnfidoException {
    // Don't perform any clean-up when mocking is enabled or sample applicant id is not valid
    if ( isMockingEnabled() && !isAValidUuid(sampleApplicantId) ) {
      return;
    }

    for (Applicant applicant : onfido.applicant.list(1, 100, false)) {
      if ( ! applicant.getId().equals(sampleApplicantId) ) {
        try {
          onfido.applicant.delete(applicant.getId());
        } catch (ApiException e)
        {
          // Just ignore any failure during clean up
        }
      }
    }
  }

  public void cleanUpWebhooks() throws IOException, OnfidoException {
    // Don't perform any clean-up when mocking is enabled
    if ( isMockingEnabled() ) {
      return;
    }

    for (Webhook webhook : onfido.getWebhookManager().list()) {
      onfido.getWebhookManager().delete(webhook.getId());
    }
  }

  protected void assertRequestField(String field, String expectedValue) {
    if (isMockingEnabled()) {
      assertEquals(expectedValue, JsonObject.parse(request).get(field));
    }
  }

  protected void assertRequestField(String field, Boolean expectedValue) {
    if (isMockingEnabled()) {
      assertEquals(expectedValue, JsonObject.parse(request).get(field));
    }
  }

  protected void assertRequestField(String field, List<String> expectedValue) {
    if (isMockingEnabled()) {
      assertEquals(expectedValue, JsonObject.parse(request).get(field));
    }
  }

  protected void assertRequestBodyContains(String value) {
    if (isMockingEnabled()) {
      assertTrue(request.contains(value));
    }
  }
}
