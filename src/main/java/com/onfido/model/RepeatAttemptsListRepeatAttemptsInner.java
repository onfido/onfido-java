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
import java.time.OffsetDateTime;
import java.util.Arrays;
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
 * RepeatAttemptsListRepeatAttemptsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class RepeatAttemptsListRepeatAttemptsInner {
  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private UUID reportId;

  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicant_id";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  private UUID applicantId;

  /**
   * Whether the dates of birth are exactly the same or are different.
   */
  @JsonAdapter(DateOfBirthEnum.Adapter.class)
  public enum DateOfBirthEnum {
    MATCH("match"),
    
    MISMATCH("mismatch"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    DateOfBirthEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DateOfBirthEnum fromValue(String value) {
      for (DateOfBirthEnum b : DateOfBirthEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<DateOfBirthEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DateOfBirthEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DateOfBirthEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DateOfBirthEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DateOfBirthEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private DateOfBirthEnum dateOfBirth;

  /**
   * Whether the names are exactly the same or are different.
   */
  @JsonAdapter(NamesEnum.Adapter.class)
  public enum NamesEnum {
    MATCH("match"),
    
    MISMATCH("mismatch"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    NamesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NamesEnum fromValue(String value) {
      for (NamesEnum b : NamesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<NamesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NamesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NamesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NamesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NamesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private NamesEnum names;

  /**
   * The report result of this attempt.
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    CLEAR("clear"),
    
    CONSIDER("consider"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<ResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ResultEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ResultEnum result;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  public RepeatAttemptsListRepeatAttemptsInner() {
  }

  public RepeatAttemptsListRepeatAttemptsInner reportId(UUID reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The unique identifier of the matching Document report.
   * @return reportId
  **/
  @javax.annotation.Nullable
  public UUID getReportId() {
    return reportId;
  }

  public void setReportId(UUID reportId) {
    this.reportId = reportId;
  }


  public RepeatAttemptsListRepeatAttemptsInner applicantId(UUID applicantId) {
    this.applicantId = applicantId;
    return this;
  }

   /**
   * The unique identifier of the applicant for the matching Document report.
   * @return applicantId
  **/
  @javax.annotation.Nullable
  public UUID getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(UUID applicantId) {
    this.applicantId = applicantId;
  }


  public RepeatAttemptsListRepeatAttemptsInner dateOfBirth(DateOfBirthEnum dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Whether the dates of birth are exactly the same or are different.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  public DateOfBirthEnum getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(DateOfBirthEnum dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public RepeatAttemptsListRepeatAttemptsInner names(NamesEnum names) {
    this.names = names;
    return this;
  }

   /**
   * Whether the names are exactly the same or are different.
   * @return names
  **/
  @javax.annotation.Nullable
  public NamesEnum getNames() {
    return names;
  }

  public void setNames(NamesEnum names) {
    this.names = names;
  }


  public RepeatAttemptsListRepeatAttemptsInner result(ResultEnum result) {
    this.result = result;
    return this;
  }

   /**
   * The report result of this attempt.
   * @return result
  **/
  @javax.annotation.Nullable
  public ResultEnum getResult() {
    return result;
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public RepeatAttemptsListRepeatAttemptsInner createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the matching report was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public RepeatAttemptsListRepeatAttemptsInner completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * When the matching report was completed.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
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
   * @return the RepeatAttemptsListRepeatAttemptsInner instance itself
   */
  public RepeatAttemptsListRepeatAttemptsInner putAdditionalProperty(String key, Object value) {
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
    RepeatAttemptsListRepeatAttemptsInner repeatAttemptsListRepeatAttemptsInner = (RepeatAttemptsListRepeatAttemptsInner) o;
    return Objects.equals(this.reportId, repeatAttemptsListRepeatAttemptsInner.reportId) &&
        Objects.equals(this.applicantId, repeatAttemptsListRepeatAttemptsInner.applicantId) &&
        Objects.equals(this.dateOfBirth, repeatAttemptsListRepeatAttemptsInner.dateOfBirth) &&
        Objects.equals(this.names, repeatAttemptsListRepeatAttemptsInner.names) &&
        Objects.equals(this.result, repeatAttemptsListRepeatAttemptsInner.result) &&
        Objects.equals(this.createdAt, repeatAttemptsListRepeatAttemptsInner.createdAt) &&
        Objects.equals(this.completedAt, repeatAttemptsListRepeatAttemptsInner.completedAt)&&
        Objects.equals(this.additionalProperties, repeatAttemptsListRepeatAttemptsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, applicantId, dateOfBirth, names, result, createdAt, completedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatAttemptsListRepeatAttemptsInner {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
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
    openapiFields.add("report_id");
    openapiFields.add("applicant_id");
    openapiFields.add("date_of_birth");
    openapiFields.add("names");
    openapiFields.add("result");
    openapiFields.add("created_at");
    openapiFields.add("completed_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RepeatAttemptsListRepeatAttemptsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RepeatAttemptsListRepeatAttemptsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepeatAttemptsListRepeatAttemptsInner is not found in the empty JSON string", RepeatAttemptsListRepeatAttemptsInner.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("report_id") != null && !jsonObj.get("report_id").isJsonNull()) && !jsonObj.get("report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_id").toString()));
      }
      if ((jsonObj.get("applicant_id") != null && !jsonObj.get("applicant_id").isJsonNull()) && !jsonObj.get("applicant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicant_id").toString()));
      }
      if ((jsonObj.get("date_of_birth") != null && !jsonObj.get("date_of_birth").isJsonNull()) && !jsonObj.get("date_of_birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_birth").toString()));
      }
      // validate the optional field `date_of_birth`
      if (jsonObj.get("date_of_birth") != null && !jsonObj.get("date_of_birth").isJsonNull()) {
        DateOfBirthEnum.validateJsonElement(jsonObj.get("date_of_birth"));
      }
      if ((jsonObj.get("names") != null && !jsonObj.get("names").isJsonNull()) && !jsonObj.get("names").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `names` to be a primitive type in the JSON string but got `%s`", jsonObj.get("names").toString()));
      }
      // validate the optional field `names`
      if (jsonObj.get("names") != null && !jsonObj.get("names").isJsonNull()) {
        NamesEnum.validateJsonElement(jsonObj.get("names"));
      }
      if ((jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      // validate the optional field `result`
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        ResultEnum.validateJsonElement(jsonObj.get("result"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepeatAttemptsListRepeatAttemptsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepeatAttemptsListRepeatAttemptsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepeatAttemptsListRepeatAttemptsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepeatAttemptsListRepeatAttemptsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RepeatAttemptsListRepeatAttemptsInner>() {
           @Override
           public void write(JsonWriter out, RepeatAttemptsListRepeatAttemptsInner value) throws IOException {
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
           public RepeatAttemptsListRepeatAttemptsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RepeatAttemptsListRepeatAttemptsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RepeatAttemptsListRepeatAttemptsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepeatAttemptsListRepeatAttemptsInner
  * @throws IOException if the JSON string is invalid with respect to RepeatAttemptsListRepeatAttemptsInner
  */
  public static RepeatAttemptsListRepeatAttemptsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepeatAttemptsListRepeatAttemptsInner.class);
  }

 /**
  * Convert an instance of RepeatAttemptsListRepeatAttemptsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

