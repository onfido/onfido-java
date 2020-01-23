package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Report;

import java.util.List;

public class ReportManager extends ResourceManager {

    private ApiJson<Report> reportParser = new ApiJson<>(Report.class);
    private ApiJson<Report.Request> requestParser = new ApiJson<>(Report.Request.class);

    public ReportManager(Config config) {
        super("reports/", config);
    }

    public Report find(String reportId) throws OnfidoException {
        return reportParser.parse(get(reportId));
    }

    public List<Report> list(String checkId) throws OnfidoException {
        return reportParser.parseWrappedList(get("?check_id=" + checkId), "reports");
    }

    public void resume(String reportId) throws OnfidoException {
        post(reportId + "/resume", "");
    }

    public void cancel(String reportId) throws OnfidoException {
        post(reportId + "/cancel", "");
    }
}
