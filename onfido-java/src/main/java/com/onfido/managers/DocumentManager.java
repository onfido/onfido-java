package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.FileDownload;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Document;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.List;

public class DocumentManager extends ResourceManager {

    private ApiJson<Document> documentParser = new ApiJson<>(Document.class);
    private ApiJson<Document.Request> requestParser = new ApiJson<>(Document.Request.class);

    public DocumentManager(Config config) {
        super("documents/", config);
    }

    public Document upload(InputStream inputStream, String fileName, Document.Request request) throws IOException, OnfidoException {

        RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM)

                .addFormDataPart("applicant_id", request.getApplicantId())
                .addFormDataPart("type", request.getType())
                .addFormDataPart("side", request.getSide())
                .addFormDataPart("issuing_country", request.getIssuingCountry())

                .addFormDataPart(
                        "file",
                        fileName,
                        RequestBody.create(
                                readInputStream(inputStream),
                                MediaType.get(URLConnection.guessContentTypeFromName(fileName)
                                )))

        .build();

        return documentParser.parse(uploadRequest("", requestBody));
    }

    public FileDownload download(String documentId) throws OnfidoException {
        return downloadRequest(documentId + "/download");
    }

    public Document find(String documentId) throws OnfidoException {
        return documentParser.parse(get(documentId));
    }

    public List<Document> list(String applicantId) throws OnfidoException {
        return documentParser.parseWrappedList(get("?applicant_id=" + applicantId), "documents");
    }
}
