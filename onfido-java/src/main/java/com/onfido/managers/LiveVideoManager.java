package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.FileDownload;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.LiveVideo;

import java.util.List;

/**
 * Manager class for the Live video resource type. Contains resource-specific methods for interacting with the API.
 */
public class LiveVideoManager extends ResourceManager {

    private ApiJson<LiveVideo> liveVideoParser = new ApiJson<>(LiveVideo.class);
    private ApiJson<LiveVideo.Request> requestParser = new ApiJson<>(LiveVideo.Request.class);

    /**
     * Instantiates a new LiveVideoManager.
     *
     * @param config the configuration of the parent onfido object
     */
    public LiveVideoManager(Config config) {
        super("live_videos/", config);
    }

    /**
     * Downloads a live video.
     *
     * @param liveVideoId the live video id
     * @return the downloaded file as a FileDownload
     * @throws OnfidoException the onfido exception
     */
    public FileDownload download(String liveVideoId) throws OnfidoException {
        return downloadRequest(liveVideoId + "/download");
    }

    /**
     * Instead of the whole video, a single frame can be downloaded.
     *
     * @param liveVideoId the live video id
     * @return the downloaded file as a FileDownload
     * @throws OnfidoException the onfido exception
     */
    public FileDownload downloadFrame(String liveVideoId) throws OnfidoException {
        return downloadRequest(liveVideoId + "/frame");
    }

    /**
     * Retrieves a single live video.
     *
     * @param liveVideoId the live video id
     * @return the LiveVideo
     * @throws OnfidoException the onfido exception
     */
    public LiveVideo find(String liveVideoId) throws OnfidoException {
        return liveVideoParser.parse(get(liveVideoId));
    }

    /**
     * Lists all the live videos that belong to an applicant.
     *
     * @param applicantId the applicant id
     * @return the list of LiveVideos
     * @throws OnfidoException the onfido exception
     */
    public List<LiveVideo> list(String applicantId) throws OnfidoException {
        return liveVideoParser.parseWrappedList(get("?applicant_id=" + applicantId), "live_videos");
    }
}
