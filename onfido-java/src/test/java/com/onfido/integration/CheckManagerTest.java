package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Check;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckManagerTest extends ApiIntegrationTest {

    @Test
    public void createCheck() throws Exception {
        String response = new JsonObject()
                .add("applicant_id", "id")
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        Check check = onfido.check.create(Check.request().applicantId("id").reportNames("report_name_1"));

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/checks/", request.getPath());

        // Correct request body
        String json = request.getBody().readUtf8();
        JsonObject jsonObject = JsonObject.parse(json);
        assertEquals("id", jsonObject.get("check_id"));

        // Correct response body
        assertEquals("id", check.getApplicantId());
    }

    @Test
    public void findCheck() throws Exception {
        String response = new JsonObject()
                .add("applicant_id", "id")
                .toJson();

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        Check check = onfido.check.find("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/checks/id", request.getPath());

        // Correct response body
        assertEquals("id", check.getApplicantId());
    }

    @Test
    public void listChecks() throws Exception {

        String check1 = new JsonObject()
                .add("applicant_id", "id")
                .toJson();

        String check2 = new JsonObject()
                .add("applicant_id", "id")
                .toJson();

        String response = new JsonObject().add("checks", new String[]{check1, check2}).toJson()
                .replace("\\", "")
                .replace("\"{", "{")
                .replace("}\"", "}");

        MockWebServer server = mockRequestResponse(response);

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        List<Check> checks = onfido.check.list("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/checks/?applicant_id=id", request.getPath());

        // Correct response body
        assertEquals("id", checks.get(0).getApplicantId());
        assertEquals("id", checks.get(1).getApplicantId());
    }

    @Test
    public void resumeCheck() throws Exception {
        MockWebServer server = mockRequestResponse("");

        Onfido onfido = Onfido.builder()
                .apiToken("token")
                .unknownApiUrl(server.url("/").toString())
                .build();

        onfido.check.resume("id");

        // Correct path
        RecordedRequest request = server.takeRequest();
        assertEquals("/checks/id/resume", request.getPath());
    }
}
