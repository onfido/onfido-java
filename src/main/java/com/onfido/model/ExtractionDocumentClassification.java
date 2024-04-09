/*
 * Onfido API v3.6
 * The Onfido API
 *
 * The version of the OpenAPI document: 3.6.0
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
import com.onfido.model.DocumentTypes;
import java.io.IOException;
import java.util.Arrays;

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
 * ExtractionDocumentClassification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ExtractionDocumentClassification {
  public static final String SERIALIZED_NAME_ISSUING_COUNTRY = "issuing_country";
  @SerializedName(SERIALIZED_NAME_ISSUING_COUNTRY)
  private CountryCodes issuingCountry;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private DocumentTypes documentType;

  public static final String SERIALIZED_NAME_ISSUING_STATE = "issuing_state";
  @SerializedName(SERIALIZED_NAME_ISSUING_STATE)
  private String issuingState;

  /**
   * The document subtype (if available).
   */
  @JsonAdapter(SubtypeEnum.Adapter.class)
  public enum SubtypeEnum {
    FULL("full"),
    
    NOT_FULL("not_full"),
    
    PROVISIONAL("provisional"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    SubtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubtypeEnum fromValue(String value) {
      for (SubtypeEnum b : SubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<SubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubtypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SubtypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private SubtypeEnum subtype;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public ExtractionDocumentClassification() {
  }

  public ExtractionDocumentClassification issuingCountry(CountryCodes issuingCountry) {
    this.issuingCountry = issuingCountry;
    return this;
  }

   /**
   * Document country in 3-letter ISO code.
   * @return issuingCountry
  **/
  @javax.annotation.Nullable
  public CountryCodes getIssuingCountry() {
    return issuingCountry;
  }

  public void setIssuingCountry(CountryCodes issuingCountry) {
    this.issuingCountry = issuingCountry;
  }


  public ExtractionDocumentClassification documentType(DocumentTypes documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Type of document.
   * @return documentType
  **/
  @javax.annotation.Nullable
  public DocumentTypes getDocumentType() {
    return documentType;
  }

  public void setDocumentType(DocumentTypes documentType) {
    this.documentType = documentType;
  }


  public ExtractionDocumentClassification issuingState(String issuingState) {
    this.issuingState = issuingState;
    return this;
  }

   /**
   * The state that issued the document (if available).
   * @return issuingState
  **/
  @javax.annotation.Nullable
  public String getIssuingState() {
    return issuingState;
  }

  public void setIssuingState(String issuingState) {
    this.issuingState = issuingState;
  }


  public ExtractionDocumentClassification subtype(SubtypeEnum subtype) {
    this.subtype = subtype;
    return this;
  }

   /**
   * The document subtype (if available).
   * @return subtype
  **/
  @javax.annotation.Nullable
  public SubtypeEnum getSubtype() {
    return subtype;
  }

  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }


  public ExtractionDocumentClassification version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The document issuing version (if available).
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return the ExtractionDocumentClassification instance itself
   */
  public ExtractionDocumentClassification putAdditionalProperty(String key, Object value) {
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
    ExtractionDocumentClassification extractionDocumentClassification = (ExtractionDocumentClassification) o;
    return Objects.equals(this.issuingCountry, extractionDocumentClassification.issuingCountry) &&
        Objects.equals(this.documentType, extractionDocumentClassification.documentType) &&
        Objects.equals(this.issuingState, extractionDocumentClassification.issuingState) &&
        Objects.equals(this.subtype, extractionDocumentClassification.subtype) &&
        Objects.equals(this.version, extractionDocumentClassification.version)&&
        Objects.equals(this.additionalProperties, extractionDocumentClassification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuingCountry, documentType, issuingState, subtype, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractionDocumentClassification {\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    issuingState: ").append(toIndentedString(issuingState)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("issuing_country");
    openapiFields.add("document_type");
    openapiFields.add("issuing_state");
    openapiFields.add("subtype");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExtractionDocumentClassification
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExtractionDocumentClassification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtractionDocumentClassification is not found in the empty JSON string", ExtractionDocumentClassification.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `issuing_country`
      if (jsonObj.get("issuing_country") != null && !jsonObj.get("issuing_country").isJsonNull()) {
        CountryCodes.validateJsonElement(jsonObj.get("issuing_country"));
      }
      // validate the optional field `document_type`
      if (jsonObj.get("document_type") != null && !jsonObj.get("document_type").isJsonNull()) {
        DocumentTypes.validateJsonElement(jsonObj.get("document_type"));
      }
      if ((jsonObj.get("issuing_state") != null && !jsonObj.get("issuing_state").isJsonNull()) && !jsonObj.get("issuing_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuing_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuing_state").toString()));
      }
      if ((jsonObj.get("subtype") != null && !jsonObj.get("subtype").isJsonNull()) && !jsonObj.get("subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtype").toString()));
      }
      // validate the optional field `subtype`
      if (jsonObj.get("subtype") != null && !jsonObj.get("subtype").isJsonNull()) {
        SubtypeEnum.validateJsonElement(jsonObj.get("subtype"));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtractionDocumentClassification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtractionDocumentClassification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtractionDocumentClassification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtractionDocumentClassification.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtractionDocumentClassification>() {
           @Override
           public void write(JsonWriter out, ExtractionDocumentClassification value) throws IOException {
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
           public ExtractionDocumentClassification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ExtractionDocumentClassification instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExtractionDocumentClassification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExtractionDocumentClassification
  * @throws IOException if the JSON string is invalid with respect to ExtractionDocumentClassification
  */
  public static ExtractionDocumentClassification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtractionDocumentClassification.class);
  }

 /**
  * Convert an instance of ExtractionDocumentClassification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

