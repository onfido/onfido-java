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
 * DocumentPropertiesDocumentClassification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class DocumentPropertiesDocumentClassification {
  public static final String SERIALIZED_NAME_ISSUING_COUNTRY = "issuing_country";
  @SerializedName(SERIALIZED_NAME_ISSUING_COUNTRY)
  private String issuingCountry;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_ISSUING_STATE = "issuing_state";
  @SerializedName(SERIALIZED_NAME_ISSUING_STATE)
  private String issuingState;

  public DocumentPropertiesDocumentClassification() {
  }

  public DocumentPropertiesDocumentClassification issuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
    return this;
  }

   /**
   * Get issuingCountry
   * @return issuingCountry
  **/
  @javax.annotation.Nullable
  public String getIssuingCountry() {
    return issuingCountry;
  }

  public void setIssuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
  }


  public DocumentPropertiesDocumentClassification documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @javax.annotation.Nullable
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public DocumentPropertiesDocumentClassification issuingState(String issuingState) {
    this.issuingState = issuingState;
    return this;
  }

   /**
   * Get issuingState
   * @return issuingState
  **/
  @javax.annotation.Nullable
  public String getIssuingState() {
    return issuingState;
  }

  public void setIssuingState(String issuingState) {
    this.issuingState = issuingState;
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
   * @return the DocumentPropertiesDocumentClassification instance itself
   */
  public DocumentPropertiesDocumentClassification putAdditionalProperty(String key, Object value) {
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
    DocumentPropertiesDocumentClassification documentPropertiesDocumentClassification = (DocumentPropertiesDocumentClassification) o;
    return Objects.equals(this.issuingCountry, documentPropertiesDocumentClassification.issuingCountry) &&
        Objects.equals(this.documentType, documentPropertiesDocumentClassification.documentType) &&
        Objects.equals(this.issuingState, documentPropertiesDocumentClassification.issuingState)&&
        Objects.equals(this.additionalProperties, documentPropertiesDocumentClassification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuingCountry, documentType, issuingState, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPropertiesDocumentClassification {\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    issuingState: ").append(toIndentedString(issuingState)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentPropertiesDocumentClassification
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentPropertiesDocumentClassification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentPropertiesDocumentClassification is not found in the empty JSON string", DocumentPropertiesDocumentClassification.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("issuing_country") != null && !jsonObj.get("issuing_country").isJsonNull()) && !jsonObj.get("issuing_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuing_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuing_country").toString()));
      }
      if ((jsonObj.get("document_type") != null && !jsonObj.get("document_type").isJsonNull()) && !jsonObj.get("document_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_type").toString()));
      }
      if ((jsonObj.get("issuing_state") != null && !jsonObj.get("issuing_state").isJsonNull()) && !jsonObj.get("issuing_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuing_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuing_state").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentPropertiesDocumentClassification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentPropertiesDocumentClassification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentPropertiesDocumentClassification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentPropertiesDocumentClassification.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentPropertiesDocumentClassification>() {
           @Override
           public void write(JsonWriter out, DocumentPropertiesDocumentClassification value) throws IOException {
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
           public DocumentPropertiesDocumentClassification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DocumentPropertiesDocumentClassification instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentPropertiesDocumentClassification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentPropertiesDocumentClassification
  * @throws IOException if the JSON string is invalid with respect to DocumentPropertiesDocumentClassification
  */
  public static DocumentPropertiesDocumentClassification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentPropertiesDocumentClassification.class);
  }

 /**
  * Convert an instance of DocumentPropertiesDocumentClassification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

