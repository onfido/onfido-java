package com.onfido.api;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Report;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * The type Report manager test.
 */
public class ReportManagerTest extends ApiIntegrationTest {

    /**
     * Find report.
     *
     * @throws Exception the exception
     */
    @Test
    public void findReport() throws Exception {
        String response = new JsonObject()
                .add("name", "name")
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        Report report = onfido.report.find("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/reports/id", request.getPath());

        // Correct response body
        assertEquals("name", report.getName());
    }

    /**
     * List reports.
     *
     * @throws Exception the exception
     */
    @Test
    public void listReports() throws Exception {
        String response = new JsonObject().add("reports", Arrays.asList(
                new JsonObject().add("name", "name1").map,
                new JsonObject().add("name", "name2").map))
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        List<Report> reports = onfido.report.list("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/reports/?check_id=id", request.getPath());

        // Correct response body
        assertEquals("name1", reports.get(0).getName());
        assertEquals("name2", reports.get(1).getName());
    }

    /**
     * Resume report.
     *
     * @throws Exception the exception
     */
    @Test
    public void resumeReport() throws Exception {
        MockWebServer server = mockRequestResponse("");

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        onfido.report.resume("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/reports/id/resume", request.getPath());
    }

    /**
     * Cancel report.
     *
     * @throws Exception the exception
     */
    @Test
    public void cancelReport() throws Exception {
        MockWebServer server = mockRequestResponse("");

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        onfido.report.cancel("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/reports/id/cancel", request.getPath());
    }
}
