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

public class AddressManagerTest extends TestBase {

  @Test
  public void pickTest() throws Exception {
    prepareMock(new JsonObject().add("addresses",
                                     Arrays.asList(
                                         new JsonObject().add("postcode", "S2 2DF").map,
                                         new JsonObject().add("postcode", "S2 2DF").map)));

    List<Address> addresses = onfido.address.pick("S2 2DF");

    takeRequest("/addresses/pick?postcode=S2%202DF");

    assertEquals("S2 2DF", addresses.get(0).getPostcode());
    assertEquals("S2 2DF", addresses.get(1).getPostcode());
  }
}
