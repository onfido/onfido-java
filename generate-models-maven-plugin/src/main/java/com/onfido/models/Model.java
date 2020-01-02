package com.onfido.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Model {
  public final String className;
  public final String path;

  public final List<Property> requestProperties;
  public final List<Property> responseProperties;

  public final Map<String, Boolean> actions = new HashMap<String, Boolean>();

  protected Model(ModelJson json, List<Property> properties) {
    className = json.title;
    path = json.path;

    requestProperties = properties.stream()
      .filter(property -> property.isSentInRequests)
      .collect(Collectors.toList());

    responseProperties = properties.stream()
      .filter(property -> property.isSentInResponses)
      .collect(Collectors.toList());

    for (String action : json.actions) {
      actions.put(action, true);
    }
  }
}
