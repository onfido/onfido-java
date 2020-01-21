package com.onfido.managers;

import com.onfido.Onfido;
import com.onfido.api.Resources;
import com.onfido.api.ApiJson;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Applicant;

public class ApplicantManager extends Resources {

    private ApiJson<Applicant> applicantParser = new ApiJson<>(Applicant.class);
    private ApiJson<Applicant.Request> requestParser = new ApiJson<>(Applicant.Request.class);

    public ApplicantManager(Onfido onfido) {
        super(onfido);
    }

    public Applicant create(Applicant.Request request) throws OnfidoException {
        return applicantParser.parse(post("applicants", requestParser.toJson(request)));
    }
}
