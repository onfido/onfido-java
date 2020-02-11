package com.onfido.models;

import com.squareup.moshi.Json;

public class PropertyJson {
  protected final String type;
  protected final String format;
  protected final PropertyJson items;
  protected final String description;
  protected final boolean readOnly;
  protected final boolean writeOnly;

  @Json(name = "$ref")
  protected final String ref;

  private PropertyJson() {
    type = "";
    format = "";
    items = null;
    description = "";
    readOnly = false;
    writeOnly = false;
    ref = null;
  }
}
