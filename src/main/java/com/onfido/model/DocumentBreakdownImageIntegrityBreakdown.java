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
import com.onfido.model.DocumentBreakdownImageIntegrityBreakdownColourPicture;
import com.onfido.model.DocumentBreakdownImageIntegrityBreakdownConclusiveDocumentQuality;
import com.onfido.model.DocumentBreakdownImageIntegrityBreakdownImageQuality;
import com.onfido.model.DocumentBreakdownImageIntegrityBreakdownSupportedDocument;
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
 * DocumentBreakdownImageIntegrityBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class DocumentBreakdownImageIntegrityBreakdown {
  public static final String SERIALIZED_NAME_IMAGE_QUALITY = "image_quality";
  @SerializedName(SERIALIZED_NAME_IMAGE_QUALITY)
  private DocumentBreakdownImageIntegrityBreakdownImageQuality imageQuality;

  public static final String SERIALIZED_NAME_SUPPORTED_DOCUMENT = "supported_document";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DOCUMENT)
  private DocumentBreakdownImageIntegrityBreakdownSupportedDocument supportedDocument;

  public static final String SERIALIZED_NAME_COLOUR_PICTURE = "colour_picture";
  @SerializedName(SERIALIZED_NAME_COLOUR_PICTURE)
  private DocumentBreakdownImageIntegrityBreakdownColourPicture colourPicture;

  public static final String SERIALIZED_NAME_CONCLUSIVE_DOCUMENT_QUALITY = "conclusive_document_quality";
  @SerializedName(SERIALIZED_NAME_CONCLUSIVE_DOCUMENT_QUALITY)
  private DocumentBreakdownImageIntegrityBreakdownConclusiveDocumentQuality conclusiveDocumentQuality;

  public DocumentBreakdownImageIntegrityBreakdown() {
  }

  public DocumentBreakdownImageIntegrityBreakdown imageQuality(DocumentBreakdownImageIntegrityBreakdownImageQuality imageQuality) {
    this.imageQuality = imageQuality;
    return this;
  }

   /**
   * Get imageQuality
   * @return imageQuality
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownImageIntegrityBreakdownImageQuality getImageQuality() {
    return imageQuality;
  }

  public void setImageQuality(DocumentBreakdownImageIntegrityBreakdownImageQuality imageQuality) {
    this.imageQuality = imageQuality;
  }


  public DocumentBreakdownImageIntegrityBreakdown supportedDocument(DocumentBreakdownImageIntegrityBreakdownSupportedDocument supportedDocument) {
    this.supportedDocument = supportedDocument;
    return this;
  }

   /**
   * Get supportedDocument
   * @return supportedDocument
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownImageIntegrityBreakdownSupportedDocument getSupportedDocument() {
    return supportedDocument;
  }

  public void setSupportedDocument(DocumentBreakdownImageIntegrityBreakdownSupportedDocument supportedDocument) {
    this.supportedDocument = supportedDocument;
  }


  public DocumentBreakdownImageIntegrityBreakdown colourPicture(DocumentBreakdownImageIntegrityBreakdownColourPicture colourPicture) {
    this.colourPicture = colourPicture;
    return this;
  }

   /**
   * Get colourPicture
   * @return colourPicture
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownImageIntegrityBreakdownColourPicture getColourPicture() {
    return colourPicture;
  }

  public void setColourPicture(DocumentBreakdownImageIntegrityBreakdownColourPicture colourPicture) {
    this.colourPicture = colourPicture;
  }


  public DocumentBreakdownImageIntegrityBreakdown conclusiveDocumentQuality(DocumentBreakdownImageIntegrityBreakdownConclusiveDocumentQuality conclusiveDocumentQuality) {
    this.conclusiveDocumentQuality = conclusiveDocumentQuality;
    return this;
  }

   /**
   * Get conclusiveDocumentQuality
   * @return conclusiveDocumentQuality
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownImageIntegrityBreakdownConclusiveDocumentQuality getConclusiveDocumentQuality() {
    return conclusiveDocumentQuality;
  }

  public void setConclusiveDocumentQuality(DocumentBreakdownImageIntegrityBreakdownConclusiveDocumentQuality conclusiveDocumentQuality) {
    this.conclusiveDocumentQuality = conclusiveDocumentQuality;
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
   * @return the DocumentBreakdownImageIntegrityBreakdown instance itself
   */
  public DocumentBreakdownImageIntegrityBreakdown putAdditionalProperty(String key, Object value) {
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
    DocumentBreakdownImageIntegrityBreakdown documentBreakdownImageIntegrityBreakdown = (DocumentBreakdownImageIntegrityBreakdown) o;
    return Objects.equals(this.imageQuality, documentBreakdownImageIntegrityBreakdown.imageQuality) &&
        Objects.equals(this.supportedDocument, documentBreakdownImageIntegrityBreakdown.supportedDocument) &&
        Objects.equals(this.colourPicture, documentBreakdownImageIntegrityBreakdown.colourPicture) &&
        Objects.equals(this.conclusiveDocumentQuality, documentBreakdownImageIntegrityBreakdown.conclusiveDocumentQuality)&&
        Objects.equals(this.additionalProperties, documentBreakdownImageIntegrityBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageQuality, supportedDocument, colourPicture, conclusiveDocumentQuality, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBreakdownImageIntegrityBreakdown {\n");
    sb.append("    imageQuality: ").append(toIndentedString(imageQuality)).append("\n");
    sb.append("    supportedDocument: ").append(toIndentedString(supportedDocument)).append("\n");
    sb.append("    colourPicture: ").append(toIndentedString(colourPicture)).append("\n");
    sb.append("    conclusiveDocumentQuality: ").append(toIndentedString(conclusiveDocumentQuality)).append("\n");
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
    openapiFields.add("image_quality");
    openapiFields.add("supported_document");
    openapiFields.add("colour_picture");
    openapiFields.add("conclusive_document_quality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentBreakdownImageIntegrityBreakdown
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentBreakdownImageIntegrityBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentBreakdownImageIntegrityBreakdown is not found in the empty JSON string", DocumentBreakdownImageIntegrityBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `image_quality`
      if (jsonObj.get("image_quality") != null && !jsonObj.get("image_quality").isJsonNull()) {
        DocumentBreakdownImageIntegrityBreakdownImageQuality.validateJsonElement(jsonObj.get("image_quality"));
      }
      // validate the optional field `supported_document`
      if (jsonObj.get("supported_document") != null && !jsonObj.get("supported_document").isJsonNull()) {
        DocumentBreakdownImageIntegrityBreakdownSupportedDocument.validateJsonElement(jsonObj.get("supported_document"));
      }
      // validate the optional field `colour_picture`
      if (jsonObj.get("colour_picture") != null && !jsonObj.get("colour_picture").isJsonNull()) {
        DocumentBreakdownImageIntegrityBreakdownColourPicture.validateJsonElement(jsonObj.get("colour_picture"));
      }
      // validate the optional field `conclusive_document_quality`
      if (jsonObj.get("conclusive_document_quality") != null && !jsonObj.get("conclusive_document_quality").isJsonNull()) {
        DocumentBreakdownImageIntegrityBreakdownConclusiveDocumentQuality.validateJsonElement(jsonObj.get("conclusive_document_quality"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentBreakdownImageIntegrityBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentBreakdownImageIntegrityBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentBreakdownImageIntegrityBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentBreakdownImageIntegrityBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentBreakdownImageIntegrityBreakdown>() {
           @Override
           public void write(JsonWriter out, DocumentBreakdownImageIntegrityBreakdown value) throws IOException {
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
           public DocumentBreakdownImageIntegrityBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DocumentBreakdownImageIntegrityBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentBreakdownImageIntegrityBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentBreakdownImageIntegrityBreakdown
  * @throws IOException if the JSON string is invalid with respect to DocumentBreakdownImageIntegrityBreakdown
  */
  public static DocumentBreakdownImageIntegrityBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentBreakdownImageIntegrityBreakdown.class);
  }

 /**
  * Convert an instance of DocumentBreakdownImageIntegrityBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

