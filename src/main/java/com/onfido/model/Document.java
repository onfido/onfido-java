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
import com.onfido.model.CountryCodes;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Document
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class Document {
  /**
   * The file type of the uploaded file
   */
  @JsonAdapter(FileTypeEnum.Adapter.class)
  public enum FileTypeEnum {
    JPG("jpg"),
    
    PNG("png"),
    
    PDF("pdf"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    FileTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FileTypeEnum fromValue(String value) {
      for (FileTypeEnum b : FileTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<FileTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FileTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FileTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FileTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FILE_TYPE = "file_type";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private FileTypeEnum fileType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  /**
   * The side of the document, if applicable. The possible values are front and back
   */
  @JsonAdapter(SideEnum.Adapter.class)
  public enum SideEnum {
    FRONT("front"),
    
    BACK("back"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    SideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SideEnum fromValue(String value) {
      for (SideEnum b : SideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<SideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SideEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SideEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SideEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private SideEnum side;

  public static final String SERIALIZED_NAME_ISSUING_COUNTRY = "issuing_country";
  @SerializedName(SERIALIZED_NAME_ISSUING_COUNTRY)
  private CountryCodes issuingCountry;

  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicant_id";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  private UUID applicantId;

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

  public Document() {
  }

  public Document fileType(FileTypeEnum fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * The file type of the uploaded file
   * @return fileType
  **/
  @javax.annotation.Nullable
  public FileTypeEnum getFileType() {
    return fileType;
  }

  public void setFileType(FileTypeEnum fileType) {
    this.fileType = fileType;
  }


  public Document type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of document
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Document side(SideEnum side) {
    this.side = side;
    return this;
  }

   /**
   * The side of the document, if applicable. The possible values are front and back
   * @return side
  **/
  @javax.annotation.Nullable
  public SideEnum getSide() {
    return side;
  }

  public void setSide(SideEnum side) {
    this.side = side;
  }


  public Document issuingCountry(CountryCodes issuingCountry) {
    this.issuingCountry = issuingCountry;
    return this;
  }

   /**
   * The issuing country of the document, a 3-letter ISO code.
   * @return issuingCountry
  **/
  @javax.annotation.Nullable
  public CountryCodes getIssuingCountry() {
    return issuingCountry;
  }

  public void setIssuingCountry(CountryCodes issuingCountry) {
    this.issuingCountry = issuingCountry;
  }


  public Document applicantId(UUID applicantId) {
    this.applicantId = applicantId;
    return this;
  }

   /**
   * The ID of the applicant whose document is being uploaded.
   * @return applicantId
  **/
  @javax.annotation.Nullable
  public UUID getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(UUID applicantId) {
    this.applicantId = applicantId;
  }


  public Document id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the document
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public Document createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time at which the document was uploaded
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Document href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The uri of this resource
   * @return href
  **/
  @javax.annotation.Nullable
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public Document downloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
    return this;
  }

   /**
   * The uri that can be used to download the document
   * @return downloadHref
  **/
  @javax.annotation.Nullable
  public String getDownloadHref() {
    return downloadHref;
  }

  public void setDownloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
  }


  public Document fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the uploaded file
   * @return fileName
  **/
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public Document fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * The size of the file in bytes
   * @return fileSize
  **/
  @javax.annotation.Nullable
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
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
   * @return the Document instance itself
   */
  public Document putAdditionalProperty(String key, Object value) {
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
    Document document = (Document) o;
    return Objects.equals(this.fileType, document.fileType) &&
        Objects.equals(this.type, document.type) &&
        Objects.equals(this.side, document.side) &&
        Objects.equals(this.issuingCountry, document.issuingCountry) &&
        Objects.equals(this.applicantId, document.applicantId) &&
        Objects.equals(this.id, document.id) &&
        Objects.equals(this.createdAt, document.createdAt) &&
        Objects.equals(this.href, document.href) &&
        Objects.equals(this.downloadHref, document.downloadHref) &&
        Objects.equals(this.fileName, document.fileName) &&
        Objects.equals(this.fileSize, document.fileSize)&&
        Objects.equals(this.additionalProperties, document.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType, type, side, issuingCountry, applicantId, id, createdAt, href, downloadHref, fileName, fileSize, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    downloadHref: ").append(toIndentedString(downloadHref)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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
    openapiFields.add("file_type");
    openapiFields.add("type");
    openapiFields.add("side");
    openapiFields.add("issuing_country");
    openapiFields.add("applicant_id");
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("href");
    openapiFields.add("download_href");
    openapiFields.add("file_name");
    openapiFields.add("file_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Document
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Document.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Document is not found in the empty JSON string", Document.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Document.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("file_type") != null && !jsonObj.get("file_type").isJsonNull()) && !jsonObj.get("file_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_type").toString()));
      }
      // validate the optional field `file_type`
      if (jsonObj.get("file_type") != null && !jsonObj.get("file_type").isJsonNull()) {
        FileTypeEnum.validateJsonElement(jsonObj.get("file_type"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("side") != null && !jsonObj.get("side").isJsonNull()) && !jsonObj.get("side").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `side` to be a primitive type in the JSON string but got `%s`", jsonObj.get("side").toString()));
      }
      // validate the optional field `side`
      if (jsonObj.get("side") != null && !jsonObj.get("side").isJsonNull()) {
        SideEnum.validateJsonElement(jsonObj.get("side"));
      }
      // validate the optional field `issuing_country`
      if (jsonObj.get("issuing_country") != null && !jsonObj.get("issuing_country").isJsonNull()) {
        CountryCodes.validateJsonElement(jsonObj.get("issuing_country"));
      }
      if ((jsonObj.get("applicant_id") != null && !jsonObj.get("applicant_id").isJsonNull()) && !jsonObj.get("applicant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicant_id").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Document.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Document' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Document> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Document.class));

       return (TypeAdapter<T>) new TypeAdapter<Document>() {
           @Override
           public void write(JsonWriter out, Document value) throws IOException {
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
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Document read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Document instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Document given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Document
  * @throws IOException if the JSON string is invalid with respect to Document
  */
  public static Document fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Document.class);
  }

 /**
  * Convert an instance of Document to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

