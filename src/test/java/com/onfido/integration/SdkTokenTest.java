package com.onfido.integration;

import com.onfido.model.Applicant;
import com.onfido.model.SdkToken;
import com.onfido.model.SdkTokenBuilder;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SdkTokenTest extends TestBase {

  @Test
  public void generateTokenTest() throws Exception {
    Applicant applicant = createApplicant();

    SdkToken token =
        onfido.generateSdkToken(
            new SdkTokenBuilder()
                .applicantId(applicant.getId())
                .referrer("https://*.example.com/example_page/*"));

    Assertions.assertTrue(token.getToken().length() > 0);

    Assertions.assertNotNull(token.toJson());

    // Smoke test to detect any authentication issues
    java.net.URL url =
        new java.net.URL("https://api.onfido.com/v3.6/workflow_runs/" + UUID.randomUUID());
    java.net.HttpURLConnection connection = (java.net.HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    connection.setRequestProperty("Authorization", "Bearer " + token.getToken());
    connection.setRequestProperty("Content-Type", "application/json");

    Assertions.assertNotEquals(
        401, connection.getResponseCode(), "Authentication error occurred with the token");
  }
}
