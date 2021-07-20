package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.SdkToken;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.SocketPolicy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class OnfidoIntegrationTest {

  private final MockWebServer mockWebServer = new MockWebServer();

  @BeforeTest
  public void beforeEach() throws Exception {
    mockWebServer.start();
  }

  @AfterTest
  public void afterEach() throws Exception {
    mockWebServer.shutdown();
  }

  @Test(expectedExceptions = OnfidoException.class, timeOut = 1500L)
  public void setClientReadTimeout() throws Exception {
    String response = new JsonObject().add("token", "123").toJson();

    Onfido onfido = Onfido.builder()
            // Providing a 1 second read timeout
            .clientReadTimeout(Duration.ofSeconds(1L))
            .apiToken("token")
            .unknownApiUrl(mockWebServer.url("/").toString())
            .build();

    final MockResponse mockResponse = new MockResponse().setBody(response);
    mockResponse.socketPolicy(SocketPolicy.NO_RESPONSE);
    mockWebServer.enqueue(mockResponse);

    onfido.sdkToken.generate(SdkToken.request().applicantId("appId").referrer("refId"));
  }

  @Test
  public void setClientProxy() throws Exception {
    final MockWebServer proxyServer = new MockWebServer();

    try {
      proxyServer.start();

      String proxyServerResponse = new JsonObject().add("token", "123").toJson();

      Onfido onfido = Onfido.builder()
              // Make Onfido point to the proxy server.
              .clientProxy(proxyServer.toProxyAddress())
              .apiToken("token")
              .unknownApiUrl(mockWebServer.url("/").toString())
              .build();

      proxyServer.enqueue(new MockResponse().setBody(proxyServerResponse));

      String response = onfido.sdkToken.generate(SdkToken.request().applicantId("appId").referrer("refId"));

      assertEquals(response, "123");
    } finally {
      proxyServer.shutdown();
    }
  }
}
