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
import java.time.LocalDate;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.onfido.JSON;

/**
 * ProofOfAddressProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ProofOfAddressProperties {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nullable
  private String address;

  /**
   * This property provides the document type according to the set of supported documents.
   */
  @JsonAdapter(DocumentTypeEnum.Adapter.class)
  public enum DocumentTypeEnum {
    BANK_BUILDING_SOCIETY_STATEMENT("bank_building_society_statement"),
    
    UTILITY_BILL("utility_bill"),
    
    COUNCIL_TAX("council_tax"),
    
    BENEFIT_LETTERS("benefit_letters"),
    
    MORTGAGE_STATEMENT("mortgage_statement"),
    
    MOBILE_PHONE_BILL("mobile_phone_bill"),
    
    GENERAL_LETTER("general_letter"),
    
    INSURANCE_STATEMENT("insurance_statement"),
    
    PENSION_PROPERTY_STATEMENT_LETTER("pension_property_statement_letter"),
    
    IDENTITY_DOCUMENT_WITH_ADDRESS("identity_document_with_address"),
    
    EXCHANGE_HOUSE_STATEMENT("exchange_house_statement"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentTypeEnum fromValue(String value) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<DocumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocumentTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DocumentTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  @javax.annotation.Nullable
  private DocumentTypeEnum documentType;

  public static final String SERIALIZED_NAME_FIRST_NAMES = "first_names";
  @SerializedName(SERIALIZED_NAME_FIRST_NAMES)
  @javax.annotation.Nullable
  private String firstNames;

  public static final String SERIALIZED_NAME_LAST_NAMES = "last_names";
  @SerializedName(SERIALIZED_NAME_LAST_NAMES)
  @javax.annotation.Nullable
  private String lastNames;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  @javax.annotation.Nullable
  private LocalDate issueDate;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  @javax.annotation.Nullable
  private String issuer;

  public static final String SERIALIZED_NAME_SUMMARY_PERIOD_START = "summary_period_start";
  @SerializedName(SERIALIZED_NAME_SUMMARY_PERIOD_START)
  @javax.annotation.Nullable
  private LocalDate summaryPeriodStart;

  public static final String SERIALIZED_NAME_SUMMARY_PERIOD_END = "summary_period_end";
  @SerializedName(SERIALIZED_NAME_SUMMARY_PERIOD_END)
  @javax.annotation.Nullable
  private LocalDate summaryPeriodEnd;

  public ProofOfAddressProperties() {
  }

  public ProofOfAddressProperties address(@javax.annotation.Nullable String address) {
    this.address = address;
    return this;
  }

  /**
   * This property provides the address on the document.
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nullable String address) {
    this.address = address;
  }


  public ProofOfAddressProperties documentType(@javax.annotation.Nullable DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * This property provides the document type according to the set of supported documents.
   * @return documentType
   */
  @javax.annotation.Nullable
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }

  public void setDocumentType(@javax.annotation.Nullable DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }


  public ProofOfAddressProperties firstNames(@javax.annotation.Nullable String firstNames) {
    this.firstNames = firstNames;
    return this;
  }

  /**
   * This property provides the first names on the document, including any initials and middle names.
   * @return firstNames
   */
  @javax.annotation.Nullable
  public String getFirstNames() {
    return firstNames;
  }

  public void setFirstNames(@javax.annotation.Nullable String firstNames) {
    this.firstNames = firstNames;
  }


  public ProofOfAddressProperties lastNames(@javax.annotation.Nullable String lastNames) {
    this.lastNames = lastNames;
    return this;
  }

  /**
   * This property provided the last names on the document.
   * @return lastNames
   */
  @javax.annotation.Nullable
  public String getLastNames() {
    return lastNames;
  }

  public void setLastNames(@javax.annotation.Nullable String lastNames) {
    this.lastNames = lastNames;
  }


  public ProofOfAddressProperties issueDate(@javax.annotation.Nullable LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * This property provides the issue date of the document.
   * @return issueDate
   */
  @javax.annotation.Nullable
  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(@javax.annotation.Nullable LocalDate issueDate) {
    this.issueDate = issueDate;
  }


  public ProofOfAddressProperties issuer(@javax.annotation.Nullable String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * This property provides the document issuer (e.g. HSBC, British Gas).
   * @return issuer
   */
  @javax.annotation.Nullable
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(@javax.annotation.Nullable String issuer) {
    this.issuer = issuer;
  }


  public ProofOfAddressProperties summaryPeriodStart(@javax.annotation.Nullable LocalDate summaryPeriodStart) {
    this.summaryPeriodStart = summaryPeriodStart;
    return this;
  }

  /**
   * This property provides the summary period start date.
   * @return summaryPeriodStart
   */
  @javax.annotation.Nullable
  public LocalDate getSummaryPeriodStart() {
    return summaryPeriodStart;
  }

  public void setSummaryPeriodStart(@javax.annotation.Nullable LocalDate summaryPeriodStart) {
    this.summaryPeriodStart = summaryPeriodStart;
  }


  public ProofOfAddressProperties summaryPeriodEnd(@javax.annotation.Nullable LocalDate summaryPeriodEnd) {
    this.summaryPeriodEnd = summaryPeriodEnd;
    return this;
  }

  /**
   * This property provides the summary period end date.
   * @return summaryPeriodEnd
   */
  @javax.annotation.Nullable
  public LocalDate getSummaryPeriodEnd() {
    return summaryPeriodEnd;
  }

  public void setSummaryPeriodEnd(@javax.annotation.Nullable LocalDate summaryPeriodEnd) {
    this.summaryPeriodEnd = summaryPeriodEnd;
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
   * @return the ProofOfAddressProperties instance itself
   */
  public ProofOfAddressProperties putAdditionalProperty(String key, Object value) {
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
    ProofOfAddressProperties proofOfAddressProperties = (ProofOfAddressProperties) o;
    return Objects.equals(this.address, proofOfAddressProperties.address) &&
        Objects.equals(this.documentType, proofOfAddressProperties.documentType) &&
        Objects.equals(this.firstNames, proofOfAddressProperties.firstNames) &&
        Objects.equals(this.lastNames, proofOfAddressProperties.lastNames) &&
        Objects.equals(this.issueDate, proofOfAddressProperties.issueDate) &&
        Objects.equals(this.issuer, proofOfAddressProperties.issuer) &&
        Objects.equals(this.summaryPeriodStart, proofOfAddressProperties.summaryPeriodStart) &&
        Objects.equals(this.summaryPeriodEnd, proofOfAddressProperties.summaryPeriodEnd)&&
        Objects.equals(this.additionalProperties, proofOfAddressProperties.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, documentType, firstNames, lastNames, issueDate, issuer, summaryPeriodStart, summaryPeriodEnd, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProofOfAddressProperties {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    firstNames: ").append(toIndentedString(firstNames)).append("\n");
    sb.append("    lastNames: ").append(toIndentedString(lastNames)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    summaryPeriodStart: ").append(toIndentedString(summaryPeriodStart)).append("\n");
    sb.append("    summaryPeriodEnd: ").append(toIndentedString(summaryPeriodEnd)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("document_type");
    openapiFields.add("first_names");
    openapiFields.add("last_names");
    openapiFields.add("issue_date");
    openapiFields.add("issuer");
    openapiFields.add("summary_period_start");
    openapiFields.add("summary_period_end");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProofOfAddressProperties
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProofOfAddressProperties.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProofOfAddressProperties is not found in the empty JSON string", ProofOfAddressProperties.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("document_type") != null && !jsonObj.get("document_type").isJsonNull()) && !jsonObj.get("document_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_type").toString()));
      }
      // validate the optional field `document_type`
      if (jsonObj.get("document_type") != null && !jsonObj.get("document_type").isJsonNull()) {
        DocumentTypeEnum.validateJsonElement(jsonObj.get("document_type"));
      }
      if ((jsonObj.get("first_names") != null && !jsonObj.get("first_names").isJsonNull()) && !jsonObj.get("first_names").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_names` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_names").toString()));
      }
      if ((jsonObj.get("last_names") != null && !jsonObj.get("last_names").isJsonNull()) && !jsonObj.get("last_names").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_names` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_names").toString()));
      }
      if ((jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonNull()) && !jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProofOfAddressProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProofOfAddressProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProofOfAddressProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProofOfAddressProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<ProofOfAddressProperties>() {
           @Override
           public void write(JsonWriter out, ProofOfAddressProperties value) throws IOException {
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
           public ProofOfAddressProperties read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ProofOfAddressProperties instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ProofOfAddressProperties given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProofOfAddressProperties
   * @throws IOException if the JSON string is invalid with respect to ProofOfAddressProperties
   */
  public static ProofOfAddressProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProofOfAddressProperties.class);
  }

  /**
   * Convert an instance of ProofOfAddressProperties to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

