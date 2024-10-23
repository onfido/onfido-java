/*
 * Onfido API v3.6
 * The Onfido API (v3.6)
 *
 * The version of the OpenAPI document: v3.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onfido.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.onfido.model.WebhookEventType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.onfido.JSON;

/**
 * WebhookBuilder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WebhookBuilder {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<WebhookEventType> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<String> environments = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYLOAD_VERSION = "payload_version";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_VERSION)
  private Integer payloadVersion;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public WebhookBuilder() {
  }

  public WebhookBuilder enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Determine if the webhook is active.
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public WebhookBuilder events(List<WebhookEventType> events) {
    this.events = events;
    return this;
  }

  public WebhookBuilder addEventsItem(WebhookEventType eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * The events that will be published to the webhook. If the events parameter is omitted all the events will be subscribed. 
   * @return events
   */
  @javax.annotation.Nullable
  public List<WebhookEventType> getEvents() {
    return events;
  }

  public void setEvents(List<WebhookEventType> events) {
    this.events = events;
  }


  public WebhookBuilder environments(List<String> environments) {
    this.environments = environments;
    return this;
  }

  public WebhookBuilder addEnvironmentsItem(String environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * The environments from which the webhook will receive events. Allowed values are “sandbox” and “live”. If the environments parameter is omitted the webhook will receive events from both environments. 
   * @return environments
   */
  @javax.annotation.Nullable
  public List<String> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<String> environments) {
    this.environments = environments;
  }


  public WebhookBuilder payloadVersion(Integer payloadVersion) {
    this.payloadVersion = payloadVersion;
    return this;
  }

  /**
   * Webhook version used to control the payload object when sending webhooks.
   * @return payloadVersion
   */
  @javax.annotation.Nullable
  public Integer getPayloadVersion() {
    return payloadVersion;
  }

  public void setPayloadVersion(Integer payloadVersion) {
    this.payloadVersion = payloadVersion;
  }


  public WebhookBuilder url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The url that will listen to notifications (must be https).
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the WebhookBuilder instance itself
   */
  public WebhookBuilder putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookBuilder webhookBuilder = (WebhookBuilder) o;
    return Objects.equals(this.enabled, webhookBuilder.enabled) &&
        Objects.equals(this.events, webhookBuilder.events) &&
        Objects.equals(this.environments, webhookBuilder.environments) &&
        Objects.equals(this.payloadVersion, webhookBuilder.payloadVersion) &&
        Objects.equals(this.url, webhookBuilder.url)&&
        Objects.equals(this.additionalProperties, webhookBuilder.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, events, environments, payloadVersion, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookBuilder {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    payloadVersion: ").append(toIndentedString(payloadVersion)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("enabled");
    openapiFields.add("events");
    openapiFields.add("environments");
    openapiFields.add("payload_version");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebhookBuilder
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookBuilder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookBuilder is not found in the empty JSON string", WebhookBuilder.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookBuilder.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonNull() && !jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("environments") != null && !jsonObj.get("environments").isJsonNull() && !jsonObj.get("environments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `environments` to be an array in the JSON string but got `%s`", jsonObj.get("environments").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookBuilder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookBuilder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookBuilder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookBuilder.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookBuilder>() {
           @Override
           public void write(JsonWriter out, WebhookBuilder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else if (jsonElement.isJsonObject()) { 
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookBuilder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WebhookBuilder instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebhookBuilder given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebhookBuilder
   * @throws IOException if the JSON string is invalid with respect to WebhookBuilder
   */
  public static WebhookBuilder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookBuilder.class);
  }

  /**
   * Convert an instance of WebhookBuilder to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

