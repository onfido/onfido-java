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
import com.onfido.model.ReportDocument;
import com.onfido.model.ReportName;
import com.onfido.model.ReportResult;
import com.onfido.model.ReportStatus;
import com.onfido.model.ReportSubResult;
import com.onfido.model.WatchlistStandardBreakdown;
import com.onfido.model.WatchlistStandardProperties;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * WatchlistSanctionsOnlyReport
 */
@JsonPropertyOrder({
  WatchlistSanctionsOnlyReport.JSON_PROPERTY_ID,
  WatchlistSanctionsOnlyReport.JSON_PROPERTY_CREATED_AT,
  WatchlistSanctionsOnlyReport.JSON_PROPERTY_HREF,
  WatchlistSanctionsOnlyReport.JSON_PROPERTY_STATUS,
  WatchlistSanctionsOnlyReport.JSON_PROPERTY_RESULT,
  WatchlistSanctionsOnlyReport.JSON_PROPERTY_SUB_RESULT,
  WatchlistSanctionsOnlyReport.JSON_PROPERTY_CHECK_ID,
  WatchlistSanctionsOnlyReport.JSON_PROPERTY_DOCUMENTS,
  WatchlistSanctionsOnlyReport.JSON_PROPERTY_NAME,
  WatchlistSanctionsOnlyReport.JSON_PROPERTY_BREAKDOWN,
  WatchlistSanctionsOnlyReport.JSON_PROPERTY_PROPERTIES
})
@JsonTypeName("watchlist_sanctions_only_report")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WatchlistSanctionsOnlyReport {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ReportStatus status;

  public static final String JSON_PROPERTY_RESULT = "result";
  private ReportResult result;

  public static final String JSON_PROPERTY_SUB_RESULT = "sub_result";
  private ReportSubResult subResult;

  public static final String JSON_PROPERTY_CHECK_ID = "check_id";
  private UUID checkId;

  public static final String JSON_PROPERTY_DOCUMENTS = "documents";
  private List<ReportDocument> documents;

  public static final String JSON_PROPERTY_NAME = "name";
  private ReportName name;

  public static final String JSON_PROPERTY_BREAKDOWN = "breakdown";
  private WatchlistStandardBreakdown breakdown;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private WatchlistStandardProperties properties;

  public WatchlistSanctionsOnlyReport() { 
  }

  public WatchlistSanctionsOnlyReport id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the report. Read-only.
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  public WatchlistSanctionsOnlyReport createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time at which the report was first initiated. Read-only.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WatchlistSanctionsOnlyReport href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The API endpoint to retrieve the report. Read-only.
   * @return href
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  public WatchlistSanctionsOnlyReport status(ReportStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ReportStatus status) {
    this.status = status;
  }


  public WatchlistSanctionsOnlyReport result(ReportResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportResult getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(ReportResult result) {
    this.result = result;
  }


  public WatchlistSanctionsOnlyReport subResult(ReportSubResult subResult) {
    this.subResult = subResult;
    return this;
  }

   /**
   * Get subResult
   * @return subResult
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportSubResult getSubResult() {
    return subResult;
  }


  @JsonProperty(JSON_PROPERTY_SUB_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubResult(ReportSubResult subResult) {
    this.subResult = subResult;
  }


  public WatchlistSanctionsOnlyReport checkId(UUID checkId) {
    this.checkId = checkId;
    return this;
  }

   /**
   * The ID of the check to which the report belongs. Read-only.
   * @return checkId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCheckId() {
    return checkId;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckId(UUID checkId) {
    this.checkId = checkId;
  }


  public WatchlistSanctionsOnlyReport documents(List<ReportDocument> documents) {
    this.documents = documents;
    return this;
  }

  public WatchlistSanctionsOnlyReport addDocumentsItem(ReportDocument documentsItem) {
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
  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportDocument> getDocuments() {
    return documents;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocuments(List<ReportDocument> documents) {
    this.documents = documents;
  }


  public WatchlistSanctionsOnlyReport name(ReportName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReportName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(ReportName name) {
    this.name = name;
  }


  public WatchlistSanctionsOnlyReport breakdown(WatchlistStandardBreakdown breakdown) {
    this.breakdown = breakdown;
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WatchlistStandardBreakdown getBreakdown() {
    return breakdown;
  }


  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakdown(WatchlistStandardBreakdown breakdown) {
    this.breakdown = breakdown;
  }


  public WatchlistSanctionsOnlyReport properties(WatchlistStandardProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WatchlistStandardProperties getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(WatchlistStandardProperties properties) {
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
   */
  @JsonAnySetter
  public WatchlistSanctionsOnlyReport putAdditionalProperty(String key, Object value) {
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
   * Return true if this watchlist_sanctions_only_report object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistSanctionsOnlyReport watchlistSanctionsOnlyReport = (WatchlistSanctionsOnlyReport) o;
    return Objects.equals(this.id, watchlistSanctionsOnlyReport.id) &&
        Objects.equals(this.createdAt, watchlistSanctionsOnlyReport.createdAt) &&
        Objects.equals(this.href, watchlistSanctionsOnlyReport.href) &&
        Objects.equals(this.status, watchlistSanctionsOnlyReport.status) &&
        Objects.equals(this.result, watchlistSanctionsOnlyReport.result) &&
        Objects.equals(this.subResult, watchlistSanctionsOnlyReport.subResult) &&
        Objects.equals(this.checkId, watchlistSanctionsOnlyReport.checkId) &&
        Objects.equals(this.documents, watchlistSanctionsOnlyReport.documents) &&
        Objects.equals(this.name, watchlistSanctionsOnlyReport.name) &&
        Objects.equals(this.breakdown, watchlistSanctionsOnlyReport.breakdown) &&
        Objects.equals(this.properties, watchlistSanctionsOnlyReport.properties)&&
        Objects.equals(this.additionalProperties, watchlistSanctionsOnlyReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, href, status, result, subResult, checkId, documents, name, breakdown, properties, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistSanctionsOnlyReport {\n");
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

}
