package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.FileDownload;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.LiveVideo;

import java.util.List;

public class LiveVideoManager extends ResourceManager {

    private ApiJson<LiveVideo> liveVideoParser = new ApiJson<>(LiveVideo.class);
    private ApiJson<LiveVideo.Request> requestParser = new ApiJson<>(LiveVideo.Request.class);

    public LiveVideoManager(Config config) {
        super("live_videos/", config);
    }

    public FileDownload download(String liveVideoId) throws OnfidoException {
        return downloadRequest(liveVideoId + "/download");
    }

    public FileDownload downloadFrame(String liveVideoId) throws OnfidoException {
        return downloadRequest(liveVideoId + "/frame");
    }

    public LiveVideo find(String liveVideoId) throws OnfidoException {
        return liveVideoParser.parse(get(liveVideoId));
    }

    public List<LiveVideo> list(String applicantId) throws OnfidoException {
        return liveVideoParser.parseWrappedList(get("?applicant_id=" + applicantId), "live_videos");
    }
}
