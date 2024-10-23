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
import com.onfido.model.WorkflowRunLink;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * WorkflowRunBuilder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WorkflowRunBuilder {
  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicant_id";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  private UUID applicantId;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflow_id";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private UUID workflowId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_CUSTOMER_USER_ID = "customer_user_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_USER_ID)
  private String customerUserId;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private WorkflowRunLink link;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CUSTOM_DATA = "custom_data";
  @SerializedName(SERIALIZED_NAME_CUSTOM_DATA)
  private Map<String, Object> customData = new HashMap<>();

  public WorkflowRunBuilder() {
  }

  public WorkflowRunBuilder applicantId(UUID applicantId) {
    this.applicantId = applicantId;
    return this;
  }

  /**
   * The unique identifier for the Applicant.
   * @return applicantId
   */
  @javax.annotation.Nonnull
  public UUID getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(UUID applicantId) {
    this.applicantId = applicantId;
  }


  public WorkflowRunBuilder workflowId(UUID workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * The unique identifier for the Workflow.
   * @return workflowId
   */
  @javax.annotation.Nonnull
  public UUID getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(UUID workflowId) {
    this.workflowId = workflowId;
  }


  public WorkflowRunBuilder tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WorkflowRunBuilder addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags or labels assigned to the workflow run.
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public WorkflowRunBuilder customerUserId(String customerUserId) {
    this.customerUserId = customerUserId;
    return this;
  }

  /**
   * Customer-provided user identifier.
   * @return customerUserId
   */
  @javax.annotation.Nullable
  public String getCustomerUserId() {
    return customerUserId;
  }

  public void setCustomerUserId(String customerUserId) {
    this.customerUserId = customerUserId;
  }


  public WorkflowRunBuilder link(WorkflowRunLink link) {
    this.link = link;
    return this;
  }

  /**
   * Object for the configuration of the Workflow Run link.
   * @return link
   */
  @javax.annotation.Nullable
  public WorkflowRunLink getLink() {
    return link;
  }

  public void setLink(WorkflowRunLink link) {
    this.link = link;
  }


  public WorkflowRunBuilder createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time when the Workflow Run was created.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WorkflowRunBuilder updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date and time when the Workflow Run was last updated.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public WorkflowRunBuilder customData(Map<String, Object> customData) {
    this.customData = customData;
    return this;
  }

  public WorkflowRunBuilder putCustomDataItem(String key, Object customDataItem) {
    if (this.customData == null) {
      this.customData = new HashMap<>();
    }
    this.customData.put(key, customDataItem);
    return this;
  }

  /**
   * Object with Custom Input Data to be used in the Workflow Run.
   * @return customData
   */
  @javax.annotation.Nullable
  public Map<String, Object> getCustomData() {
    return customData;
  }

  public void setCustomData(Map<String, Object> customData) {
    this.customData = customData;
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
   * @return the WorkflowRunBuilder instance itself
   */
  public WorkflowRunBuilder putAdditionalProperty(String key, Object value) {
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
    WorkflowRunBuilder workflowRunBuilder = (WorkflowRunBuilder) o;
    return Objects.equals(this.applicantId, workflowRunBuilder.applicantId) &&
        Objects.equals(this.workflowId, workflowRunBuilder.workflowId) &&
        Objects.equals(this.tags, workflowRunBuilder.tags) &&
        Objects.equals(this.customerUserId, workflowRunBuilder.customerUserId) &&
        Objects.equals(this.link, workflowRunBuilder.link) &&
        Objects.equals(this.createdAt, workflowRunBuilder.createdAt) &&
        Objects.equals(this.updatedAt, workflowRunBuilder.updatedAt) &&
        Objects.equals(this.customData, workflowRunBuilder.customData)&&
        Objects.equals(this.additionalProperties, workflowRunBuilder.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, workflowId, tags, customerUserId, link, createdAt, updatedAt, customData, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRunBuilder {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customerUserId: ").append(toIndentedString(customerUserId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
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
    openapiFields.add("applicant_id");
    openapiFields.add("workflow_id");
    openapiFields.add("tags");
    openapiFields.add("customer_user_id");
    openapiFields.add("link");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("custom_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("applicant_id");
    openapiRequiredFields.add("workflow_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkflowRunBuilder
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkflowRunBuilder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowRunBuilder is not found in the empty JSON string", WorkflowRunBuilder.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowRunBuilder.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("applicant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicant_id").toString()));
      }
      if (!jsonObj.get("workflow_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflow_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflow_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("customer_user_id") != null && !jsonObj.get("customer_user_id").isJsonNull()) && !jsonObj.get("customer_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_user_id").toString()));
      }
      // validate the optional field `link`
      if (jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) {
        WorkflowRunLink.validateJsonElement(jsonObj.get("link"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowRunBuilder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowRunBuilder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowRunBuilder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowRunBuilder.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowRunBuilder>() {
           @Override
           public void write(JsonWriter out, WorkflowRunBuilder value) throws IOException {
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
           public WorkflowRunBuilder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WorkflowRunBuilder instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of WorkflowRunBuilder given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkflowRunBuilder
   * @throws IOException if the JSON string is invalid with respect to WorkflowRunBuilder
   */
  public static WorkflowRunBuilder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowRunBuilder.class);
  }

  /**
   * Convert an instance of WorkflowRunBuilder to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

