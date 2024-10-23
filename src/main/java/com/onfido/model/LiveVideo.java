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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
 * LiveVideo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class LiveVideo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_DOWNLOAD_HREF = "download_href";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_HREF)
  private String downloadHref;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_FILE_SIZE = "file_size";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private Integer fileSize;

  public static final String SERIALIZED_NAME_FILE_TYPE = "file_type";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private String fileType;

  public static final String SERIALIZED_NAME_CHALLENGE = "challenge";
  @SerializedName(SERIALIZED_NAME_CHALLENGE)
  private List<Map<String, Object>> challenge = new ArrayList<>();

  public LiveVideo() {
  }

  public LiveVideo id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the video.
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public LiveVideo createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time at which the video was uploaded.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LiveVideo href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The uri of this resource.
   * @return href
   */
  @javax.annotation.Nullable
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public LiveVideo downloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
    return this;
  }

  /**
   * The uri that can be used to download the video.
   * @return downloadHref
   */
  @javax.annotation.Nullable
  public String getDownloadHref() {
    return downloadHref;
  }

  public void setDownloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
  }


  public LiveVideo fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The name of the uploaded file.
   * @return fileName
   */
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public LiveVideo fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * The size of the file in bytes.
   * @return fileSize
   */
  @javax.annotation.Nullable
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }


  public LiveVideo fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * The file type of the uploaded file.
   * @return fileType
   */
  @javax.annotation.Nullable
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }


  public LiveVideo challenge(List<Map<String, Object>> challenge) {
    this.challenge = challenge;
    return this;
  }

  public LiveVideo addChallengeItem(Map<String, Object> challengeItem) {
    if (this.challenge == null) {
      this.challenge = new ArrayList<>();
    }
    this.challenge.add(challengeItem);
    return this;
  }

  /**
   * Challenge the end user was asked to perform during the video recording.
   * @return challenge
   */
  @javax.annotation.Nullable
  public List<Map<String, Object>> getChallenge() {
    return challenge;
  }

  public void setChallenge(List<Map<String, Object>> challenge) {
    this.challenge = challenge;
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
   * @return the LiveVideo instance itself
   */
  public LiveVideo putAdditionalProperty(String key, Object value) {
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
    LiveVideo liveVideo = (LiveVideo) o;
    return Objects.equals(this.id, liveVideo.id) &&
        Objects.equals(this.createdAt, liveVideo.createdAt) &&
        Objects.equals(this.href, liveVideo.href) &&
        Objects.equals(this.downloadHref, liveVideo.downloadHref) &&
        Objects.equals(this.fileName, liveVideo.fileName) &&
        Objects.equals(this.fileSize, liveVideo.fileSize) &&
        Objects.equals(this.fileType, liveVideo.fileType) &&
        Objects.equals(this.challenge, liveVideo.challenge)&&
        Objects.equals(this.additionalProperties, liveVideo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, href, downloadHref, fileName, fileSize, fileType, challenge, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveVideo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    downloadHref: ").append(toIndentedString(downloadHref)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("href");
    openapiFields.add("download_href");
    openapiFields.add("file_name");
    openapiFields.add("file_size");
    openapiFields.add("file_type");
    openapiFields.add("challenge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LiveVideo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LiveVideo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveVideo is not found in the empty JSON string", LiveVideo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("download_href") != null && !jsonObj.get("download_href").isJsonNull()) && !jsonObj.get("download_href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `download_href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("download_href").toString()));
      }
      if ((jsonObj.get("file_name") != null && !jsonObj.get("file_name").isJsonNull()) && !jsonObj.get("file_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_name").toString()));
      }
      if ((jsonObj.get("file_type") != null && !jsonObj.get("file_type").isJsonNull()) && !jsonObj.get("file_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("challenge") != null && !jsonObj.get("challenge").isJsonNull() && !jsonObj.get("challenge").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `challenge` to be an array in the JSON string but got `%s`", jsonObj.get("challenge").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveVideo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveVideo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveVideo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveVideo.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveVideo>() {
           @Override
           public void write(JsonWriter out, LiveVideo value) throws IOException {
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
           public LiveVideo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             LiveVideo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of LiveVideo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LiveVideo
   * @throws IOException if the JSON string is invalid with respect to LiveVideo
   */
  public static LiveVideo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveVideo.class);
  }

  /**
   * Convert an instance of LiveVideo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

