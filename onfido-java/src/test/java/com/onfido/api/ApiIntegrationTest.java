package com.onfido.api;

import java.io.IOException;

import okio.Buffer;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

/**
 * The type Api integration test.
 */
class ApiIntegrationTest {
  private MockWebServer server;

    /**
     * Clear server.
     */
    @BeforeTest
  public void clearServer() {
    server = null;
  }

    /**
     * Shutdown server.
     *
     * @throws IOException the io exception
     */
    @AfterTest
  public void shutdownServer() throws IOException {
    if (server != null) {
      server.shutdown();
    }
  }

    /**
     * Mock request response mock web server.
     *
     * @param response the response
     * @return the mock web server
     * @throws IOException the io exception
     */
    protected MockWebServer mockRequestResponse(String response) throws IOException {
    server = new MockWebServer();
    server.enqueue(new MockResponse().setBody(response));
    server.start();

    return server;
  }

    /**
     * Mock file request response mock web server.
     *
     * @return the mock web server
     * @throws IOException the io exception
     */
    protected MockWebServer mockFileRequestResponse() throws IOException {
    Buffer buffer = new Buffer();
    buffer.writeInt(5);
    server = new MockWebServer();
    server.enqueue(new MockResponse().setBody(buffer));
    server.start();

    return server;
  }

    /**
     * Mock error response mock web server.
     *
     * @param response the response
     * @return the mock web server
     * @throws IOException the io exception
     */
    protected MockWebServer mockErrorResponse(String response) throws IOException {
    server = new MockWebServer();
    server.enqueue(new MockResponse().setBody(response).setResponseCode(403));
    server.start();

    return server;
  }
}
