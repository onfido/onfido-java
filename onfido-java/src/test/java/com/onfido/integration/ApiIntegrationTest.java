package com.onfido.integration;

import java.io.IOException;
import com.onfido.Onfido;
import com.onfido.Onfido.Builder;
import com.onfido.JsonObject;

import static org.junit.Assert.assertEquals;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

class ApiIntegrationTest {

  private String apiToken = System.getenv("ONFIDO_API_TOKEN");
  private Onfido.Builder builder = Onfido.builder();
  protected Onfido onfido;

  private RecordedRequest request;
  private MockWebServer server;

  public ApiIntegrationTest() {
    if (!isMockingEnabled()) {
      onfido = builder.apiToken(apiToken).regionEU().build();
    }
  }

  @AfterTest
  private void tearDown() throws IOException {
    if (isMockingEnabled() && server != null) {
      server.shutdown();
    }
  }

  protected boolean isMockingEnabled() {
    return apiToken == null;
  }

  public void prepareMock(JsonObject mockedResponse) throws IOException {
    if (isMockingEnabled()) {
      server = new MockWebServer();
      server.enqueue(new MockResponse().setBody(mockedResponse.toJson()));
      server.start();

      onfido = builder.apiToken("token").unknownApiUrl(server.url("/").toString()).build();
    }
  }

  public void takeRequest(String path) throws java.lang.InterruptedException {
    if (isMockingEnabled()) {
      request = server.takeRequest();
      assertEquals(path, request.getPath());
    }
  }

  public void assertRequestField(String field, String expectedValue) {
    if (isMockingEnabled()) {
      String json = request.getBody().readUtf8();
      JsonObject jsonObject = JsonObject.parse(json);
      assertEquals(expectedValue, jsonObject.get(field));
    }
  }

  protected MockWebServer mockRequestResponse(String response) throws IOException {
    server = new MockWebServer();
    server.enqueue(new MockResponse().setBody(response));
    server.start();

    return server;
  }

  protected MockWebServer mockFileRequestResponse(String content, String type) throws IOException {
    server = new MockWebServer();
    server.enqueue(new MockResponse().setBody(content).addHeader("content-type", type));
    server.start();

    return server;
  }

  protected MockWebServer mockErrorResponse(String response) throws IOException {
    server = new MockWebServer();
    server.enqueue(new MockResponse().setBody(response).setResponseCode(403));
    server.start();

    return server;
  }
}
