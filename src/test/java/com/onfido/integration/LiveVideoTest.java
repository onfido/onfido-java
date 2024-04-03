package com.onfido.integration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.List;
import java.util.UUID;

import org.apache.commons.codec.Charsets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.onfido.ApiException;
import com.onfido.model.LiveVideo;

public class LiveVideoTest extends TestBase {

  static private UUID sampleLiveVideoId1 = UUID.fromString(System.getenv("ONFIDO_SAMPLE_VIDEO_ID_1"));

  @Test
  public void downloadLiveVideoTest() throws Exception {
    File download = onfido.downloadLiveVideo(sampleLiveVideoId1);

    Assertions.assertTrue(download.length() > 0);
  }
  @Test
  public void downloadLiveVideoFrameTest() throws Exception {
    try {
      File download = onfido.downloadLiveVideoFrame(sampleLiveVideoId1);
      byte[] content = Files.readAllBytes(download.toPath());

      Assertions.assertEquals("JFIF", new String(content, 6, 4));
    } catch (ApiException ex) {
      Assertions.assertEquals(422, ex.getCode());
      Assertions.assertEquals("Failed to extract a frame from the provided video (status code 422)", ex.getMessage());
    }
  }

  @Test
  public void downloadErrorTest() throws Exception {
    try {
      onfido.downloadLiveVideo(nonExistingId);
      Assertions.fail();
    } catch (ApiException ex) {
      Assertions.assertEquals(404, ex.getCode());
    }
  }

  @Test
  public void findLiveVideoTest() throws Exception {
    LiveVideo liveVideo = onfido.findLiveVideo(sampleLiveVideoId1);

    Assertions.assertEquals("video.mov", liveVideo.getFileName());
  }

  @Test
  public void listLiveVideosTest() throws Exception {
    List<LiveVideo> liveVideos = onfido.listLiveVideos(sampleApplicantId).getLiveVideos();

    Assertions.assertEquals("video.mov", liveVideos.get(0).getFileName());
    Assertions.assertEquals("video.mov", liveVideos.get(1).getFileName());
  }
}
