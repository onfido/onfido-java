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
import com.onfido.model.ReportConfiguration;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.onfido.JSON;

/**
 * CheckBuilder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CheckBuilder {
  public static final String SERIALIZED_NAME_WEBHOOK_IDS = "webhook_ids";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_IDS)
  @javax.annotation.Nullable
  private List<String> webhookIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicant_id";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  @javax.annotation.Nonnull
  private UUID applicantId;

  public static final String SERIALIZED_NAME_APPLICANT_PROVIDES_DATA = "applicant_provides_data";
  @SerializedName(SERIALIZED_NAME_APPLICANT_PROVIDES_DATA)
  @javax.annotation.Nullable
  private Boolean applicantProvidesData = false;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirect_uri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  @javax.annotation.Nullable
  private String redirectUri;

  public static final String SERIALIZED_NAME_PRIVACY_NOTICES_READ_CONSENT_GIVEN = "privacy_notices_read_consent_given";
  @SerializedName(SERIALIZED_NAME_PRIVACY_NOTICES_READ_CONSENT_GIVEN)
  @javax.annotation.Nullable
  private Boolean privacyNoticesReadConsentGiven;

  public static final String SERIALIZED_NAME_REPORT_NAMES = "report_names";
  @SerializedName(SERIALIZED_NAME_REPORT_NAMES)
  @javax.annotation.Nonnull
  private List<ReportName> reportNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOCUMENT_IDS = "document_ids";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_IDS)
  @javax.annotation.Nullable
  private List<UUID> documentIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASYNCHRONOUS = "asynchronous";
  @SerializedName(SERIALIZED_NAME_ASYNCHRONOUS)
  @javax.annotation.Nullable
  private Boolean asynchronous = true;

  public static final String SERIALIZED_NAME_SUPPRESS_FORM_EMAILS = "suppress_form_emails";
  @SerializedName(SERIALIZED_NAME_SUPPRESS_FORM_EMAILS)
  @javax.annotation.Nullable
  private Boolean suppressFormEmails;

  public static final String SERIALIZED_NAME_SUB_RESULT = "sub_result";
  @SerializedName(SERIALIZED_NAME_SUB_RESULT)
  @javax.annotation.Nullable
  private String subResult;

  public static final String SERIALIZED_NAME_CONSIDER = "consider";
  @SerializedName(SERIALIZED_NAME_CONSIDER)
  @javax.annotation.Nullable
  private List<ReportName> consider = new ArrayList<>();

  public static final String SERIALIZED_NAME_US_DRIVING_LICENCE = "us_driving_licence";
  @SerializedName(SERIALIZED_NAME_US_DRIVING_LICENCE)
  @javax.annotation.Nullable
  private UsDrivingLicenceBuilder usDrivingLicence;

  public static final String SERIALIZED_NAME_REPORT_CONFIGURATION = "report_configuration";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_REPORT_CONFIGURATION)
  @javax.annotation.Nullable
  private ReportConfiguration reportConfiguration;

  public CheckBuilder() {
  }

  public CheckBuilder webhookIds(@javax.annotation.Nullable List<String> webhookIds) {
    this.webhookIds = webhookIds;
    return this;
  }

  public CheckBuilder addWebhookIdsItem(String webhookIdsItem) {
    if (this.webhookIds == null) {
      this.webhookIds = new ArrayList<>();
    }
    this.webhookIds.add(webhookIdsItem);
    return this;
  }

  /**
   * An array of webhook ids describing which webhooks to trigger for this check.
   * @return webhookIds
   */
  @javax.annotation.Nullable
  public List<String> getWebhookIds() {
    return webhookIds;
  }

  public void setWebhookIds(@javax.annotation.Nullable List<String> webhookIds) {
    this.webhookIds = webhookIds;
  }


  public CheckBuilder applicantId(@javax.annotation.Nonnull UUID applicantId) {
    this.applicantId = applicantId;
    return this;
  }

  /**
   * The ID of the applicant to do the check on.
   * @return applicantId
   */
  @javax.annotation.Nonnull
  public UUID getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(@javax.annotation.Nonnull UUID applicantId) {
    this.applicantId = applicantId;
  }


  public CheckBuilder applicantProvidesData(@javax.annotation.Nullable Boolean applicantProvidesData) {
    this.applicantProvidesData = applicantProvidesData;
    return this;
  }

  /**
   * Send an applicant form to applicant to complete to proceed with check. Defaults to false.
   * @return applicantProvidesData
   */
  @javax.annotation.Nullable
  public Boolean getApplicantProvidesData() {
    return applicantProvidesData;
  }

  public void setApplicantProvidesData(@javax.annotation.Nullable Boolean applicantProvidesData) {
    this.applicantProvidesData = applicantProvidesData;
  }


  public CheckBuilder tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CheckBuilder addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Array of tags being assigned to this check.
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public CheckBuilder redirectUri(@javax.annotation.Nullable String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * For checks where &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;, redirect to this URI when the applicant has submitted their data.
   * @return redirectUri
   */
  @javax.annotation.Nullable
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(@javax.annotation.Nullable String redirectUri) {
    this.redirectUri = redirectUri;
  }


  public CheckBuilder privacyNoticesReadConsentGiven(@javax.annotation.Nullable Boolean privacyNoticesReadConsentGiven) {
    this.privacyNoticesReadConsentGiven = privacyNoticesReadConsentGiven;
    return this;
  }

  /**
   * Get privacyNoticesReadConsentGiven
   * @return privacyNoticesReadConsentGiven
   */
  @javax.annotation.Nullable
  public Boolean getPrivacyNoticesReadConsentGiven() {
    return privacyNoticesReadConsentGiven;
  }

  public void setPrivacyNoticesReadConsentGiven(@javax.annotation.Nullable Boolean privacyNoticesReadConsentGiven) {
    this.privacyNoticesReadConsentGiven = privacyNoticesReadConsentGiven;
  }


  public CheckBuilder reportNames(@javax.annotation.Nonnull List<ReportName> reportNames) {
    this.reportNames = reportNames;
    return this;
  }

  public CheckBuilder addReportNamesItem(ReportName reportNamesItem) {
    if (this.reportNames == null) {
      this.reportNames = new ArrayList<>();
    }
    this.reportNames.add(reportNamesItem);
    return this;
  }

  /**
   * An array of report names (strings).
   * @return reportNames
   */
  @javax.annotation.Nonnull
  public List<ReportName> getReportNames() {
    return reportNames;
  }

  public void setReportNames(@javax.annotation.Nonnull List<ReportName> reportNames) {
    this.reportNames = reportNames;
  }


  public CheckBuilder documentIds(@javax.annotation.Nullable List<UUID> documentIds) {
    this.documentIds = documentIds;
    return this;
  }

  public CheckBuilder addDocumentIdsItem(UUID documentIdsItem) {
    if (this.documentIds == null) {
      this.documentIds = new ArrayList<>();
    }
    this.documentIds.add(documentIdsItem);
    return this;
  }

  /**
   * Optional. An array of document ids, for use with Document reports only. If omitted, the Document report will use the most recently uploaded document by default.
   * @return documentIds
   */
  @javax.annotation.Nullable
  public List<UUID> getDocumentIds() {
    return documentIds;
  }

  public void setDocumentIds(@javax.annotation.Nullable List<UUID> documentIds) {
    this.documentIds = documentIds;
  }


  public CheckBuilder asynchronous(@javax.annotation.Nullable Boolean asynchronous) {
    this.asynchronous = asynchronous;
    return this;
  }

  /**
   * Defaults to &#x60;true&#x60;. If set to &#x60;false&#x60;, you will only receive a response when all reports in your check have completed. 
   * @return asynchronous
   */
  @javax.annotation.Nullable
  public Boolean getAsynchronous() {
    return asynchronous;
  }

  public void setAsynchronous(@javax.annotation.Nullable Boolean asynchronous) {
    this.asynchronous = asynchronous;
  }


  public CheckBuilder suppressFormEmails(@javax.annotation.Nullable Boolean suppressFormEmails) {
    this.suppressFormEmails = suppressFormEmails;
    return this;
  }

  /**
   * For checks where &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;, applicant form will not be automatically sent if &#x60;suppress_form_emails&#x60; is set to &#x60;true&#x60;. You can manually send the form at any time after the check has been created, using the link found in the form_uri attribute of the check object. Write-only. Defaults to false. 
   * @return suppressFormEmails
   */
  @javax.annotation.Nullable
  public Boolean getSuppressFormEmails() {
    return suppressFormEmails;
  }

  public void setSuppressFormEmails(@javax.annotation.Nullable Boolean suppressFormEmails) {
    this.suppressFormEmails = suppressFormEmails;
  }


  public CheckBuilder subResult(@javax.annotation.Nullable String subResult) {
    this.subResult = subResult;
    return this;
  }

  /**
   * Triggers responses for particular sub-results for sandbox Document reports.
   * @return subResult
   */
  @javax.annotation.Nullable
  public String getSubResult() {
    return subResult;
  }

  public void setSubResult(@javax.annotation.Nullable String subResult) {
    this.subResult = subResult;
  }


  public CheckBuilder consider(@javax.annotation.Nullable List<ReportName> consider) {
    this.consider = consider;
    return this;
  }

  public CheckBuilder addConsiderItem(ReportName considerItem) {
    if (this.consider == null) {
      this.consider = new ArrayList<>();
    }
    this.consider.add(considerItem);
    return this;
  }

  /**
   * Array of names of particular reports to return consider as their results. This is a feature available in sandbox testing
   * @return consider
   */
  @javax.annotation.Nullable
  public List<ReportName> getConsider() {
    return consider;
  }

  public void setConsider(@javax.annotation.Nullable List<ReportName> consider) {
    this.consider = consider;
  }


  public CheckBuilder usDrivingLicence(@javax.annotation.Nullable UsDrivingLicenceBuilder usDrivingLicence) {
    this.usDrivingLicence = usDrivingLicence;
    return this;
  }

  /**
   * Get usDrivingLicence
   * @return usDrivingLicence
   */
  @javax.annotation.Nullable
  public UsDrivingLicenceBuilder getUsDrivingLicence() {
    return usDrivingLicence;
  }

  public void setUsDrivingLicence(@javax.annotation.Nullable UsDrivingLicenceBuilder usDrivingLicence) {
    this.usDrivingLicence = usDrivingLicence;
  }


  @Deprecated
  public CheckBuilder reportConfiguration(@javax.annotation.Nullable ReportConfiguration reportConfiguration) {
    this.reportConfiguration = reportConfiguration;
    return this;
  }

  /**
   * Get reportConfiguration
   * @return reportConfiguration
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public ReportConfiguration getReportConfiguration() {
    return reportConfiguration;
  }

  @Deprecated
  public void setReportConfiguration(@javax.annotation.Nullable ReportConfiguration reportConfiguration) {
    this.reportConfiguration = reportConfiguration;
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
   * @return the CheckBuilder instance itself
   */
  public CheckBuilder putAdditionalProperty(String key, Object value) {
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
    CheckBuilder checkBuilder = (CheckBuilder) o;
    return Objects.equals(this.webhookIds, checkBuilder.webhookIds) &&
        Objects.equals(this.applicantId, checkBuilder.applicantId) &&
        Objects.equals(this.applicantProvidesData, checkBuilder.applicantProvidesData) &&
        Objects.equals(this.tags, checkBuilder.tags) &&
        Objects.equals(this.redirectUri, checkBuilder.redirectUri) &&
        Objects.equals(this.privacyNoticesReadConsentGiven, checkBuilder.privacyNoticesReadConsentGiven) &&
        Objects.equals(this.reportNames, checkBuilder.reportNames) &&
        Objects.equals(this.documentIds, checkBuilder.documentIds) &&
        Objects.equals(this.asynchronous, checkBuilder.asynchronous) &&
        Objects.equals(this.suppressFormEmails, checkBuilder.suppressFormEmails) &&
        Objects.equals(this.subResult, checkBuilder.subResult) &&
        Objects.equals(this.consider, checkBuilder.consider) &&
        Objects.equals(this.usDrivingLicence, checkBuilder.usDrivingLicence) &&
        Objects.equals(this.reportConfiguration, checkBuilder.reportConfiguration)&&
        Objects.equals(this.additionalProperties, checkBuilder.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookIds, applicantId, applicantProvidesData, tags, redirectUri, privacyNoticesReadConsentGiven, reportNames, documentIds, asynchronous, suppressFormEmails, subResult, consider, usDrivingLicence, reportConfiguration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckBuilder {\n");
    sb.append("    webhookIds: ").append(toIndentedString(webhookIds)).append("\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    applicantProvidesData: ").append(toIndentedString(applicantProvidesData)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    privacyNoticesReadConsentGiven: ").append(toIndentedString(privacyNoticesReadConsentGiven)).append("\n");
    sb.append("    reportNames: ").append(toIndentedString(reportNames)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
    sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    sb.append("    suppressFormEmails: ").append(toIndentedString(suppressFormEmails)).append("\n");
    sb.append("    subResult: ").append(toIndentedString(subResult)).append("\n");
    sb.append("    consider: ").append(toIndentedString(consider)).append("\n");
    sb.append("    usDrivingLicence: ").append(toIndentedString(usDrivingLicence)).append("\n");
    sb.append("    reportConfiguration: ").append(toIndentedString(reportConfiguration)).append("\n");
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
    openapiFields.add("report_names");
    openapiFields.add("document_ids");
    openapiFields.add("asynchronous");
    openapiFields.add("suppress_form_emails");
    openapiFields.add("sub_result");
    openapiFields.add("consider");
    openapiFields.add("us_driving_licence");
    openapiFields.add("report_configuration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("applicant_id");
    openapiRequiredFields.add("report_names");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CheckBuilder
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CheckBuilder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckBuilder is not found in the empty JSON string", CheckBuilder.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckBuilder.openapiRequiredFields) {
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
      // validate the optional field `report_configuration`
      if (jsonObj.get("report_configuration") != null && !jsonObj.get("report_configuration").isJsonNull()) {
        ReportConfiguration.validateJsonElement(jsonObj.get("report_configuration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckBuilder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckBuilder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckBuilder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckBuilder.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckBuilder>() {
           @Override
           public void write(JsonWriter out, CheckBuilder value) throws IOException {
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
           public CheckBuilder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CheckBuilder instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CheckBuilder given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckBuilder
   * @throws IOException if the JSON string is invalid with respect to CheckBuilder
   */
  public static CheckBuilder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckBuilder.class);
  }

  /**
   * Convert an instance of CheckBuilder to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

