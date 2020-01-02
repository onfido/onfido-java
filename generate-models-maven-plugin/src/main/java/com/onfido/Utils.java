package com.onfido;

public final class Utils {
  public static String toTitleCase(String snakeCase) {
    String[] words = snakeCase.split("_");
    String result = "";
    for (String word : words) {
      if (word.length() > 0) {
        result += word.substring(0, 1).toUpperCase() + word.substring(1);
      }
    }
    return result;
  }

  public static String toCamelCase(String snakeCase) {
    String titleCase = toTitleCase(snakeCase);
    if (titleCase.length() == 0) {
      return titleCase;
    }
    return titleCase.substring(0, 1).toLowerCase() + titleCase.substring(1);
  }

  public static String fileName(String path) {
    // If there's no /, this will be 0 i.e. the start of the path.
    int lastSlashIndex = path.lastIndexOf("/") + 1;
    return path.substring(lastSlashIndex, path.lastIndexOf("."));
  }
}
