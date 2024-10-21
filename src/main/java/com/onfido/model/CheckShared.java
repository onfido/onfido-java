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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * CheckShared
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class CheckShared {
  public static final String SERIALIZED_NAME_WEBHOOK_IDS = "webhook_ids";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_IDS)
  private List<String> webhookIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicant_id";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  private UUID applicantId;

  public static final String SERIALIZED_NAME_APPLICANT_PROVIDES_DATA = "applicant_provides_data";
  @SerializedName(SERIALIZED_NAME_APPLICANT_PROVIDES_DATA)
  private Boolean applicantProvidesData;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirect_uri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;

  public static final String SERIALIZED_NAME_PRIVACY_NOTICES_READ_CONSENT_GIVEN = "privacy_notices_read_consent_given";
  @SerializedName(SERIALIZED_NAME_PRIVACY_NOTICES_READ_CONSENT_GIVEN)
  private Boolean privacyNoticesReadConsentGiven;

  public CheckShared() {
  }

  public CheckShared webhookIds(List<String> webhookIds) {
    this.webhookIds = webhookIds;
    return this;
  }

  public CheckShared addWebhookIdsItem(String webhookIdsItem) {
    if (this.webhookIds == null) {
      this.webhookIds = new ArrayList<>();
    }
    this.webhookIds.add(webhookIdsItem);
    return this;
  }

   /**
   * An array of webhook ids describing which webhooks to trigger for this check.
   * @return webhookIds
  **/
  @javax.annotation.Nullable
  public List<String> getWebhookIds() {
    return webhookIds;
  }

  public void setWebhookIds(List<String> webhookIds) {
    this.webhookIds = webhookIds;
  }


  public CheckShared applicantId(UUID applicantId) {
    this.applicantId = applicantId;
    return this;
  }

   /**
   * The ID of the applicant to do the check on.
   * @return applicantId
  **/
  @javax.annotation.Nonnull
  public UUID getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(UUID applicantId) {
    this.applicantId = applicantId;
  }


  public CheckShared applicantProvidesData(Boolean applicantProvidesData) {
    this.applicantProvidesData = applicantProvidesData;
    return this;
  }

   /**
   * Send an applicant form to applicant to complete to proceed with check. Defaults to false. 
   * @return applicantProvidesData
  **/
  @javax.annotation.Nullable
  public Boolean getApplicantProvidesData() {
    return applicantProvidesData;
  }

  public void setApplicantProvidesData(Boolean applicantProvidesData) {
    this.applicantProvidesData = applicantProvidesData;
  }


  public CheckShared tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CheckShared addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Array of tags being assigned to this check.
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CheckShared redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * For checks where &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;, redirect to this URI when the applicant has submitted their data.
   * @return redirectUri
  **/
  @javax.annotation.Nullable
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  public CheckShared privacyNoticesReadConsentGiven(Boolean privacyNoticesReadConsentGiven) {
    this.privacyNoticesReadConsentGiven = privacyNoticesReadConsentGiven;
    return this;
  }

   /**
   * Get privacyNoticesReadConsentGiven
   * @return privacyNoticesReadConsentGiven
  **/
  @javax.annotation.Nullable
  public Boolean getPrivacyNoticesReadConsentGiven() {
    return privacyNoticesReadConsentGiven;
  }

  public void setPrivacyNoticesReadConsentGiven(Boolean privacyNoticesReadConsentGiven) {
    this.privacyNoticesReadConsentGiven = privacyNoticesReadConsentGiven;
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
   * @return the CheckShared instance itself
   */
  public CheckShared putAdditionalProperty(String key, Object value) {
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
    CheckShared checkShared = (CheckShared) o;
    return Objects.equals(this.webhookIds, checkShared.webhookIds) &&
        Objects.equals(this.applicantId, checkShared.applicantId) &&
        Objects.equals(this.applicantProvidesData, checkShared.applicantProvidesData) &&
        Objects.equals(this.tags, checkShared.tags) &&
        Objects.equals(this.redirectUri, checkShared.redirectUri) &&
        Objects.equals(this.privacyNoticesReadConsentGiven, checkShared.privacyNoticesReadConsentGiven)&&
        Objects.equals(this.additionalProperties, checkShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookIds, applicantId, applicantProvidesData, tags, redirectUri, privacyNoticesReadConsentGiven, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckShared {\n");
    sb.append("    webhookIds: ").append(toIndentedString(webhookIds)).append("\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    applicantProvidesData: ").append(toIndentedString(applicantProvidesData)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    privacyNoticesReadConsentGiven: ").append(toIndentedString(privacyNoticesReadConsentGiven)).append("\n");
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
    openapiFields.add("webhook_ids");
    openapiFields.add("applicant_id");
    openapiFields.add("applicant_provides_data");
    openapiFields.add("tags");
    openapiFields.add("redirect_uri");
    openapiFields.add("privacy_notices_read_consent_given");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("applicant_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CheckShared
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CheckShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckShared is not found in the empty JSON string", CheckShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckShared.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("webhook_ids") != null && !jsonObj.get("webhook_ids").isJsonNull() && !jsonObj.get("webhook_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhook_ids` to be an array in the JSON string but got `%s`", jsonObj.get("webhook_ids").toString()));
      }
      if (!jsonObj.get("applicant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicant_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("redirect_uri") != null && !jsonObj.get("redirect_uri").isJsonNull()) && !jsonObj.get("redirect_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirect_uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckShared.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckShared>() {
           @Override
           public void write(JsonWriter out, CheckShared value) throws IOException {
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
           public CheckShared read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CheckShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CheckShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckShared
  * @throws IOException if the JSON string is invalid with respect to CheckShared
  */
  public static CheckShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckShared.class);
  }

 /**
  * Convert an instance of CheckShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

