package com.onfido.api;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okio.Buffer;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

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

    return server;
  }

  protected MockWebServer mockFileRequestResponse() throws IOException {
    Buffer buffer = new Buffer();
    buffer.writeInt(5);
    server = new MockWebServer();
    server.enqueue(new MockResponse().setBody(buffer));
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
