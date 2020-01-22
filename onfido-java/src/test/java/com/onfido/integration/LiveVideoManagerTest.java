package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.exceptions.ApiException;
import com.onfido.models.LiveVideo;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LiveVideoManagerTest extends ApiIntegrationTest {

    @Test
    public void downloadLiveVideo() throws Exception {
        MockWebServer server = mockFileRequestResponse();

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        InputStream inputStream = onfido.liveVideo.download("live video id").content;

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/live_videos/live%20video%20id/download", request.getPath());

        // Correct response body
        assertNotNull(inputStream);
    }

    @Test
    public void downloadLiveVideoFrame() throws Exception {
        MockWebServer server = mockFileRequestResponse();

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        InputStream inputStream = onfido.liveVideo.downloadFrame("live video id").content;

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/live_videos/live%20video%20id/frame", request.getPath());

        // Correct response body
        assertNotNull(inputStream);
    }

    @Test
    public void downloadError() throws Exception {
        MockWebServer server = mockErrorResponse("error");

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        try {
            onfido.liveVideo.download("live video id");
            Assert.fail();
        } catch (ApiException ex) {
            Assert.assertEquals(403, ex.getStatusCode());
        }
    }

    @Test
    public void findLiveVideo() throws Exception {
        String response = new JsonObject()
                .add("file_name", "file.png")
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        LiveVideo liveVideo = onfido.liveVideo.find("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/live_videos/id", request.getPath());

        // Correct response body
        assertEquals("file.png", liveVideo.getFileName());
    }

    @Test
    public void listLiveVideos() throws Exception {

        String liveVideo1 = new JsonObject()
                .add("file_name", "file1.png").toJson();

        String liveVideo2 = new JsonObject()
                .add("file_name", "file2.png").toJson();

        String response = new JsonObject().add("live_videos", new String[]{liveVideo1, liveVideo2}).toJson()
                .replace("\\", "")
                .replace("\"{", "{")
                .replace("}\"", "}");

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        List<LiveVideo> liveVideos = onfido.liveVideo.list("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/live_videos/?applicant_id=id", request.getPath());

        // Correct response body
        assertEquals("file1.png", liveVideos.get(0).getFileName());
        assertEquals("file2.png", liveVideos.get(1).getFileName());
    }
}
