package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.SdkToken;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class SdkTokenManagerTest extends ApiIntegrationTest {

  @Test
  public void generateTest() throws Exception {
    String response = new JsonObject().add("token", "123").toJson();

    MockWebServer server = mockRequestResponse(response);

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    String token =
        onfido.sdkToken.generate(SdkToken.request().applicantId("appId").referrer("refId"));

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/sdk_token/", request.getPath());

    // Correct response body
    assertEquals("123", token);
  }
}
