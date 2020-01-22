package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.models.Report;

public class ReportManager extends ResourceManager {

    private ApiJson<Report> reportParser = new ApiJson<>(Report.class);
    private ApiJson<Report.Request> requestParser = new ApiJson<>(Report.Request.class);

    public ReportManager(Config config) {
        super("reports/", config);
    }
}
