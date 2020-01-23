package com.onfido;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

public final class JsonObject {
  private static final JsonAdapter<Map<String, Object>> ADAPTOR = new Moshi.Builder().build()
      .adapter(Types.newParameterizedType(Map.class, String.class, Object.class));

  public Map<String, Object> map;

  public JsonObject() {
    map = new HashMap<String, Object>();
  }

  private JsonObject(Map<String, Object> map) {
    this.map = map;
  }

  public static JsonObject parse(String json) {
    try {
      Map<String, Object> map = ADAPTOR.fromJson(json);
      return new JsonObject(map);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public JsonObject add(String key, Object value) {
    map.put(key, value);
    return this;
  }

  public Object get(String key) {
    return map.get(key);
  }

  public String toJson() {
    return ADAPTOR.toJson(map);
  }
}
