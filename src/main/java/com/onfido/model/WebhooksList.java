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

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.onfido.model.Webhook;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * WebhooksList
 */
@JsonPropertyOrder({
  WebhooksList.JSON_PROPERTY_WEBHOOKS
})
@JsonTypeName("Webhooks_list")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhooksList {
  public static final String JSON_PROPERTY_WEBHOOKS = "webhooks";
  private List<Webhook> webhooks = new ArrayList<>();

  public WebhooksList() { 
  }

  public WebhooksList webhooks(List<Webhook> webhooks) {
    this.webhooks = webhooks;
    return this;
  }

  public WebhooksList addWebhooksItem(Webhook webhooksItem) {
    if (this.webhooks == null) {
      this.webhooks = new ArrayList<>();
    }
    this.webhooks.add(webhooksItem);
    return this;
  }

   /**
   * Get webhooks
   * @return webhooks
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Webhook> getWebhooks() {
    return webhooks;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebhooks(List<Webhook> webhooks) {
    this.webhooks = webhooks;
  }


  /**
   * Return true if this Webhooks_list object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksList webhooksList = (WebhooksList) o;
    return Objects.equals(this.webhooks, webhooksList.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksList {\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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
