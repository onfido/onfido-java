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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.onfido.JSON;

/**
 * An object that contains all accepted fields for the Driver&#39;s License Data Verification report.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class UsDrivingLicenceShared {
  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private String idNumber;

  public static final String SERIALIZED_NAME_ISSUE_STATE = "issue_state";
  @SerializedName(SERIALIZED_NAME_ISSUE_STATE)
  private String issueState;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line_1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line_2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  /**
   * Document category.
   */
  @JsonAdapter(DocumentCategoryEnum.Adapter.class)
  public enum DocumentCategoryEnum {
    DRIVER_LICENSE("driver license"),
    
    DRIVER_PERMIT("driver permit"),
    
    ID_CARD("id card"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    DocumentCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentCategoryEnum fromValue(String value) {
      for (DocumentCategoryEnum b : DocumentCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<DocumentCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocumentCategoryEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DocumentCategoryEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DOCUMENT_CATEGORY = "document_category";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_CATEGORY)
  private DocumentCategoryEnum documentCategory;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private LocalDate expirationDate;

  /**
   * Eye color code.
   */
  @JsonAdapter(EyeColorCodeEnum.Adapter.class)
  public enum EyeColorCodeEnum {
    BLK("BLK"),
    
    BLU("BLU"),
    
    BRO("BRO"),
    
    DIC("DIC"),
    
    GRY("GRY"),
    
    GRN("GRN"),
    
    HAZ("HAZ"),
    
    MAR("MAR"),
    
    PNK("PNK"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    EyeColorCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EyeColorCodeEnum fromValue(String value) {
      for (EyeColorCodeEnum b : EyeColorCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<EyeColorCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EyeColorCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EyeColorCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EyeColorCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EyeColorCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EYE_COLOR_CODE = "eye_color_code";
  @SerializedName(SERIALIZED_NAME_EYE_COLOR_CODE)
  private EyeColorCodeEnum eyeColorCode;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    MALE("Male"),
    
    FEMALE("Female"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GenderEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      GenderEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private LocalDate issueDate;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_NAME_SUFFIX = "name_suffix";
  @SerializedName(SERIALIZED_NAME_NAME_SUFFIX)
  private String nameSuffix;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_WEIGHT_MEASURE = "weight_measure";
  @SerializedName(SERIALIZED_NAME_WEIGHT_MEASURE)
  private Integer weightMeasure;

  public UsDrivingLicenceShared() {
  }

  public UsDrivingLicenceShared(
     GenderEnum gender
  ) {
    this();
    this.gender = gender;
  }

  public UsDrivingLicenceShared idNumber(String idNumber) {
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Driving licence ID number
   * @return idNumber
  **/
  @javax.annotation.Nonnull
  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }


  public UsDrivingLicenceShared issueState(String issueState) {
    this.issueState = issueState;
    return this;
  }

   /**
   * Two letter code of issuing state (state-issued driving licenses only)
   * @return issueState
  **/
  @javax.annotation.Nonnull
  public String getIssueState() {
    return issueState;
  }

  public void setIssueState(String issueState) {
    this.issueState = issueState;
  }


  public UsDrivingLicenceShared addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Line 1 of the address
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public UsDrivingLicenceShared addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Line 2 of the address
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public UsDrivingLicenceShared city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city of the owner&#39;s address
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public UsDrivingLicenceShared dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Date of birth in yyyy-mm-dd format
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public UsDrivingLicenceShared documentCategory(DocumentCategoryEnum documentCategory) {
    this.documentCategory = documentCategory;
    return this;
  }

   /**
   * Document category.
   * @return documentCategory
  **/
  @javax.annotation.Nullable
  public DocumentCategoryEnum getDocumentCategory() {
    return documentCategory;
  }

  public void setDocumentCategory(DocumentCategoryEnum documentCategory) {
    this.documentCategory = documentCategory;
  }


  public UsDrivingLicenceShared expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration date of the driving licence in yyyy-mm-dd format
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }


  public UsDrivingLicenceShared eyeColorCode(EyeColorCodeEnum eyeColorCode) {
    this.eyeColorCode = eyeColorCode;
    return this;
  }

   /**
   * Eye color code.
   * @return eyeColorCode
  **/
  @javax.annotation.Nullable
  public EyeColorCodeEnum getEyeColorCode() {
    return eyeColorCode;
  }

  public void setEyeColorCode(EyeColorCodeEnum eyeColorCode) {
    this.eyeColorCode = eyeColorCode;
  }


  public UsDrivingLicenceShared firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The owner&#39;s first name
   * @return firstName
  **/
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public GenderEnum getGender() {
    return gender;
  }



  public UsDrivingLicenceShared issueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Issue date in yyyy-mm-dd format
   * @return issueDate
  **/
  @javax.annotation.Nullable
  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }


  public UsDrivingLicenceShared lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The owner&#39;s surname
   * @return lastName
  **/
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UsDrivingLicenceShared middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * The owner&#39;s middle name
   * @return middleName
  **/
  @javax.annotation.Nullable
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public UsDrivingLicenceShared nameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
    return this;
  }

   /**
   * The owner&#39;s name suffix
   * @return nameSuffix
  **/
  @javax.annotation.Nullable
  public String getNameSuffix() {
    return nameSuffix;
  }

  public void setNameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
  }


  public UsDrivingLicenceShared postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postcode or ZIP of the owner&#39;s address
   * @return postalCode
  **/
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public UsDrivingLicenceShared state(String state) {
    this.state = state;
    return this;
  }

   /**
   * 2-characters state code
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public UsDrivingLicenceShared weightMeasure(Integer weightMeasure) {
    this.weightMeasure = weightMeasure;
    return this;
  }

   /**
   * Weight in pounds
   * @return weightMeasure
  **/
  @javax.annotation.Nullable
  public Integer getWeightMeasure() {
    return weightMeasure;
  }

  public void setWeightMeasure(Integer weightMeasure) {
    this.weightMeasure = weightMeasure;
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
   * @return the UsDrivingLicenceShared instance itself
   */
  public UsDrivingLicenceShared putAdditionalProperty(String key, Object value) {
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
    UsDrivingLicenceShared usDrivingLicenceShared = (UsDrivingLicenceShared) o;
    return Objects.equals(this.idNumber, usDrivingLicenceShared.idNumber) &&
        Objects.equals(this.issueState, usDrivingLicenceShared.issueState) &&
        Objects.equals(this.addressLine1, usDrivingLicenceShared.addressLine1) &&
        Objects.equals(this.addressLine2, usDrivingLicenceShared.addressLine2) &&
        Objects.equals(this.city, usDrivingLicenceShared.city) &&
        Objects.equals(this.dateOfBirth, usDrivingLicenceShared.dateOfBirth) &&
        Objects.equals(this.documentCategory, usDrivingLicenceShared.documentCategory) &&
        Objects.equals(this.expirationDate, usDrivingLicenceShared.expirationDate) &&
        Objects.equals(this.eyeColorCode, usDrivingLicenceShared.eyeColorCode) &&
        Objects.equals(this.firstName, usDrivingLicenceShared.firstName) &&
        Objects.equals(this.gender, usDrivingLicenceShared.gender) &&
        Objects.equals(this.issueDate, usDrivingLicenceShared.issueDate) &&
        Objects.equals(this.lastName, usDrivingLicenceShared.lastName) &&
        Objects.equals(this.middleName, usDrivingLicenceShared.middleName) &&
        Objects.equals(this.nameSuffix, usDrivingLicenceShared.nameSuffix) &&
        Objects.equals(this.postalCode, usDrivingLicenceShared.postalCode) &&
        Objects.equals(this.state, usDrivingLicenceShared.state) &&
        Objects.equals(this.weightMeasure, usDrivingLicenceShared.weightMeasure)&&
        Objects.equals(this.additionalProperties, usDrivingLicenceShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNumber, issueState, addressLine1, addressLine2, city, dateOfBirth, documentCategory, expirationDate, eyeColorCode, firstName, gender, issueDate, lastName, middleName, nameSuffix, postalCode, state, weightMeasure, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsDrivingLicenceShared {\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    issueState: ").append(toIndentedString(issueState)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    documentCategory: ").append(toIndentedString(documentCategory)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    eyeColorCode: ").append(toIndentedString(eyeColorCode)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    nameSuffix: ").append(toIndentedString(nameSuffix)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    weightMeasure: ").append(toIndentedString(weightMeasure)).append("\n");
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
    openapiFields.add("id_number");
    openapiFields.add("issue_state");
    openapiFields.add("address_line_1");
    openapiFields.add("address_line_2");
    openapiFields.add("city");
    openapiFields.add("date_of_birth");
    openapiFields.add("document_category");
    openapiFields.add("expiration_date");
    openapiFields.add("eye_color_code");
    openapiFields.add("first_name");
    openapiFields.add("gender");
    openapiFields.add("issue_date");
    openapiFields.add("last_name");
    openapiFields.add("middle_name");
    openapiFields.add("name_suffix");
    openapiFields.add("postal_code");
    openapiFields.add("state");
    openapiFields.add("weight_measure");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id_number");
    openapiRequiredFields.add("issue_state");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UsDrivingLicenceShared
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UsDrivingLicenceShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsDrivingLicenceShared is not found in the empty JSON string", UsDrivingLicenceShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsDrivingLicenceShared.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_number").toString()));
      }
      if (!jsonObj.get("issue_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_state").toString()));
      }
      if ((jsonObj.get("address_line_1") != null && !jsonObj.get("address_line_1").isJsonNull()) && !jsonObj.get("address_line_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_1").toString()));
      }
      if ((jsonObj.get("address_line_2") != null && !jsonObj.get("address_line_2").isJsonNull()) && !jsonObj.get("address_line_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_2").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("document_category") != null && !jsonObj.get("document_category").isJsonNull()) && !jsonObj.get("document_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_category").toString()));
      }
      // validate the optional field `document_category`
      if (jsonObj.get("document_category") != null && !jsonObj.get("document_category").isJsonNull()) {
        DocumentCategoryEnum.validateJsonElement(jsonObj.get("document_category"));
      }
      if ((jsonObj.get("eye_color_code") != null && !jsonObj.get("eye_color_code").isJsonNull()) && !jsonObj.get("eye_color_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eye_color_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eye_color_code").toString()));
      }
      // validate the optional field `eye_color_code`
      if (jsonObj.get("eye_color_code") != null && !jsonObj.get("eye_color_code").isJsonNull()) {
        EyeColorCodeEnum.validateJsonElement(jsonObj.get("eye_color_code"));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      // validate the optional field `gender`
      if (jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) {
        GenderEnum.validateJsonElement(jsonObj.get("gender"));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("middle_name") != null && !jsonObj.get("middle_name").isJsonNull()) && !jsonObj.get("middle_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle_name").toString()));
      }
      if ((jsonObj.get("name_suffix") != null && !jsonObj.get("name_suffix").isJsonNull()) && !jsonObj.get("name_suffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_suffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_suffix").toString()));
      }
      if ((jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonNull()) && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsDrivingLicenceShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsDrivingLicenceShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsDrivingLicenceShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsDrivingLicenceShared.class));

       return (TypeAdapter<T>) new TypeAdapter<UsDrivingLicenceShared>() {
           @Override
           public void write(JsonWriter out, UsDrivingLicenceShared value) throws IOException {
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
           public UsDrivingLicenceShared read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UsDrivingLicenceShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UsDrivingLicenceShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsDrivingLicenceShared
  * @throws IOException if the JSON string is invalid with respect to UsDrivingLicenceShared
  */
  public static UsDrivingLicenceShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsDrivingLicenceShared.class);
  }

 /**
  * Convert an instance of UsDrivingLicenceShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

