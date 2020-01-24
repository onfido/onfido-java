package com.onfido;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

/**
 * The type Json object.
 */
public final class JsonObject {
  private static final JsonAdapter<Map<String, Object>> ADAPTOR = new Moshi.Builder().build()
      .adapter(Types.newParameterizedType(Map.class, String.class, Object.class));

    /**
     * The Map.
     */
    public Map<String, Object> map;

    /**
     * Instantiates a new Json object.
     */
    public JsonObject() {
    map = new HashMap<String, Object>();
  }

  private JsonObject(Map<String, Object> map) {
    this.map = map;
  }

    /**
     * Parse json object.
     *
     * @param json the json
     * @return the json object
     */
    public static JsonObject parse(String json) {
    try {
      Map<String, Object> map = ADAPTOR.fromJson(json);
      return new JsonObject(map);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

    /**
     * Add json object.
     *
     * @param key   the key
     * @param value the value
     * @return the json object
     */
    public JsonObject add(String key, Object value) {
    map.put(key, value);
    return this;
  }

    /**
     * Get object.
     *
     * @param key the key
     * @return the object
     */
    public Object get(String key) {
    return map.get(key);
  }

    /**
     * To json string.
     *
     * @return the string
     */
    public String toJson() {
    return ADAPTOR.toJson(map);
  }
}
