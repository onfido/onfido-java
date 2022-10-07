package com.onfido.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.onfido.JsonObject;
import com.onfido.Onfido;

import com.onfido.models.Applicant;
import com.onfido.models.SdkToken;

import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.Test;

public class SdkTokenManagerTest extends TestBase {

  @Test
  public void generateTokenTest() throws Exception {
    Applicant applicant = createApplicant();

    prepareMock(new JsonObject().add("token", "123"));

    String token = onfido.sdkToken.generate(
      SdkToken.request().applicantId(applicant.getId())
                        .referrer("https://*.example.com/example_page/*"));

    takeRequest("/sdk_token/");

    assertTrue(token.length() > 0);
  }
}
