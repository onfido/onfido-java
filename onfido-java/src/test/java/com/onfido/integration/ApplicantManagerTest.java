package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Applicant;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ApplicantManagerTest extends ApiIntegrationTest {

    @Test
    public void createApplicant() throws Exception {
        String response = new JsonObject()
                .add("first_name", "First")
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        Applicant applicant = onfido.applicant.create(Applicant.request()
                .firstName("First"));

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/applicants/", request.getPath());

        // Correct request body
        String json = request.getBody().readUtf8();
        JsonObject jsonObject = JsonObject.parse(json);
        assertEquals("First", jsonObject.get("first_name"));

        // Correct response body
        assertEquals("First", applicant.getFirstName());
    }

    @Test
    public void findApplicant() throws Exception {
        String response = new JsonObject()
                .add("first_name", "First")
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        Applicant applicant = onfido.applicant.find("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/applicants/id", request.getPath());

        // Correct response body
        assertEquals("First", applicant.getFirstName());
    }

    @Test
    public void updateApplicant() throws Exception {
        String response = new JsonObject()
                .add("first_name", "First")
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        Applicant applicant = onfido.applicant.update("id", Applicant.request()
                .firstName("First"));

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/applicants/id", request.getPath());

        // Correct request body
        String json = request.getBody().readUtf8();
        JsonObject jsonObject = JsonObject.parse(json);
        assertEquals("First", jsonObject.get("first_name"));

        // Correct response body
        assertEquals("First", applicant.getFirstName());
    }


    @Test
    public void deleteApplicant() throws Exception {
        MockWebServer server = mockRequestResponse("");

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        onfido.applicant.delete("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/applicants/id", request.getPath());
    }

    @Test
    public void restoreApplicant() throws Exception {
        MockWebServer server = mockRequestResponse("");

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        onfido.applicant.restore("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/applicants/id/restore", request.getPath());
    }

    @Test
    public void listApplicants() throws Exception {
        String response = new JsonObject().add("applicants", Arrays.asList(
                new JsonObject().add("first_name", "First1").map,
                new JsonObject().add("first_name", "First2").map))
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        List<Applicant> applicants = onfido.applicant.list(1, 20, true);

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/applicants/?page=1&per_page=20&include_deleted=true", request.getPath());

        // Correct response body
        assertEquals("First1", applicants.get(0).getFirstName());
        assertEquals("First2", applicants.get(1).getFirstName());
    }
}