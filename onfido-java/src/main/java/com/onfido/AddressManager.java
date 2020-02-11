package com.onfido;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Address;
import java.util.List;
import okhttp3.OkHttpClient;

/**
 * Manager class for the Address resource type. Contains resource-specific methods for interacting
 * with the API.
 */
public class AddressManager extends ResourceManager {
  private ApiJson<Address> addressParser = new ApiJson<>(Address.class);

  /**
   * Instantiates a new AddressManager object.
   *
   * @param config the configuration from the parent Onfido object
   */
  protected AddressManager(Config config, OkHttpClient client) {
    super("addresses/", config, client);
  }

  /**
   * Performs a search for addresses by postcode (UK only).
   *
   * @param postcode the postcode
   * @return a list of Address objects
   * @throws OnfidoException the onfido exception
   */
  public List<Address> pick(String postcode) throws OnfidoException {
    return addressParser.parseWrappedList(get("pick?postcode=" + postcode), "addresses");
  }
}
