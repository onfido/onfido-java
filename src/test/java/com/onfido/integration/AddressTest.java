package com.onfido.integration;

import com.onfido.model.Address;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressTest extends TestBase {

  @Test
  public void pickTest() throws Exception {
    List<Address> addresses = onfido.findAddresses("S2 2DF").execute().getAddresses();

    Assertions.assertNotNull(addresses);
    Assertions.assertEquals("S2 2DF", addresses.get(0).getPostcode());
    Assertions.assertEquals("S2 2DF", addresses.get(1).getPostcode());

    Assertions.assertNotNull(addresses.get(0).toJson());
  }
}
