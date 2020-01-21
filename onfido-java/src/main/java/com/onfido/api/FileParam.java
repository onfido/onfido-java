package com.onfido.api;

import java.io.InputStream;
import java.net.URLConnection;

public abstract class FileParam {
  private final String fileName;

  public FileParam(String fileName) {
    this.fileName = fileName;
  }

  public String getFileName() {
    return fileName;
  }

  public String getContentType() {
    return URLConnection.guessContentTypeFromName(fileName);
  }

  public abstract InputStream getInputStream();

  @Override
  public String toString() {
    return getClass().getSimpleName() + " <" + fileName + ">";
  }
}
