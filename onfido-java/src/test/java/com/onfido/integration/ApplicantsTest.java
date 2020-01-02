package com.onfido.integration;

import static org.junit.Assert.assertEquals;

import com.onfido.JsonObject;
import com.onfido.models.Applicant;

import org.testng.annotations.*;

import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

public class ApplicantsTest extends ApiIntegrationTest {
  @Test
  public void createApplicant() throws Exception {
    String response = new JsonObject()
      .add("first_name", "First")
      .toJson();

    MockWebServer server = mockRequestResponse(response);

    Applicant applicant = Applicant.request()
      .firstName("First")
      .create();

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/applicants/", request.getPath());

    // Correct request body
    String json = request.getBody().readUtf8();
    JsonObject jsonObject = JsonObject.parse(json);
    assertEquals("First", jsonObject.get("first_name"));

    // Correct response body
    assertEquals("First", applicant.getFirstName());
  }
}
