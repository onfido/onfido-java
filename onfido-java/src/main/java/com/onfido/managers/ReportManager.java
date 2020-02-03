package com.onfido.managers;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Report;

import java.util.List;

/**
 * Manager class for the Report resource type. Contains resource-specific methods for interacting with the API.
 */
public class ReportManager extends ResourceManager {

    private ApiJson<Report> reportParser = new ApiJson<>(Report.class);
    private ApiJson<Report.Request> requestParser = new ApiJson<>(Report.Request.class);

    /**
     * Instantiates a new ReportManager.
     *
     * @param config the config
     */
    public ReportManager(Config config) {
        super("reports/", config);
    }

    /**
     * Retrieves a single report.
     *
     * @param reportId the report id
     * @return the Report
     * @throws OnfidoException the onfido exception
     */
    public Report find(String reportId) throws OnfidoException {
        return reportParser.parse(get(reportId));
    }

    /**
     * Lists all reports belonging to a particular check.
     *
     * @param checkId the check id
     * @return the list of Reports
     * @throws OnfidoException the onfido exception
     */
    public List<Report> list(String checkId) throws OnfidoException {
        return reportParser.parseWrappedList(get("?check_id=" + checkId), "reports");
    }

    /**
     * Resumes a single paused report. If successful, returns a 204 No Content response.
     *
     * @param reportId the report id
     * @throws OnfidoException the onfido exception
     */
    public void resume(String reportId) throws OnfidoException {
        post(reportId + "/resume", "");
    }

    /**
     * Cancels single paused reports. If successful, returns a 204 No Content response.
     *
     * @param reportId the report id
     * @throws OnfidoException the onfido exception
     */
    public void cancel(String reportId) throws OnfidoException {
        post(reportId + "/cancel", "");
    }
}
