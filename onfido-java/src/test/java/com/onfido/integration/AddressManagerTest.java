package com.onfido.integration;

import static org.junit.Assert.assertEquals;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Address;
import java.util.Arrays;
import java.util.List;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.Test;

public class AddressManagerTest extends ApiIntegrationTest {

  @Test
  public void pickTest() throws Exception {
    String response =
        new JsonObject()
            .add(
                "addresses",
                Arrays.asList(
                    new JsonObject().add("postcode", "postcode1").map,
                    new JsonObject().add("postcode", "postcode2").map))
            .toJson();

    MockWebServer server = mockRequestResponse(response);

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    List<Address> addresses = onfido.address.pick("postcode");

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/addresses/pick?postcode=postcode", request.getPath());

    // Correct response body
    assertEquals("postcode1", addresses.get(0).getPostcode());
    assertEquals("postcode2", addresses.get(1).getPostcode());
  }
}
