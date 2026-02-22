package com.onfido;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.onfido.ApiClient.Region;
import com.onfido.api.DefaultApi;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
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
                    .findApplicant(UUID.fromString("839d4812-7c49-4008-8d83-bbd7610f0fec"))
                    .execute(),
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
                    .findApplicant(UUID.fromString("839d4812-7c49-4008-8d83-bbd7610f0fec"))
                    .execute(),
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

  @Test
  public void throwsExceptionWhenDisablingSslVerification() {
    IllegalStateException thrown =
        assertThrows(
            IllegalStateException.class,
            () -> apiClient.setVerifyingSsl(false),
            "Expected IllegalStateException when disabling SSL verification");

    assertTrue(
        thrown.getMessage().contains("SSL verification cannot be disabled for security reasons"));
    assertTrue(thrown.getMessage().contains("man-in-the-middle attacks"));
    assertTrue(thrown.getMessage().contains("setSslCaCert"));
  }

  @Test
  public void allowsEnablingSslVerification() {
    // This should not throw any exception
    apiClient.setVerifyingSsl(true);
    assertTrue(apiClient.isVerifyingSsl());
  }

  @Test
  public void allowsSettingCustomSslCaCert() throws Exception {
    // Test setting SSL CA cert to null (reset to default)
    apiClient.setSslCaCert(null);
    Assertions.assertNull(apiClient.getSslCaCert());

    // Use a real valid self-signed certificate generated with OpenSSL
    String validSelfSignedCert =
        "-----BEGIN CERTIFICATE-----\n"
            + "MIIDFzCCAf+gAwIBAgIURIF4y3TLRDiHV1hMeGbUsr1/VUgwDQYJKoZIhvcNAQEL\n"
            + "BQAwGzEZMBcGA1UEAwwQdGVzdC5leGFtcGxlLmNvbTAeFw0yNTA4MjExMjI5NTFa\n"
            + "Fw0yNjA4MjExMjI5NTFaMBsxGTAXBgNVBAMMEHRlc3QuZXhhbXBsZS5jb20wggEi\n"
            + "MA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQC67oWn1WnTjWL9QUekOU/qu1O3\n"
            + "Zop0pmJiCW5JnA1RpwULyQlEyFIrlGfZvL3Jiysla2rjkQrLfz+zIg79mK9gaszq\n"
            + "8rdt7toLwGxAevYkZBPO0kAo1TSVNNbQsAGJedtcAQunsbWib1ARXp5yEKhjll0t\n"
            + "pIOeGcbC9OfuCfx8FMEx92qKEhdDvjiUBVb4hIFqbpPIPHA8tdBiWIYtRrahdcyO\n"
            + "ZNIGL2fzqUQQDVmIfaQP7i3g4FV0xljqcH9TehwrrQJNBnr52d2Rz3RYfgkEF1uY\n"
            + "22Vizi98c7/0Tm8mFZY+adH6QObwd7YMoLmDFSGJ7g3caMpUgj98rTvsLWU3AgMB\n"
            + "AAGjUzBRMB0GA1UdDgQWBBQYNjWfqrH6+mTK0BLMzs9hg0AUrTAfBgNVHSMEGDAW\n"
            + "gBQYNjWfqrH6+mTK0BLMzs9hg0AUrTAPBgNVHRMBAf8EBTADAQH/MA0GCSqGSIb3\n"
            + "DQEBCwUAA4IBAQBzJePL3aXomAy09RlQUIpKLPl0/NbB8QKPGYgGVNA6ARFLUoFF\n"
            + "wptxWqnnwspBec2Va4bIxBuv3D+hI2PFyGsnTvzDGKdBPOqHfuOUBCjfqe46Ylkm\n"
            + "KvO6BJMrX5CNREh5E9S8kz7k6NG5IzBI8TJFUrLi7akr2RqsYPYVmSFnQzQ9lAHo\n"
            + "BuEN5hUzqIRAk9iBMTM017jqRDATvxON4txBfn6kW8jT0QRURQ6L0k1d2ys6btjx\n"
            + "tRIWBC/t8VoGoD6ToruBqx2v2mnrOtGqaDg5DYUqnG43feKgnk0Vtm/IrR2/sTkE\n"
            + "Tnd76Tj7k8hP6sbcRKBSzlcysF+zsokYXVlU\n"
            + "-----END CERTIFICATE-----";

    InputStream testCertStream = new ByteArrayInputStream(validSelfSignedCert.getBytes());

    // This should not throw any exception with a valid certificate
    apiClient.setSslCaCert(testCertStream);

    // Verify the cert was set
    Assertions.assertNotNull(apiClient.getSslCaCert());

    // Verify SSL is still enabled after setting custom cert
    assertTrue(apiClient.isVerifyingSsl());
  }

  @Test
  public void sslCaCertMethodsWorkTogether() {
    // Test that setting SSL CA cert and enabling SSL verification work together
    apiClient.setSslCaCert(null); // Reset to default
    apiClient.setVerifyingSsl(true); // Should work fine

    // Both should complete without throwing exceptions
    assertTrue(apiClient.isVerifyingSsl());
    Assertions.assertNull(apiClient.getSslCaCert());
  }
}
