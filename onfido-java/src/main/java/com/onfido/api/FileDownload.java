package com.onfido.api;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class FileDownload extends FileParam {
  private final byte[] bytes;

  public FileDownload(String fileName, byte[] bytes) {
    super(fileName);
    this.bytes = bytes;
  }

  public InputStream getInputStream() {
    return new ByteArrayInputStream(bytes);
  }
}
