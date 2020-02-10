package com.onfido.api;

import com.onfido.exceptions.OnfidoException;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.ToJson;
import com.squareup.moshi.Types;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A wrapper around Moshi's JsonAdapter for parsing and formatting JSON for Onfido's API.
 *
 * @param <T> the type parameter
 */
public final class ApiJson<T> {
  private static final class LocalDateAdapter {
    /**
     * Converts a LocalDate to a json string.
     *
     * @param date the date
     * @return the json string
     */
    @ToJson
    String toJson(LocalDate date) {
      return date == null ? null : date.toString();
    }

    /**
     * Converts a json string to a LocalDate.
     *
     * @param dateString the date string
     * @return the local date
     */
    @FromJson
    LocalDate fromJson(String dateString) {
      return dateString == null ? null : LocalDate.parse(dateString);
    }
  }

  private static final class OffsetDateTimeAdapter {
    /**
     * Converts a OffsetDateTime to a json string.
     *
     * @param dateTime the date time
     * @return the json string
     */
    @ToJson
    String toJson(OffsetDateTime dateTime) {
      return dateTime == null ? null : dateTime.toString();
    }

    /**
     * Converts a json string to a OffsetDateTime.
     *
     * @param dateTimeString the date time string
     * @return the offset date time
     */
    @FromJson
    OffsetDateTime fromJson(String dateTimeString) {
      return dateTimeString == null ? null : OffsetDateTime.parse(dateTimeString);
    }
  }

  // This is to make lists and maps immutable when they're parsed.
  private static final class ImmutableAdapterFactory implements JsonAdapter.Factory {
    @Override
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
      Type rawType = Types.getRawType(type);
      if (!annotations.isEmpty() || !(rawType.equals(List.class) || rawType.equals(Map.class))) {
        return null;
      }

      JsonAdapter<Object> adapter = moshi.nextAdapter(this, type, annotations);

      return new JsonAdapter<Object>() {
        @Override
        public Object fromJson(JsonReader reader) throws IOException {
          Object value = adapter.fromJson(reader);

          if (value instanceof List) {
            return Collections.unmodifiableList((List<?>) value);
          } else {
            return Collections.unmodifiableMap((Map<?, ?>) value);
          }
        }

        @Override
        public void toJson(JsonWriter writer, Object value) throws IOException {
          adapter.toJson(writer, value);
        }
      };
    }
  }

  private static final Moshi MOSHI =
      new Moshi.Builder()
          .add(new OffsetDateTimeAdapter())
          .add(new LocalDateAdapter())
          .add(new ImmutableAdapterFactory())
          .build();

  private final JsonAdapter<T> adapter;
  private final Class<T> type;
  private JsonAdapter<Map<String, List<T>>> wrappedListAdapter;

  /**
   * Instantiates a new ApiJson object.
   *
   * @param type the type
   */
  public ApiJson(Class<T> type) {
    this.adapter = MOSHI.adapter(type);
    this.type = type;
  }

  /**
   * Coverts the provided object of type T to a json string.
   *
   * @param t the object to be converted
   * @return the json string
   */
  public String toJson(T t) {
    return adapter.toJson(t);
  }

  /**
   * Coverts the provided object of type T to a human readable json string.
   *
   * @param t the object to be converted
   * @return the string
   */
  public String toPrettyJson(T t) {
    return adapter.indent("  ").toJson(t);
  }

  /**
   * Coverts the provided json string to an object of type T
   *
   * @param json the json string to be converted
   * @return the object made from the json string
   * @throws OnfidoException the onfido exception
   */
  public T parse(String json) throws OnfidoException {
    return parse(adapter, json);
  }

  /**
   * Parses a json array into a list of type T.
   *
   * @param json the json string to be converted
   * @param path the path to the json array
   * @return the list made from the json string
   * @throws OnfidoException the onfido exception
   */
  public List<T> parseWrappedList(String json, String path) throws OnfidoException {
    if (wrappedListAdapter == null) {
      Type listType = Types.newParameterizedType(List.class, type);
      Type mapType = Types.newParameterizedType(Map.class, String.class, listType);
      wrappedListAdapter = MOSHI.adapter(mapType);
    }

    List<T> list = parse(wrappedListAdapter, json).get(path);
    if (list == null) {
      throw new OnfidoException("Expected response to contain " + path, null);
    }

    return list;
  }

  private static <T> T parse(JsonAdapter<T> adapter, String json) throws OnfidoException {
    try {
      return adapter.fromJson(json);
    } catch (IOException e) {
      throw new OnfidoException("Error parsing JSON in response", e);
    }
  }
}
