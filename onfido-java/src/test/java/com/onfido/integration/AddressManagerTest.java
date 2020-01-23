package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Address;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AddressManagerTest extends ApiIntegrationTest {

    @Test
    public void pickTest() throws Exception {
        String addresss1 = new JsonObject()
                .add("postcode", "postcode1").toJson();

        String addresss2 = new JsonObject()
                .add("postcode", "postcode2").toJson();

        String response = new JsonObject().add("addresses", new String[]{addresss1, addresss2}).toJson()
                .replace("\\", "")
                .replace("\"{", "{")
                .replace("}\"", "}");

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        List<Address> addresses = onfido.address.pick("postcode");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/addresses/pick?postcode=postcode", request.getPath());

        // Correct response body
        assertEquals("postcode1", addresses.get(0).getPostcode());
        assertEquals("postcode2", addresses.get(1).getPostcode());
    }
}
