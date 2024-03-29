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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.onfido.model.ReportName;
import com.onfido.model.UsDrivingLicenceBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * CheckBuilder
 */
@JsonPropertyOrder({
  CheckBuilder.JSON_PROPERTY_WEBHOOK_IDS,
  CheckBuilder.JSON_PROPERTY_APPLICANT_ID,
  CheckBuilder.JSON_PROPERTY_APPLICANT_PROVIDES_DATA,
  CheckBuilder.JSON_PROPERTY_TAGS,
  CheckBuilder.JSON_PROPERTY_REDIRECT_URI,
  CheckBuilder.JSON_PROPERTY_REPORT_NAMES,
  CheckBuilder.JSON_PROPERTY_DOCUMENT_IDS,
  CheckBuilder.JSON_PROPERTY_ASYNCHRONOUS,
  CheckBuilder.JSON_PROPERTY_SUPPRESS_FORM_EMAILS,
  CheckBuilder.JSON_PROPERTY_SUB_RESULT,
  CheckBuilder.JSON_PROPERTY_CONSIDER,
  CheckBuilder.JSON_PROPERTY_US_DRIVING_LICENCE
})
@JsonTypeName("check_builder")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CheckBuilder {
  public static final String JSON_PROPERTY_WEBHOOK_IDS = "webhook_ids";
  private List<String> webhookIds;

  public static final String JSON_PROPERTY_APPLICANT_ID = "applicant_id";
  private UUID applicantId;

  public static final String JSON_PROPERTY_APPLICANT_PROVIDES_DATA = "applicant_provides_data";
  private Boolean applicantProvidesData = false;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags;

  public static final String JSON_PROPERTY_REDIRECT_URI = "redirect_uri";
  private String redirectUri;

  public static final String JSON_PROPERTY_REPORT_NAMES = "report_names";
  private List<ReportName> reportNames = new ArrayList<>();

  public static final String JSON_PROPERTY_DOCUMENT_IDS = "document_ids";
  private List<UUID> documentIds;

  public static final String JSON_PROPERTY_ASYNCHRONOUS = "asynchronous";
  private Boolean asynchronous = true;

  public static final String JSON_PROPERTY_SUPPRESS_FORM_EMAILS = "suppress_form_emails";
  private Boolean suppressFormEmails;

  public static final String JSON_PROPERTY_SUB_RESULT = "sub_result";
  private String subResult;

  public static final String JSON_PROPERTY_CONSIDER = "consider";
  private List<ReportName> consider;

  public static final String JSON_PROPERTY_US_DRIVING_LICENCE = "us_driving_licence";
  private UsDrivingLicenceBuilder usDrivingLicence;

  public CheckBuilder() { 
  }

  public CheckBuilder webhookIds(List<String> webhookIds) {
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
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBHOOK_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWebhookIds() {
    return webhookIds;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookIds(List<String> webhookIds) {
    this.webhookIds = webhookIds;
  }


  public CheckBuilder applicantId(UUID applicantId) {
    this.applicantId = applicantId;
    return this;
  }

   /**
   * The ID of the applicant to do the check on.
   * @return applicantId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APPLICANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getApplicantId() {
    return applicantId;
  }


  @JsonProperty(JSON_PROPERTY_APPLICANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplicantId(UUID applicantId) {
    this.applicantId = applicantId;
  }


  public CheckBuilder applicantProvidesData(Boolean applicantProvidesData) {
    this.applicantProvidesData = applicantProvidesData;
    return this;
  }

   /**
   * Send an applicant form to applicant to complete to proceed with check. Defaults to false.
   * @return applicantProvidesData
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICANT_PROVIDES_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getApplicantProvidesData() {
    return applicantProvidesData;
  }


  @JsonProperty(JSON_PROPERTY_APPLICANT_PROVIDES_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicantProvidesData(Boolean applicantProvidesData) {
    this.applicantProvidesData = applicantProvidesData;
  }


  public CheckBuilder tags(List<String> tags) {
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
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CheckBuilder redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * For checks where &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;, redirect to this URI when the applicant has submitted their data.
   * @return redirectUri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRedirectUri() {
    return redirectUri;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  public CheckBuilder reportNames(List<ReportName> reportNames) {
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
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPORT_NAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ReportName> getReportNames() {
    return reportNames;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_NAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReportNames(List<ReportName> reportNames) {
    this.reportNames = reportNames;
  }


  public CheckBuilder documentIds(List<UUID> documentIds) {
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
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getDocumentIds() {
    return documentIds;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentIds(List<UUID> documentIds) {
    this.documentIds = documentIds;
  }


  public CheckBuilder asynchronous(Boolean asynchronous) {
    this.asynchronous = asynchronous;
    return this;
  }

   /**
   * Defaults to &#x60;true&#x60;. If set to &#x60;false&#x60;, you will only receive a response when all reports in your check have completed. 
   * @return asynchronous
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASYNCHRONOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAsynchronous() {
    return asynchronous;
  }


  @JsonProperty(JSON_PROPERTY_ASYNCHRONOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsynchronous(Boolean asynchronous) {
    this.asynchronous = asynchronous;
  }


  public CheckBuilder suppressFormEmails(Boolean suppressFormEmails) {
    this.suppressFormEmails = suppressFormEmails;
    return this;
  }

   /**
   * For checks where &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;, applicant form will not be automatically sent if &#x60;suppress_form_emails&#x60; is set to &#x60;true&#x60;. You can manually send the form at any time after the check has been created, using the link found in the form_uri attribute of the check object. Write-only. Defaults to false. 
   * @return suppressFormEmails
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPRESS_FORM_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuppressFormEmails() {
    return suppressFormEmails;
  }


  @JsonProperty(JSON_PROPERTY_SUPPRESS_FORM_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuppressFormEmails(Boolean suppressFormEmails) {
    this.suppressFormEmails = suppressFormEmails;
  }


  public CheckBuilder subResult(String subResult) {
    this.subResult = subResult;
    return this;
  }

   /**
   * Triggers responses for particular sub-results for sandbox Document reports.
   * @return subResult
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubResult() {
    return subResult;
  }


  @JsonProperty(JSON_PROPERTY_SUB_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubResult(String subResult) {
    this.subResult = subResult;
  }


  public CheckBuilder consider(List<ReportName> consider) {
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
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportName> getConsider() {
    return consider;
  }


  @JsonProperty(JSON_PROPERTY_CONSIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsider(List<ReportName> consider) {
    this.consider = consider;
  }


  public CheckBuilder usDrivingLicence(UsDrivingLicenceBuilder usDrivingLicence) {
    this.usDrivingLicence = usDrivingLicence;
    return this;
  }

   /**
   * Get usDrivingLicence
   * @return usDrivingLicence
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_US_DRIVING_LICENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsDrivingLicenceBuilder getUsDrivingLicence() {
    return usDrivingLicence;
  }


  @JsonProperty(JSON_PROPERTY_US_DRIVING_LICENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @JsonAnySetter
  public CheckBuilder putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this check_builder object is equal to o.
   */
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
        Objects.equals(this.reportNames, checkBuilder.reportNames) &&
        Objects.equals(this.documentIds, checkBuilder.documentIds) &&
        Objects.equals(this.asynchronous, checkBuilder.asynchronous) &&
        Objects.equals(this.suppressFormEmails, checkBuilder.suppressFormEmails) &&
        Objects.equals(this.subResult, checkBuilder.subResult) &&
        Objects.equals(this.consider, checkBuilder.consider) &&
        Objects.equals(this.usDrivingLicence, checkBuilder.usDrivingLicence)&&
        Objects.equals(this.additionalProperties, checkBuilder.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookIds, applicantId, applicantProvidesData, tags, redirectUri, reportNames, documentIds, asynchronous, suppressFormEmails, subResult, consider, usDrivingLicence, additionalProperties);
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
    sb.append("    reportNames: ").append(toIndentedString(reportNames)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
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

}
