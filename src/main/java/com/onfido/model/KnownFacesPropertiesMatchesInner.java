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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.onfido.JSON;

/**
 * KnownFacesPropertiesMatchesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class KnownFacesPropertiesMatchesInner {
  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicant_id";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  @javax.annotation.Nullable
  private UUID applicantId;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  @javax.annotation.Nullable
  private Float score;

  public static final String SERIALIZED_NAME_MEDIA_ID = "media_id";
  @SerializedName(SERIALIZED_NAME_MEDIA_ID)
  @javax.annotation.Nullable
  private UUID mediaId;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "media_type";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  @javax.annotation.Nullable
  private String mediaType;

  public static final String SERIALIZED_NAME_SUSPECTED = "suspected";
  @SerializedName(SERIALIZED_NAME_SUSPECTED)
  @javax.annotation.Nullable
  private Boolean suspected;

  public KnownFacesPropertiesMatchesInner() {
  }

  public KnownFacesPropertiesMatchesInner applicantId(@javax.annotation.Nullable UUID applicantId) {
    this.applicantId = applicantId;
    return this;
  }

  /**
   * The applicant ID of the matched applicant.
   * @return applicantId
   */
  @javax.annotation.Nullable
  public UUID getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(@javax.annotation.Nullable UUID applicantId) {
    this.applicantId = applicantId;
  }


  public KnownFacesPropertiesMatchesInner score(@javax.annotation.Nullable Float score) {
    this.score = score;
    return this;
  }

  /**
   * A floating point number between 0 and 1 that expresses how similar the two faces are, where 1 is a perfect match.
   * @return score
   */
  @javax.annotation.Nullable
  public Float getScore() {
    return score;
  }

  public void setScore(@javax.annotation.Nullable Float score) {
    this.score = score;
  }


  public KnownFacesPropertiesMatchesInner mediaId(@javax.annotation.Nullable UUID mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * The corresponding UUID for the media type.
   * @return mediaId
   */
  @javax.annotation.Nullable
  public UUID getMediaId() {
    return mediaId;
  }

  public void setMediaId(@javax.annotation.Nullable UUID mediaId) {
    this.mediaId = mediaId;
  }


  public KnownFacesPropertiesMatchesInner mediaType(@javax.annotation.Nullable String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * The media type (for example live_photos or live_videos).
   * @return mediaType
   */
  @javax.annotation.Nullable
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(@javax.annotation.Nullable String mediaType) {
    this.mediaType = mediaType;
  }


  public KnownFacesPropertiesMatchesInner suspected(@javax.annotation.Nullable Boolean suspected) {
    this.suspected = suspected;
    return this;
  }

  /**
   * Indicates if match is suspected based on fuzzy name matching feature. Dependent on feature being active for account, otherwise defaults to true.
   * @return suspected
   */
  @javax.annotation.Nullable
  public Boolean getSuspected() {
    return suspected;
  }

  public void setSuspected(@javax.annotation.Nullable Boolean suspected) {
    this.suspected = suspected;
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
   * @return the KnownFacesPropertiesMatchesInner instance itself
   */
  public KnownFacesPropertiesMatchesInner putAdditionalProperty(String key, Object value) {
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
    KnownFacesPropertiesMatchesInner knownFacesPropertiesMatchesInner = (KnownFacesPropertiesMatchesInner) o;
    return Objects.equals(this.applicantId, knownFacesPropertiesMatchesInner.applicantId) &&
        Objects.equals(this.score, knownFacesPropertiesMatchesInner.score) &&
        Objects.equals(this.mediaId, knownFacesPropertiesMatchesInner.mediaId) &&
        Objects.equals(this.mediaType, knownFacesPropertiesMatchesInner.mediaType) &&
        Objects.equals(this.suspected, knownFacesPropertiesMatchesInner.suspected)&&
        Objects.equals(this.additionalProperties, knownFacesPropertiesMatchesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, score, mediaId, mediaType, suspected, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnownFacesPropertiesMatchesInner {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    suspected: ").append(toIndentedString(suspected)).append("\n");
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
    openapiFields.add("score");
    openapiFields.add("media_id");
    openapiFields.add("media_type");
    openapiFields.add("suspected");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KnownFacesPropertiesMatchesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KnownFacesPropertiesMatchesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KnownFacesPropertiesMatchesInner is not found in the empty JSON string", KnownFacesPropertiesMatchesInner.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("applicant_id") != null && !jsonObj.get("applicant_id").isJsonNull()) && !jsonObj.get("applicant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicant_id").toString()));
      }
      if ((jsonObj.get("media_id") != null && !jsonObj.get("media_id").isJsonNull()) && !jsonObj.get("media_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `media_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("media_id").toString()));
      }
      if ((jsonObj.get("media_type") != null && !jsonObj.get("media_type").isJsonNull()) && !jsonObj.get("media_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `media_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("media_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KnownFacesPropertiesMatchesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KnownFacesPropertiesMatchesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KnownFacesPropertiesMatchesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KnownFacesPropertiesMatchesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<KnownFacesPropertiesMatchesInner>() {
           @Override
           public void write(JsonWriter out, KnownFacesPropertiesMatchesInner value) throws IOException {
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
           public KnownFacesPropertiesMatchesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KnownFacesPropertiesMatchesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of KnownFacesPropertiesMatchesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KnownFacesPropertiesMatchesInner
   * @throws IOException if the JSON string is invalid with respect to KnownFacesPropertiesMatchesInner
   */
  public static KnownFacesPropertiesMatchesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KnownFacesPropertiesMatchesInner.class);
  }

  /**
   * Convert an instance of KnownFacesPropertiesMatchesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

