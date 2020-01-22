package com.onfido.api;

import java.io.InputStream;

public class FileDownload {
    public final InputStream content;
    public final String contentType;

    public FileDownload(InputStream content, String contentType) {
        this.content = content;
        this.contentType = contentType;
    }
}
