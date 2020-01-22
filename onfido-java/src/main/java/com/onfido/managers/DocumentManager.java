package com.onfido.managers;

import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Document;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

public class DocumentManager extends ResourceManager {

    public DocumentManager(Config config) {
        super("documents/", config);
    }

    public void uploadDocument(InputStream inputStream, String fileName, Document.Request request) throws IOException, OnfidoException {
        RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("applicant_id", request.getApplicantId())
                .addFormDataPart("type", request.getType())
                .addFormDataPart("side", request.getSide())
                .addFormDataPart("issuing_country", request.getIssuingCountry())
                .addFormDataPart("file", "document", RequestBody.create(readInputStream(inputStream), MediaType.get(URLConnection.guessContentTypeFromName(fileName))))
        .build();

        upload("", requestBody);
    }

    public InputStream downloadDocument(String documentId) throws IOException {
        return download(documentId + "/download");
    }
}
