package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Address;

import java.util.List;

public class AddressManager extends ResourceManager {

    private ApiJson<Address> addressParser = new ApiJson<>(Address.class);
    private ApiJson<Address.Request> requestParser = new ApiJson<>(Address.Request.class);

    public AddressManager(Config config) {
        super("addresses/", config);
    }

    public List<Address> pick(String postcode) throws OnfidoException {
        return addressParser.parseWrappedList(get("pick?postcode=" + postcode), "addresses");
    }
}
