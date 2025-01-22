package com.onfido;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.onfido.ApiClient.Region;
import com.onfido.api.DefaultApi;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OnfidoTest {
  ApiClient apiClient;

  @BeforeEach
  void init() {
    apiClient = new ApiClient();
  }

  @Test
  public void throwsExceptionForMissingApiToken() {
    ApiException thrown =
        assertThrows(
            ApiException.class,
            () ->
                new DefaultApi(apiClient)
                    .findApplicant(UUID.fromString("839d4812-7c49-4008-8d83-bbd7610f0fec")),
            "Expected to throw, but it didn't");

    assertTrue(thrown.getMessage().contains("authorization_error"));
  }

  @Test
  public void throwsExceptionForNullApiToken() {
    ApiException thrown =
        assertThrows(
            ApiException.class,
            () ->
                new DefaultApi(apiClient.setApiToken(null))
                    .findApplicant(UUID.fromString("839d4812-7c49-4008-8d83-bbd7610f0fec")),
            "Expected to throw, but it didn't");

    assertTrue(thrown.getMessage().contains("authorization_error"));
  }

  @Test
  public void usesDefaultRegionApiUrl() {
    DefaultApi onfido = new DefaultApi(apiClient.setApiToken("token"));
    Assertions.assertEquals("https://api.eu.onfido.com/v3.6", onfido.getApiClient().getBasePath());
  }

  @Test
  public void usesEURegionApiUrl() {
    DefaultApi onfido = new DefaultApi(apiClient.setRegion(Region.EU).setApiToken("token"));
    String url = onfido.getApiClient().buildUrl(null, "", null, null);

    Assertions.assertEquals("https://api.eu.onfido.com/v3.6", url);
  }

  @Test()
  public void usesUSRegionApiUrl() {
    DefaultApi onfido = new DefaultApi(apiClient.setRegion(Region.US).setApiToken("token"));
    String url = onfido.getApiClient().buildUrl(null, "", null, null);

    Assertions.assertEquals("https://api.us.onfido.com/v3.6", url);
  }

  @Test()
  public void usesCARegionApiUrl() {
    DefaultApi onfido = new DefaultApi(apiClient.setRegion(Region.CA).setApiToken("token"));
    String url = onfido.getApiClient().buildUrl(null, "", null, null);

    Assertions.assertEquals("https://api.ca.onfido.com/v3.6", url);
  }

  @Test()
  public void usesProxy() {
    Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 3128));
    DefaultApi onfido = new DefaultApi(apiClient.setApiToken("token").setProxy(proxy));

    Assertions.assertEquals(proxy, onfido.getApiClient().getProxy());
  }
}
