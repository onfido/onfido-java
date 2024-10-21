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
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.onfido.JSON;

/**
 * SdkTokenRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class SdkTokenRequest {
  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicant_id";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  private UUID applicantId;

  public static final String SERIALIZED_NAME_REFERRER = "referrer";
  @SerializedName(SERIALIZED_NAME_REFERRER)
  private String referrer;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_CROSS_DEVICE_URL = "cross_device_url";
  @SerializedName(SERIALIZED_NAME_CROSS_DEVICE_URL)
  private String crossDeviceUrl;

  public SdkTokenRequest() {
  }

  public SdkTokenRequest applicantId(UUID applicantId) {
    this.applicantId = applicantId;
    return this;
  }

   /**
   * The unique identifier of the applicant
   * @return applicantId
  **/
  @javax.annotation.Nonnull
  public UUID getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(UUID applicantId) {
    this.applicantId = applicantId;
  }


  public SdkTokenRequest referrer(String referrer) {
    this.referrer = referrer;
    return this;
  }

   /**
   * The referrer URL pattern
   * @return referrer
  **/
  @javax.annotation.Nullable
  public String getReferrer() {
    return referrer;
  }

  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }


  public SdkTokenRequest applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The application ID (iOS or Android)
   * @return applicationId
  **/
  @javax.annotation.Nullable
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public SdkTokenRequest crossDeviceUrl(String crossDeviceUrl) {
    this.crossDeviceUrl = crossDeviceUrl;
    return this;
  }

   /**
   * The URL to be used by the Web SDK for the cross device flow.
   * @return crossDeviceUrl
  **/
  @javax.annotation.Nullable
  public String getCrossDeviceUrl() {
    return crossDeviceUrl;
  }

  public void setCrossDeviceUrl(String crossDeviceUrl) {
    this.crossDeviceUrl = crossDeviceUrl;
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
   * @return the SdkTokenRequest instance itself
   */
  public SdkTokenRequest putAdditionalProperty(String key, Object value) {
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
    SdkTokenRequest sdkTokenRequest = (SdkTokenRequest) o;
    return Objects.equals(this.applicantId, sdkTokenRequest.applicantId) &&
        Objects.equals(this.referrer, sdkTokenRequest.referrer) &&
        Objects.equals(this.applicationId, sdkTokenRequest.applicationId) &&
        Objects.equals(this.crossDeviceUrl, sdkTokenRequest.crossDeviceUrl)&&
        Objects.equals(this.additionalProperties, sdkTokenRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, referrer, applicationId, crossDeviceUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SdkTokenRequest {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    crossDeviceUrl: ").append(toIndentedString(crossDeviceUrl)).append("\n");
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
    openapiFields.add("applicant_id");
    openapiFields.add("referrer");
    openapiFields.add("application_id");
    openapiFields.add("cross_device_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("applicant_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SdkTokenRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SdkTokenRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SdkTokenRequest is not found in the empty JSON string", SdkTokenRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SdkTokenRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("applicant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicant_id").toString()));
      }
      if ((jsonObj.get("referrer") != null && !jsonObj.get("referrer").isJsonNull()) && !jsonObj.get("referrer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referrer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referrer").toString()));
      }
      if ((jsonObj.get("application_id") != null && !jsonObj.get("application_id").isJsonNull()) && !jsonObj.get("application_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_id").toString()));
      }
      if ((jsonObj.get("cross_device_url") != null && !jsonObj.get("cross_device_url").isJsonNull()) && !jsonObj.get("cross_device_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cross_device_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cross_device_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SdkTokenRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SdkTokenRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SdkTokenRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SdkTokenRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SdkTokenRequest>() {
           @Override
           public void write(JsonWriter out, SdkTokenRequest value) throws IOException {
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
           public SdkTokenRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SdkTokenRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SdkTokenRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SdkTokenRequest
  * @throws IOException if the JSON string is invalid with respect to SdkTokenRequest
  */
  public static SdkTokenRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SdkTokenRequest.class);
  }

 /**
  * Convert an instance of SdkTokenRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

