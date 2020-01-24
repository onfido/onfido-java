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

/**
 * Manager class for the Document resource type. Contains resource-specific methods for interacting with the API.
 */
public class DocumentManager extends ResourceManager {

    private ApiJson<Document> documentParser = new ApiJson<>(Document.class);
    private ApiJson<Document.Request> requestParser = new ApiJson<>(Document.Request.class);

    /**
     * Instantiates a new DocumentManager.
     *
     * @param config the configuration object of the parent onfido object
     */
    public DocumentManager(Config config) {
        super("documents/", config);
    }

    /**
     * Uploads a document as part of a multipart request.
     *
     * @param inputStream the content from the desired file as an InputStream
     * @param fileName    the file name, including the file extension
     * @param request     the request body
     * @return the Document
     * @throws IOException     the io exception
     * @throws OnfidoException the onfido exception
     */
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

    /**
     * Downloads specific documents belonging to an applicant.
     *
     * @param documentId the document id
     * @return the downloaded file as a FileDownload
     * @throws OnfidoException the onfido exception
     */
    public FileDownload download(String documentId) throws OnfidoException {
        return downloadRequest(documentId + "/download");
    }

    /**
     * Retrieves a single document.
     *
     * @param documentId the document id
     * @return the Document
     * @throws OnfidoException the onfido exception
     */
    public Document find(String documentId) throws OnfidoException {
        return documentParser.parse(get(documentId));
    }

    /**
     * Lists all documents belonging to an applicant.
     *
     * @param applicantId the applicant id
     * @return the list of Documents
     * @throws OnfidoException the onfido exception
     */
    public List<Document> list(String applicantId) throws OnfidoException {
        return documentParser.parseWrappedList(get("?applicant_id=" + applicantId), "documents");
    }
}
