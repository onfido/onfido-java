package com.onfido.managers;

import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.api.ApiJson;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Applicant;

import java.util.List;

public class ApplicantManager extends ResourceManager {

    private ApiJson<Applicant> applicantParser = new ApiJson<>(Applicant.class);
    private ApiJson<Applicant.Request> requestParser = new ApiJson<>(Applicant.Request.class);

    public ApplicantManager(Config config) {
        super("applicants/", config);
    }

    public Applicant create(Applicant.Request request) throws OnfidoException {
        return applicantParser.parse(post("", requestParser.toJson(request)));
    }

    public Applicant find(String id) throws OnfidoException {
        return applicantParser.parse(get(id));
    }

    public Applicant update(String id, Applicant.Request request) throws OnfidoException {
        return applicantParser.parse(put(id, requestParser.toJson(request)));
    }

    public void delete(String id) throws OnfidoException {
        deleteRequest(id);
    }

    public void restore(String id) throws OnfidoException {
        post(id + "/restore", "");
    }

    public List<Applicant> list(int page, int perPage, boolean includedDeleted) throws OnfidoException {
        return applicantParser.parseWrappedList(get(
                "?page=" + page +
                "&per_page=" + perPage +
                "&include_deleted=" + includedDeleted), "applicants");
    }
}
