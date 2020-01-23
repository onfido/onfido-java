package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Check;

import java.util.List;

public class CheckManager extends ResourceManager {

    private ApiJson<Check> checkParser = new ApiJson<>(Check.class);
    private ApiJson<Check.Request> requestParser = new ApiJson<>(Check.Request.class);

    public CheckManager(Config config) {
        super("checks/", config);
    }

    public Check create(Check.Request request) throws OnfidoException {
        return checkParser.parse(post("", requestParser.toJson(request)));
    }

    public Check find(String checkId) throws OnfidoException {
        return checkParser.parse(get(checkId));
    }

    public List<Check> list(String applicantId) throws OnfidoException {
        return checkParser.parseWrappedList(get("?applicant_id=" + applicantId), "checks");
    }

    public void resume(String checkId) throws OnfidoException {
        post(checkId + "/resume", "");
    }
}
