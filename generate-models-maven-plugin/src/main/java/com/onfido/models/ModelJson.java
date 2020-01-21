package com.onfido.models;

import java.util.Collections;
import java.util.Map;

class ModelJson {
  protected final String title;
  protected final String path;
  protected final Map<String, PropertyJson> properties;

  private ModelJson() {
    title = null;
    path = null;
    properties = Collections.emptyMap();
  }
}
