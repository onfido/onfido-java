package com.onfido.managers;

import com.onfido.Config;
import com.onfido.api.ResourceManager;
import com.onfido.api.ApiJson;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Applicant;

public class ApplicantManager extends ResourceManager {

    private ApiJson<Applicant> applicantParser = new ApiJson<>(Applicant.class);
    private ApiJson<Applicant.Request> requestParser = new ApiJson<>(Applicant.Request.class);

    public ApplicantManager(Config config) {
        super(config);
    }

    public Applicant create(Applicant.Request request) throws OnfidoException {
        return applicantParser.parse(post("applicants", requestParser.toJson(request)));
    }
}
