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
import com.onfido.model.ReportName;
import com.onfido.model.UsDrivingLicenceBuilder;
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
 * CheckRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class CheckRequest {
  public static final String SERIALIZED_NAME_REPORT_NAMES = "report_names";
  @SerializedName(SERIALIZED_NAME_REPORT_NAMES)
  private List<ReportName> reportNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOCUMENT_IDS = "document_ids";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_IDS)
  private List<UUID> documentIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICANT_PROVIDES_DATA = "applicant_provides_data";
  @SerializedName(SERIALIZED_NAME_APPLICANT_PROVIDES_DATA)
  private Boolean applicantProvidesData = false;

  public static final String SERIALIZED_NAME_ASYNCHRONOUS = "asynchronous";
  @SerializedName(SERIALIZED_NAME_ASYNCHRONOUS)
  private Boolean asynchronous = true;

  public static final String SERIALIZED_NAME_SUPPRESS_FORM_EMAILS = "suppress_form_emails";
  @SerializedName(SERIALIZED_NAME_SUPPRESS_FORM_EMAILS)
  private Boolean suppressFormEmails;

  public static final String SERIALIZED_NAME_SUB_RESULT = "sub_result";
  @SerializedName(SERIALIZED_NAME_SUB_RESULT)
  private String subResult;

  public static final String SERIALIZED_NAME_CONSIDER = "consider";
  @SerializedName(SERIALIZED_NAME_CONSIDER)
  private List<ReportName> consider = new ArrayList<>();

  public static final String SERIALIZED_NAME_US_DRIVING_LICENCE = "us_driving_licence";
  @SerializedName(SERIALIZED_NAME_US_DRIVING_LICENCE)
  private UsDrivingLicenceBuilder usDrivingLicence;

  public CheckRequest() {
  }

  public CheckRequest reportNames(List<ReportName> reportNames) {
    this.reportNames = reportNames;
    return this;
  }

  public CheckRequest addReportNamesItem(ReportName reportNamesItem) {
    if (this.reportNames == null) {
      this.reportNames = new ArrayList<>();
    }
    this.reportNames.add(reportNamesItem);
    return this;
  }

   /**
   * An array of report names (strings).
   * @return reportNames
  **/
  @javax.annotation.Nonnull
  public List<ReportName> getReportNames() {
    return reportNames;
  }

  public void setReportNames(List<ReportName> reportNames) {
    this.reportNames = reportNames;
  }


  public CheckRequest documentIds(List<UUID> documentIds) {
    this.documentIds = documentIds;
    return this;
  }

  public CheckRequest addDocumentIdsItem(UUID documentIdsItem) {
    if (this.documentIds == null) {
      this.documentIds = new ArrayList<>();
    }
    this.documentIds.add(documentIdsItem);
    return this;
  }

   /**
   * Optional. An array of document ids, for use with Document reports only. If omitted, the Document report will use the most recently uploaded document by default.
   * @return documentIds
  **/
  @javax.annotation.Nullable
  public List<UUID> getDocumentIds() {
    return documentIds;
  }

  public void setDocumentIds(List<UUID> documentIds) {
    this.documentIds = documentIds;
  }


  public CheckRequest applicantProvidesData(Boolean applicantProvidesData) {
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


  public CheckRequest asynchronous(Boolean asynchronous) {
    this.asynchronous = asynchronous;
    return this;
  }

   /**
   * Defaults to &#x60;true&#x60;. If set to &#x60;false&#x60;, you will only receive a response when all reports in your check have completed. 
   * @return asynchronous
  **/
  @javax.annotation.Nullable
  public Boolean getAsynchronous() {
    return asynchronous;
  }

  public void setAsynchronous(Boolean asynchronous) {
    this.asynchronous = asynchronous;
  }


  public CheckRequest suppressFormEmails(Boolean suppressFormEmails) {
    this.suppressFormEmails = suppressFormEmails;
    return this;
  }

   /**
   * For checks where &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;, applicant form will not be automatically sent if &#x60;suppress_form_emails&#x60; is set to &#x60;true&#x60;. You can manually send the form at any time after the check has been created, using the link found in the form_uri attribute of the check object. Write-only. Defaults to false. 
   * @return suppressFormEmails
  **/
  @javax.annotation.Nullable
  public Boolean getSuppressFormEmails() {
    return suppressFormEmails;
  }

  public void setSuppressFormEmails(Boolean suppressFormEmails) {
    this.suppressFormEmails = suppressFormEmails;
  }


  public CheckRequest subResult(String subResult) {
    this.subResult = subResult;
    return this;
  }

   /**
   * Triggers responses for particular sub-results for sandbox Document reports.
   * @return subResult
  **/
  @javax.annotation.Nullable
  public String getSubResult() {
    return subResult;
  }

  public void setSubResult(String subResult) {
    this.subResult = subResult;
  }


  public CheckRequest consider(List<ReportName> consider) {
    this.consider = consider;
    return this;
  }

  public CheckRequest addConsiderItem(ReportName considerItem) {
    if (this.consider == null) {
      this.consider = new ArrayList<>();
    }
    this.consider.add(considerItem);
    return this;
  }

   /**
   * Array of names of particular reports to return consider as their results. This is a feature available in sandbox testing
   * @return consider
  **/
  @javax.annotation.Nullable
  public List<ReportName> getConsider() {
    return consider;
  }

  public void setConsider(List<ReportName> consider) {
    this.consider = consider;
  }


  public CheckRequest usDrivingLicence(UsDrivingLicenceBuilder usDrivingLicence) {
    this.usDrivingLicence = usDrivingLicence;
    return this;
  }

   /**
   * Get usDrivingLicence
   * @return usDrivingLicence
  **/
  @javax.annotation.Nullable
  public UsDrivingLicenceBuilder getUsDrivingLicence() {
    return usDrivingLicence;
  }

  public void setUsDrivingLicence(UsDrivingLicenceBuilder usDrivingLicence) {
    this.usDrivingLicence = usDrivingLicence;
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
   * @return the CheckRequest instance itself
   */
  public CheckRequest putAdditionalProperty(String key, Object value) {
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
    CheckRequest checkRequest = (CheckRequest) o;
    return Objects.equals(this.reportNames, checkRequest.reportNames) &&
        Objects.equals(this.documentIds, checkRequest.documentIds) &&
        Objects.equals(this.applicantProvidesData, checkRequest.applicantProvidesData) &&
        Objects.equals(this.asynchronous, checkRequest.asynchronous) &&
        Objects.equals(this.suppressFormEmails, checkRequest.suppressFormEmails) &&
        Objects.equals(this.subResult, checkRequest.subResult) &&
        Objects.equals(this.consider, checkRequest.consider) &&
        Objects.equals(this.usDrivingLicence, checkRequest.usDrivingLicence)&&
        Objects.equals(this.additionalProperties, checkRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportNames, documentIds, applicantProvidesData, asynchronous, suppressFormEmails, subResult, consider, usDrivingLicence, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckRequest {\n");
    sb.append("    reportNames: ").append(toIndentedString(reportNames)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
    sb.append("    applicantProvidesData: ").append(toIndentedString(applicantProvidesData)).append("\n");
    sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    sb.append("    suppressFormEmails: ").append(toIndentedString(suppressFormEmails)).append("\n");
    sb.append("    subResult: ").append(toIndentedString(subResult)).append("\n");
    sb.append("    consider: ").append(toIndentedString(consider)).append("\n");
    sb.append("    usDrivingLicence: ").append(toIndentedString(usDrivingLicence)).append("\n");
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
    openapiFields.add("report_names");
    openapiFields.add("document_ids");
    openapiFields.add("applicant_provides_data");
    openapiFields.add("asynchronous");
    openapiFields.add("suppress_form_emails");
    openapiFields.add("sub_result");
    openapiFields.add("consider");
    openapiFields.add("us_driving_licence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("report_names");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CheckRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CheckRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckRequest is not found in the empty JSON string", CheckRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("report_names") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("report_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_names` to be an array in the JSON string but got `%s`", jsonObj.get("report_names").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("document_ids") != null && !jsonObj.get("document_ids").isJsonNull() && !jsonObj.get("document_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_ids` to be an array in the JSON string but got `%s`", jsonObj.get("document_ids").toString()));
      }
      if ((jsonObj.get("sub_result") != null && !jsonObj.get("sub_result").isJsonNull()) && !jsonObj.get("sub_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_result").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("consider") != null && !jsonObj.get("consider").isJsonNull() && !jsonObj.get("consider").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `consider` to be an array in the JSON string but got `%s`", jsonObj.get("consider").toString()));
      }
      // validate the optional field `us_driving_licence`
      if (jsonObj.get("us_driving_licence") != null && !jsonObj.get("us_driving_licence").isJsonNull()) {
        UsDrivingLicenceBuilder.validateJsonElement(jsonObj.get("us_driving_licence"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckRequest>() {
           @Override
           public void write(JsonWriter out, CheckRequest value) throws IOException {
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
           public CheckRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CheckRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CheckRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckRequest
  * @throws IOException if the JSON string is invalid with respect to CheckRequest
  */
  public static CheckRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckRequest.class);
  }

 /**
  * Convert an instance of CheckRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

