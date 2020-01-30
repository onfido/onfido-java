package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.FileDownload;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Document;
import com.onfido.models.LivePhoto;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.List;

public class LivePhotoManager extends ResourceManager {

    private ApiJson<LivePhoto> livePhotoParser = new ApiJson<>(LivePhoto.class);
    private ApiJson<LivePhoto.Request> requestParser = new ApiJson<>(LivePhoto.Request.class);

    public LivePhotoManager(Config config) {
        super("live_photos/", config);
    }

    public LivePhoto upload(InputStream inputStream, String fileName, LivePhoto.Request request) throws IOException, OnfidoException {

        MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);

        addFormDataParam(builder, "applicant_id", request.getApplicantId());
        addFormDataParam(builder, "advanced_validation", request.getAdvancedValidation());

        builder.addFormDataPart(
                "file",
                fileName,
                RequestBody.create(
                        readInputStream(inputStream),
                        MediaType.get(URLConnection.guessContentTypeFromName(fileName)
                        )));

        return livePhotoParser.parse(uploadRequest("", builder.build()));
    }

    public FileDownload download(String livePhotoId) throws OnfidoException {
        return downloadRequest(livePhotoId + "/download");
    }

    public LivePhoto find(String livePhotoId) throws OnfidoException {
        return livePhotoParser.parse(get(livePhotoId));
    }

    public List<LivePhoto> list(String applicantId) throws OnfidoException {
        return livePhotoParser.parseWrappedList(get("?applicant_id=" + applicantId), "live_photos");
    }
}
