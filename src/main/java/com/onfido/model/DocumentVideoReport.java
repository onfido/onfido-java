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
import com.onfido.model.DocumentBreakdown;
import com.onfido.model.DocumentProperties;
import com.onfido.model.ReportDocument;
import com.onfido.model.ReportName;
import com.onfido.model.ReportResult;
import com.onfido.model.ReportStatus;
import com.onfido.model.ReportSubResult;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * DocumentVideoReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class DocumentVideoReport {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ReportStatus status;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ReportResult result;

  public static final String SERIALIZED_NAME_SUB_RESULT = "sub_result";
  @SerializedName(SERIALIZED_NAME_SUB_RESULT)
  private ReportSubResult subResult;

  public static final String SERIALIZED_NAME_CHECK_ID = "check_id";
  @SerializedName(SERIALIZED_NAME_CHECK_ID)
  private UUID checkId;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<ReportDocument> documents = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private ReportName name;

  public static final String SERIALIZED_NAME_BREAKDOWN = "breakdown";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN)
  private DocumentBreakdown breakdown;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private DocumentProperties properties;

  public DocumentVideoReport() {
  }

  public DocumentVideoReport id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the report. Read-only.
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public DocumentVideoReport createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time at which the report was first initiated. Read-only.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DocumentVideoReport href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The API endpoint to retrieve the report. Read-only.
   * @return href
  **/
  @javax.annotation.Nullable
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public DocumentVideoReport status(ReportStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ReportStatus getStatus() {
    return status;
  }

  public void setStatus(ReportStatus status) {
    this.status = status;
  }


  public DocumentVideoReport result(ReportResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public ReportResult getResult() {
    return result;
  }

  public void setResult(ReportResult result) {
    this.result = result;
  }


  public DocumentVideoReport subResult(ReportSubResult subResult) {
    this.subResult = subResult;
    return this;
  }

   /**
   * Get subResult
   * @return subResult
  **/
  @javax.annotation.Nullable
  public ReportSubResult getSubResult() {
    return subResult;
  }

  public void setSubResult(ReportSubResult subResult) {
    this.subResult = subResult;
  }


  public DocumentVideoReport checkId(UUID checkId) {
    this.checkId = checkId;
    return this;
  }

   /**
   * The ID of the check to which the report belongs. Read-only.
   * @return checkId
  **/
  @javax.annotation.Nullable
  public UUID getCheckId() {
    return checkId;
  }

  public void setCheckId(UUID checkId) {
    this.checkId = checkId;
  }


  public DocumentVideoReport documents(List<ReportDocument> documents) {
    this.documents = documents;
    return this;
  }

  public DocumentVideoReport addDocumentsItem(ReportDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Array of objects with document ids that were used in the Onfido engine. [ONLY POPULATED FOR DOCUMENT AND FACIAL SIMILARITY REPORTS]
   * @return documents
  **/
  @javax.annotation.Nullable
  public List<ReportDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<ReportDocument> documents) {
    this.documents = documents;
  }


  public DocumentVideoReport name(ReportName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public ReportName getName() {
    return name;
  }

  public void setName(ReportName name) {
    this.name = name;
  }


  public DocumentVideoReport breakdown(DocumentBreakdown breakdown) {
    this.breakdown = breakdown;
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @javax.annotation.Nullable
  public DocumentBreakdown getBreakdown() {
    return breakdown;
  }

  public void setBreakdown(DocumentBreakdown breakdown) {
    this.breakdown = breakdown;
  }


  public DocumentVideoReport properties(DocumentProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  public DocumentProperties getProperties() {
    return properties;
  }

  public void setProperties(DocumentProperties properties) {
    this.properties = properties;
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
   * @return the DocumentVideoReport instance itself
   */
  public DocumentVideoReport putAdditionalProperty(String key, Object value) {
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
    DocumentVideoReport documentVideoReport = (DocumentVideoReport) o;
    return Objects.equals(this.id, documentVideoReport.id) &&
        Objects.equals(this.createdAt, documentVideoReport.createdAt) &&
        Objects.equals(this.href, documentVideoReport.href) &&
        Objects.equals(this.status, documentVideoReport.status) &&
        Objects.equals(this.result, documentVideoReport.result) &&
        Objects.equals(this.subResult, documentVideoReport.subResult) &&
        Objects.equals(this.checkId, documentVideoReport.checkId) &&
        Objects.equals(this.documents, documentVideoReport.documents) &&
        Objects.equals(this.name, documentVideoReport.name) &&
        Objects.equals(this.breakdown, documentVideoReport.breakdown) &&
        Objects.equals(this.properties, documentVideoReport.properties)&&
        Objects.equals(this.additionalProperties, documentVideoReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, href, status, result, subResult, checkId, documents, name, breakdown, properties, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentVideoReport {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    subResult: ").append(toIndentedString(subResult)).append("\n");
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("result");
    openapiFields.add("sub_result");
    openapiFields.add("check_id");
    openapiFields.add("documents");
    openapiFields.add("name");
    openapiFields.add("breakdown");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentVideoReport
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentVideoReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentVideoReport is not found in the empty JSON string", DocumentVideoReport.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocumentVideoReport.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        ReportStatus.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `result`
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        ReportResult.validateJsonElement(jsonObj.get("result"));
      }
      // validate the optional field `sub_result`
      if (jsonObj.get("sub_result") != null && !jsonObj.get("sub_result").isJsonNull()) {
        ReportSubResult.validateJsonElement(jsonObj.get("sub_result"));
      }
      if ((jsonObj.get("check_id") != null && !jsonObj.get("check_id").isJsonNull()) && !jsonObj.get("check_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_id").toString()));
      }
      if (jsonObj.get("documents") != null && !jsonObj.get("documents").isJsonNull()) {
        JsonArray jsonArraydocuments = jsonObj.getAsJsonArray("documents");
        if (jsonArraydocuments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("documents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `documents` to be an array in the JSON string but got `%s`", jsonObj.get("documents").toString()));
          }

          // validate the optional field `documents` (array)
          for (int i = 0; i < jsonArraydocuments.size(); i++) {
            ReportDocument.validateJsonElement(jsonArraydocuments.get(i));
          };
        }
      }
      // validate the required field `name`
      ReportName.validateJsonElement(jsonObj.get("name"));
      // validate the optional field `breakdown`
      if (jsonObj.get("breakdown") != null && !jsonObj.get("breakdown").isJsonNull()) {
        DocumentBreakdown.validateJsonElement(jsonObj.get("breakdown"));
      }
      // validate the optional field `properties`
      if (jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) {
        DocumentProperties.validateJsonElement(jsonObj.get("properties"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentVideoReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentVideoReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentVideoReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentVideoReport.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentVideoReport>() {
           @Override
           public void write(JsonWriter out, DocumentVideoReport value) throws IOException {
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
           public DocumentVideoReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DocumentVideoReport instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentVideoReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentVideoReport
  * @throws IOException if the JSON string is invalid with respect to DocumentVideoReport
  */
  public static DocumentVideoReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentVideoReport.class);
  }

 /**
  * Convert an instance of DocumentVideoReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

