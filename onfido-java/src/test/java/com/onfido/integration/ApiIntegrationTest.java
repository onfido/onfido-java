package com.onfido.integration;

import java.io.IOException;

import com.onfido.RequestOptions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

class ApiIntegrationTest {
  private MockWebServer server;

  @BeforeTest
  public void clearServer() {
    server = null;
  }

  @AfterTest
  public void shutdownServer() throws IOException {
    if (server != null) {
      server.shutdown();
    }
  }

  protected MockWebServer mockRequestResponse(String response) throws IOException {
    server = new MockWebServer();
    server.enqueue(new MockResponse().setBody(response));
    server.start();

    RequestOptions options = RequestOptions.builder()
      .unknownApiUrl(server.url("").toString())
      .build();

    RequestOptions.setDefaults(options);

    return server;
  }
}
