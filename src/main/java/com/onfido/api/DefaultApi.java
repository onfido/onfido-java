package com.onfido.api;

import com.onfido.ApiException;
import com.onfido.ApiClient;
import com.onfido.ApiResponse;
import com.onfido.Configuration;
import com.onfido.Pair;

import javax.ws.rs.core.GenericType;

import com.onfido.model.AddressesList;
import com.onfido.model.Applicant;
import com.onfido.model.ApplicantBuilder;
import com.onfido.model.ApplicantUpdater;
import com.onfido.model.ApplicantsList;
import com.onfido.model.Check;
import com.onfido.model.CheckBuilder;
import com.onfido.model.ChecksList;
import com.onfido.model.CompleteTaskRequest;
import com.onfido.model.CountryCodes;
import com.onfido.model.Document;
import com.onfido.model.DocumentsList;
import com.onfido.model.Error;
import com.onfido.model.Error1;
import com.onfido.model.ExtractRequest;
import com.onfido.model.Extraction;
import java.io.File;
import com.onfido.model.IDPhotosList;
import com.onfido.model.IdPhoto;
import com.onfido.model.LivePhoto;
import com.onfido.model.LivePhotosList;
import com.onfido.model.LiveVideo;
import com.onfido.model.LiveoVideosList;
import com.onfido.model.LocationBuilder;
import com.onfido.model.MotionCapture;
import com.onfido.model.MotionCapturesList;
import java.time.OffsetDateTime;
import com.onfido.model.RepeatAttemptsList;
import com.onfido.model.Report;
import com.onfido.model.ReportsList;
import com.onfido.model.ResultsFeedback;
import com.onfido.model.SdkToken;
import com.onfido.model.SdkTokenBuilder;
import com.onfido.model.Task;
import java.util.UUID;
import com.onfido.model.UpdateMonitorMatchRequest;
import com.onfido.model.WatchlistMonitor;
import com.onfido.model.WatchlistMonitorMatch;
import com.onfido.model.Webhook;
import com.onfido.model.WebhookBuilder;
import com.onfido.model.WebhookResend;
import com.onfido.model.WebhookUpdater;
import com.onfido.model.WebhooksList;
import com.onfido.model.WorkflowRun;
import com.onfido.model.WorkflowRunBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * This endpoint is for cancelling individual paused reports.
   * 
   * @param reportId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void cancelReport(UUID reportId) throws ApiException {
    cancelReportWithHttpInfo(reportId);
  }

  /**
   * This endpoint is for cancelling individual paused reports.
   * 
   * @param reportId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> cancelReportWithHttpInfo(UUID reportId) throws ApiException {
    // Check required parameters
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling cancelReport");
    }

    // Path parameters
    String localVarPath = "/reports/{report_id}/cancel"
            .replaceAll("\\{report_id}", apiClient.escapeString(reportId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    return apiClient.invokeAPI("DefaultApi.cancelReport", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Completes a Send / Receive Data task.
   * 
   * @param workflowRunId The unique identifier of the Workflow Run to which the Task belongs. (required)
   * @param taskId The identifier of the Task you want to complete. (required)
   * @param completeTaskRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An empty response body. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void completeTask(UUID workflowRunId, String taskId, CompleteTaskRequest completeTaskRequest) throws ApiException {
    completeTaskWithHttpInfo(workflowRunId, taskId, completeTaskRequest);
  }

  /**
   * Completes a Send / Receive Data task.
   * 
   * @param workflowRunId The unique identifier of the Workflow Run to which the Task belongs. (required)
   * @param taskId The identifier of the Task you want to complete. (required)
   * @param completeTaskRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An empty response body. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> completeTaskWithHttpInfo(UUID workflowRunId, String taskId, CompleteTaskRequest completeTaskRequest) throws ApiException {
    // Check required parameters
    if (workflowRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunId' when calling completeTask");
    }
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling completeTask");
    }
    if (completeTaskRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'completeTaskRequest' when calling completeTask");
    }

    // Path parameters
    String localVarPath = "/workflow_runs/{workflow_run_id}/tasks/{task_id}/complete"
            .replaceAll("\\{workflow_run_id}", apiClient.escapeString(workflowRunId.toString()))
            .replaceAll("\\{task_id}", apiClient.escapeString(taskId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    return apiClient.invokeAPI("DefaultApi.completeTask", localVarPath, "POST", new ArrayList<>(), completeTaskRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Create Applicant
   * 
   * @param applicantBuilder  (required)
   * @return Applicant
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Applicant createApplicant(ApplicantBuilder applicantBuilder) throws ApiException {
    return createApplicantWithHttpInfo(applicantBuilder).getData();
  }

  /**
   * Create Applicant
   * 
   * @param applicantBuilder  (required)
   * @return ApiResponse&lt;Applicant&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Applicant> createApplicantWithHttpInfo(ApplicantBuilder applicantBuilder) throws ApiException {
    // Check required parameters
    if (applicantBuilder == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantBuilder' when calling createApplicant");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Applicant> localVarReturnType = new GenericType<Applicant>() {};
    return apiClient.invokeAPI("DefaultApi.createApplicant", "/applicants", "POST", new ArrayList<>(), applicantBuilder,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a check
   * 
   * @param checkBuilder  (required)
   * @return Check
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Check createCheck(CheckBuilder checkBuilder) throws ApiException {
    return createCheckWithHttpInfo(checkBuilder).getData();
  }

  /**
   * Create a check
   * 
   * @param checkBuilder  (required)
   * @return ApiResponse&lt;Check&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Check> createCheckWithHttpInfo(CheckBuilder checkBuilder) throws ApiException {
    // Check required parameters
    if (checkBuilder == null) {
      throw new ApiException(400, "Missing the required parameter 'checkBuilder' when calling createCheck");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Check> localVarReturnType = new GenericType<Check>() {};
    return apiClient.invokeAPI("DefaultApi.createCheck", "/checks", "POST", new ArrayList<>(), checkBuilder,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Creates a new monitor for the applicant
   * 
   * @param watchlistMonitor  (required)
   * @return WatchlistMonitor
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Created watchlist monitor </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WatchlistMonitor createWatchlistMonitor(WatchlistMonitor watchlistMonitor) throws ApiException {
    return createWatchlistMonitorWithHttpInfo(watchlistMonitor).getData();
  }

  /**
   * Creates a new monitor for the applicant
   * 
   * @param watchlistMonitor  (required)
   * @return ApiResponse&lt;WatchlistMonitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Created watchlist monitor </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WatchlistMonitor> createWatchlistMonitorWithHttpInfo(WatchlistMonitor watchlistMonitor) throws ApiException {
    // Check required parameters
    if (watchlistMonitor == null) {
      throw new ApiException(400, "Missing the required parameter 'watchlistMonitor' when calling createWatchlistMonitor");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<WatchlistMonitor> localVarReturnType = new GenericType<WatchlistMonitor>() {};
    return apiClient.invokeAPI("DefaultApi.createWatchlistMonitor", "/watchlist_monitors", "POST", new ArrayList<>(), watchlistMonitor,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a webhook
   * 
   * @param webhookBuilder  (required)
   * @return Webhook
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Webhook createWebhook(WebhookBuilder webhookBuilder) throws ApiException {
    return createWebhookWithHttpInfo(webhookBuilder).getData();
  }

  /**
   * Create a webhook
   * 
   * @param webhookBuilder  (required)
   * @return ApiResponse&lt;Webhook&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Webhook> createWebhookWithHttpInfo(WebhookBuilder webhookBuilder) throws ApiException {
    // Check required parameters
    if (webhookBuilder == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookBuilder' when calling createWebhook");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Webhook> localVarReturnType = new GenericType<Webhook>() {};
    return apiClient.invokeAPI("DefaultApi.createWebhook", "/webhooks", "POST", new ArrayList<>(), webhookBuilder,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a Workflow Run.
   * 
   * @param workflowRunBuilder  (required)
   * @return WorkflowRun
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A Workflow Run object. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WorkflowRun createWorkflowRun(WorkflowRunBuilder workflowRunBuilder) throws ApiException {
    return createWorkflowRunWithHttpInfo(workflowRunBuilder).getData();
  }

  /**
   * Create a Workflow Run.
   * 
   * @param workflowRunBuilder  (required)
   * @return ApiResponse&lt;WorkflowRun&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A Workflow Run object. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkflowRun> createWorkflowRunWithHttpInfo(WorkflowRunBuilder workflowRunBuilder) throws ApiException {
    // Check required parameters
    if (workflowRunBuilder == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunBuilder' when calling createWorkflowRun");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<WorkflowRun> localVarReturnType = new GenericType<WorkflowRun>() {};
    return apiClient.invokeAPI("DefaultApi.createWorkflowRun", "/workflow_runs", "POST", new ArrayList<>(), workflowRunBuilder,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Applicant
   * 
   * @param applicantId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteApplicant(UUID applicantId) throws ApiException {
    deleteApplicantWithHttpInfo(applicantId);
  }

  /**
   * Delete Applicant
   * 
   * @param applicantId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteApplicantWithHttpInfo(UUID applicantId) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling deleteApplicant");
    }

    // Path parameters
    String localVarPath = "/applicants/{applicant_id}"
            .replaceAll("\\{applicant_id}", apiClient.escapeString(applicantId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    return apiClient.invokeAPI("DefaultApi.deleteApplicant", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Deactivates the given monitor
   * 
   * @param monitorId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteWatchlistMonitor(UUID monitorId) throws ApiException {
    deleteWatchlistMonitorWithHttpInfo(monitorId);
  }

  /**
   * Deactivates the given monitor
   * 
   * @param monitorId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteWatchlistMonitorWithHttpInfo(UUID monitorId) throws ApiException {
    // Check required parameters
    if (monitorId == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorId' when calling deleteWatchlistMonitor");
    }

    // Path parameters
    String localVarPath = "/watchlist_monitors/{monitor_id}"
            .replaceAll("\\{monitor_id}", apiClient.escapeString(monitorId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    return apiClient.invokeAPI("DefaultApi.deleteWatchlistMonitor", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete a webhook
   * 
   * @param webhookId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Webhook deleted </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteWebhook(UUID webhookId) throws ApiException {
    deleteWebhookWithHttpInfo(webhookId);
  }

  /**
   * Delete a webhook
   * 
   * @param webhookId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Webhook deleted </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteWebhookWithHttpInfo(UUID webhookId) throws ApiException {
    // Check required parameters
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling deleteWebhook");
    }

    // Path parameters
    String localVarPath = "/webhooks/{webhook_id}"
            .replaceAll("\\{webhook_id}", apiClient.escapeString(webhookId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    return apiClient.invokeAPI("DefaultApi.deleteWebhook", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Download raw data for a check
   * 
   * @param checkId  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The check PDF binary data </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadCheck(UUID checkId) throws ApiException {
    return downloadCheckWithHttpInfo(checkId).getData();
  }

  /**
   * Download raw data for a check
   * 
   * @param checkId  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The check PDF binary data </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadCheckWithHttpInfo(UUID checkId) throws ApiException {
    // Check required parameters
    if (checkId == null) {
      throw new ApiException(400, "Missing the required parameter 'checkId' when calling downloadCheck");
    }

    // Path parameters
    String localVarPath = "/checks/{check_id}/download"
            .replaceAll("\\{check_id}", apiClient.escapeString(checkId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/pdf", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("DefaultApi.downloadCheck", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download raw data for a document
   * 
   * @param documentId  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The document binary data </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadDocument(UUID documentId) throws ApiException {
    return downloadDocumentWithHttpInfo(documentId).getData();
  }

  /**
   * Download raw data for a document
   * 
   * @param documentId  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The document binary data </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadDocumentWithHttpInfo(UUID documentId) throws ApiException {
    // Check required parameters
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling downloadDocument");
    }

    // Path parameters
    String localVarPath = "/documents/{document_id}/download"
            .replaceAll("\\{document_id}", apiClient.escapeString(documentId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("DefaultApi.downloadDocument", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download a documents raw data
   * 
   * @param documentId  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The document&#39;s video binary data </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadDocumentVideo(String documentId) throws ApiException {
    return downloadDocumentVideoWithHttpInfo(documentId).getData();
  }

  /**
   * Download a documents raw data
   * 
   * @param documentId  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The document&#39;s video binary data </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadDocumentVideoWithHttpInfo(String documentId) throws ApiException {
    // Check required parameters
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling downloadDocumentVideo");
    }

    // Path parameters
    String localVarPath = "/documents/{document_id}/video/download"
            .replaceAll("\\{document_id}", apiClient.escapeString(documentId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("DefaultApi.downloadDocumentVideo", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download ID photo
   * ID photos are downloaded using this endpoint.
   * @param idPhotoId The ID photo&#39;s unique identifier. (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The ID photo&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadIdPhoto(UUID idPhotoId) throws ApiException {
    return downloadIdPhotoWithHttpInfo(idPhotoId).getData();
  }

  /**
   * Download ID photo
   * ID photos are downloaded using this endpoint.
   * @param idPhotoId The ID photo&#39;s unique identifier. (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The ID photo&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadIdPhotoWithHttpInfo(UUID idPhotoId) throws ApiException {
    // Check required parameters
    if (idPhotoId == null) {
      throw new ApiException(400, "Missing the required parameter 'idPhotoId' when calling downloadIdPhoto");
    }

    // Path parameters
    String localVarPath = "/id_photos/{id_photo_id}/download"
            .replaceAll("\\{id_photo_id}", apiClient.escapeString(idPhotoId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("DefaultApi.downloadIdPhoto", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download live photo
   * Live photos are downloaded using this endpoint.
   * @param livePhotoId The live photo&#39;s unique identifier. (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The live photo&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadLivePhoto(UUID livePhotoId) throws ApiException {
    return downloadLivePhotoWithHttpInfo(livePhotoId).getData();
  }

  /**
   * Download live photo
   * Live photos are downloaded using this endpoint.
   * @param livePhotoId The live photo&#39;s unique identifier. (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The live photo&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadLivePhotoWithHttpInfo(UUID livePhotoId) throws ApiException {
    // Check required parameters
    if (livePhotoId == null) {
      throw new ApiException(400, "Missing the required parameter 'livePhotoId' when calling downloadLivePhoto");
    }

    // Path parameters
    String localVarPath = "/live_photos/{live_photo_id}/download"
            .replaceAll("\\{live_photo_id}", apiClient.escapeString(livePhotoId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("DefaultApi.downloadLivePhoto", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download live video
   * Live videos are downloaded using this endpoint.
   * @param liveVideoId The live video&#39;s unique identifier. (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The live video&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadLiveVideo(UUID liveVideoId) throws ApiException {
    return downloadLiveVideoWithHttpInfo(liveVideoId).getData();
  }

  /**
   * Download live video
   * Live videos are downloaded using this endpoint.
   * @param liveVideoId The live video&#39;s unique identifier. (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The live video&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadLiveVideoWithHttpInfo(UUID liveVideoId) throws ApiException {
    // Check required parameters
    if (liveVideoId == null) {
      throw new ApiException(400, "Missing the required parameter 'liveVideoId' when calling downloadLiveVideo");
    }

    // Path parameters
    String localVarPath = "/live_videos/{live_video_id}/download"
            .replaceAll("\\{live_video_id}", apiClient.escapeString(liveVideoId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("DefaultApi.downloadLiveVideo", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download live video frame
   * Returns the binary data representing a single frame from a live video.
   * @param liveVideoId The live video&#39;s unique identifier. (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The live video frame&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadLiveVideoFrame(UUID liveVideoId) throws ApiException {
    return downloadLiveVideoFrameWithHttpInfo(liveVideoId).getData();
  }

  /**
   * Download live video frame
   * Returns the binary data representing a single frame from a live video.
   * @param liveVideoId The live video&#39;s unique identifier. (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The live video frame&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadLiveVideoFrameWithHttpInfo(UUID liveVideoId) throws ApiException {
    // Check required parameters
    if (liveVideoId == null) {
      throw new ApiException(400, "Missing the required parameter 'liveVideoId' when calling downloadLiveVideoFrame");
    }

    // Path parameters
    String localVarPath = "/live_videos/{live_video_id}/frame"
            .replaceAll("\\{live_video_id}", apiClient.escapeString(liveVideoId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("DefaultApi.downloadLiveVideoFrame", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download motion capture
   * Motion captures are downloaded using this endpoint.
   * @param motionCaptureId The motion capture&#39;s unique identifier. (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The motion capture&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadMotionCapture(UUID motionCaptureId) throws ApiException {
    return downloadMotionCaptureWithHttpInfo(motionCaptureId).getData();
  }

  /**
   * Download motion capture
   * Motion captures are downloaded using this endpoint.
   * @param motionCaptureId The motion capture&#39;s unique identifier. (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The motion capture&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadMotionCaptureWithHttpInfo(UUID motionCaptureId) throws ApiException {
    // Check required parameters
    if (motionCaptureId == null) {
      throw new ApiException(400, "Missing the required parameter 'motionCaptureId' when calling downloadMotionCapture");
    }

    // Path parameters
    String localVarPath = "/motion_captures/{motion_capture_id}/download"
            .replaceAll("\\{motion_capture_id}", apiClient.escapeString(motionCaptureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("DefaultApi.downloadMotionCapture", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download motion capture frame
   * Instead of the whole capture binary, a single frame can be downloaded using this endpoint. Returns the binary data representing the frame.
   * @param motionCaptureId The motion capture&#39;s unique identifier. (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The motion capture frame&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadMotionCaptureFrame(UUID motionCaptureId) throws ApiException {
    return downloadMotionCaptureFrameWithHttpInfo(motionCaptureId).getData();
  }

  /**
   * Download motion capture frame
   * Instead of the whole capture binary, a single frame can be downloaded using this endpoint. Returns the binary data representing the frame.
   * @param motionCaptureId The motion capture&#39;s unique identifier. (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The motion capture frame&#39;s binary data. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadMotionCaptureFrameWithHttpInfo(UUID motionCaptureId) throws ApiException {
    // Check required parameters
    if (motionCaptureId == null) {
      throw new ApiException(400, "Missing the required parameter 'motionCaptureId' when calling downloadMotionCaptureFrame");
    }

    // Path parameters
    String localVarPath = "/motion_captures/{motion_capture_id}/frame"
            .replaceAll("\\{motion_capture_id}", apiClient.escapeString(motionCaptureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("DefaultApi.downloadMotionCaptureFrame", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieves the signed evidence file for the designated Workflow Run
   * 
   * @param workflowRunId Workflow Run ID (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The signed evidence file PDF </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadSignedEvidenceFile(UUID workflowRunId) throws ApiException {
    return downloadSignedEvidenceFileWithHttpInfo(workflowRunId).getData();
  }

  /**
   * Retrieves the signed evidence file for the designated Workflow Run
   * 
   * @param workflowRunId Workflow Run ID (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The signed evidence file PDF </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadSignedEvidenceFileWithHttpInfo(UUID workflowRunId) throws ApiException {
    // Check required parameters
    if (workflowRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunId' when calling downloadSignedEvidenceFile");
    }

    // Path parameters
    String localVarPath = "/workflow_runs/{workflow_run_id}/signed_evidence_file"
            .replaceAll("\\{workflow_run_id}", apiClient.escapeString(workflowRunId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("binary/octet-stream", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("DefaultApi.downloadSignedEvidenceFile", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Extract information from a document
   * 
   * @param extractRequest  (required)
   * @return Extraction
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Extraction result </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public Extraction extract(ExtractRequest extractRequest) throws ApiException {
    return extractWithHttpInfo(extractRequest).getData();
  }

  /**
   * Extract information from a document
   * 
   * @param extractRequest  (required)
   * @return ApiResponse&lt;Extraction&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Extraction result </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Extraction> extractWithHttpInfo(ExtractRequest extractRequest) throws ApiException {
    // Check required parameters
    if (extractRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'extractRequest' when calling extract");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Extraction> localVarReturnType = new GenericType<Extraction>() {};
    return apiClient.invokeAPI("DefaultApi.extract", "/extractions", "POST", new ArrayList<>(), extractRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for addresses by postcode
   * 
   * @param postcode  (required)
   * @return AddressesList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of addresses </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public AddressesList findAddresses(String postcode) throws ApiException {
    return findAddressesWithHttpInfo(postcode).getData();
  }

  /**
   * Search for addresses by postcode
   * 
   * @param postcode  (required)
   * @return ApiResponse&lt;AddressesList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of addresses </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AddressesList> findAddressesWithHttpInfo(String postcode) throws ApiException {
    // Check required parameters
    if (postcode == null) {
      throw new ApiException(400, "Missing the required parameter 'postcode' when calling findAddresses");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "postcode", postcode)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<AddressesList> localVarReturnType = new GenericType<AddressesList>() {};
    return apiClient.invokeAPI("DefaultApi.findAddresses", "/addresses/pick", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve Applicant
   * 
   * @param applicantId  (required)
   * @return Applicant
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Applicant object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Applicant findApplicant(UUID applicantId) throws ApiException {
    return findApplicantWithHttpInfo(applicantId).getData();
  }

  /**
   * Retrieve Applicant
   * 
   * @param applicantId  (required)
   * @return ApiResponse&lt;Applicant&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Applicant object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Applicant> findApplicantWithHttpInfo(UUID applicantId) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling findApplicant");
    }

    // Path parameters
    String localVarPath = "/applicants/{applicant_id}"
            .replaceAll("\\{applicant_id}", apiClient.escapeString(applicantId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Applicant> localVarReturnType = new GenericType<Applicant>() {};
    return apiClient.invokeAPI("DefaultApi.findApplicant", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Check
   * 
   * @param checkId  (required)
   * @return Check
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Check object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Check findCheck(UUID checkId) throws ApiException {
    return findCheckWithHttpInfo(checkId).getData();
  }

  /**
   * Retrieve a Check
   * 
   * @param checkId  (required)
   * @return ApiResponse&lt;Check&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Check object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Check> findCheckWithHttpInfo(UUID checkId) throws ApiException {
    // Check required parameters
    if (checkId == null) {
      throw new ApiException(400, "Missing the required parameter 'checkId' when calling findCheck");
    }

    // Path parameters
    String localVarPath = "/checks/{check_id}"
            .replaceAll("\\{check_id}", apiClient.escapeString(checkId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Check> localVarReturnType = new GenericType<Check>() {};
    return apiClient.invokeAPI("DefaultApi.findCheck", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * A single document can be retrieved by calling this endpoint with the document&#39;s unique identifier.
   * 
   * @param documentId  (required)
   * @return Document
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A document </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Document findDocument(UUID documentId) throws ApiException {
    return findDocumentWithHttpInfo(documentId).getData();
  }

  /**
   * A single document can be retrieved by calling this endpoint with the document&#39;s unique identifier.
   * 
   * @param documentId  (required)
   * @return ApiResponse&lt;Document&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A document </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Document> findDocumentWithHttpInfo(UUID documentId) throws ApiException {
    // Check required parameters
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling findDocument");
    }

    // Path parameters
    String localVarPath = "/documents/{document_id}"
            .replaceAll("\\{document_id}", apiClient.escapeString(documentId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Document> localVarReturnType = new GenericType<Document>() {};
    return apiClient.invokeAPI("DefaultApi.findDocument", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve ID photo
   * 
   * @param idPhotoId The ID photo&#39;s unique identifier. (required)
   * @return IdPhoto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A ID photo </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public IdPhoto findIdPhoto(UUID idPhotoId) throws ApiException {
    return findIdPhotoWithHttpInfo(idPhotoId).getData();
  }

  /**
   * Retrieve ID photo
   * 
   * @param idPhotoId The ID photo&#39;s unique identifier. (required)
   * @return ApiResponse&lt;IdPhoto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A ID photo </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdPhoto> findIdPhotoWithHttpInfo(UUID idPhotoId) throws ApiException {
    // Check required parameters
    if (idPhotoId == null) {
      throw new ApiException(400, "Missing the required parameter 'idPhotoId' when calling findIdPhoto");
    }

    // Path parameters
    String localVarPath = "/id_photos/{id_photo_id}"
            .replaceAll("\\{id_photo_id}", apiClient.escapeString(idPhotoId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<IdPhoto> localVarReturnType = new GenericType<IdPhoto>() {};
    return apiClient.invokeAPI("DefaultApi.findIdPhoto", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve live photo
   * 
   * @param livePhotoId The live photo&#39;s unique identifier. (required)
   * @return LivePhoto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A live photo </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public LivePhoto findLivePhoto(UUID livePhotoId) throws ApiException {
    return findLivePhotoWithHttpInfo(livePhotoId).getData();
  }

  /**
   * Retrieve live photo
   * 
   * @param livePhotoId The live photo&#39;s unique identifier. (required)
   * @return ApiResponse&lt;LivePhoto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A live photo </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LivePhoto> findLivePhotoWithHttpInfo(UUID livePhotoId) throws ApiException {
    // Check required parameters
    if (livePhotoId == null) {
      throw new ApiException(400, "Missing the required parameter 'livePhotoId' when calling findLivePhoto");
    }

    // Path parameters
    String localVarPath = "/live_photos/{live_photo_id}"
            .replaceAll("\\{live_photo_id}", apiClient.escapeString(livePhotoId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<LivePhoto> localVarReturnType = new GenericType<LivePhoto>() {};
    return apiClient.invokeAPI("DefaultApi.findLivePhoto", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve live video
   * 
   * @param liveVideoId The live video&#39;s unique identifier. (required)
   * @return LiveVideo
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A live video </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public LiveVideo findLiveVideo(UUID liveVideoId) throws ApiException {
    return findLiveVideoWithHttpInfo(liveVideoId).getData();
  }

  /**
   * Retrieve live video
   * 
   * @param liveVideoId The live video&#39;s unique identifier. (required)
   * @return ApiResponse&lt;LiveVideo&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A live video </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LiveVideo> findLiveVideoWithHttpInfo(UUID liveVideoId) throws ApiException {
    // Check required parameters
    if (liveVideoId == null) {
      throw new ApiException(400, "Missing the required parameter 'liveVideoId' when calling findLiveVideo");
    }

    // Path parameters
    String localVarPath = "/live_videos/{live_video_id}"
            .replaceAll("\\{live_video_id}", apiClient.escapeString(liveVideoId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<LiveVideo> localVarReturnType = new GenericType<LiveVideo>() {};
    return apiClient.invokeAPI("DefaultApi.findLiveVideo", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve motion capture
   * 
   * @param motionCaptureId The motion capture&#39;s unique identifier. (required)
   * @return MotionCapture
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A motion capture </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public MotionCapture findMotionCapture(UUID motionCaptureId) throws ApiException {
    return findMotionCaptureWithHttpInfo(motionCaptureId).getData();
  }

  /**
   * Retrieve motion capture
   * 
   * @param motionCaptureId The motion capture&#39;s unique identifier. (required)
   * @return ApiResponse&lt;MotionCapture&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A motion capture </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MotionCapture> findMotionCaptureWithHttpInfo(UUID motionCaptureId) throws ApiException {
    // Check required parameters
    if (motionCaptureId == null) {
      throw new ApiException(400, "Missing the required parameter 'motionCaptureId' when calling findMotionCapture");
    }

    // Path parameters
    String localVarPath = "/motion_captures/{motion_capture_id}"
            .replaceAll("\\{motion_capture_id}", apiClient.escapeString(motionCaptureId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<MotionCapture> localVarReturnType = new GenericType<MotionCapture>() {};
    return apiClient.invokeAPI("DefaultApi.findMotionCapture", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * A single report can be retrieved using this endpoint with the corresponding unique identifier.
   * 
   * @param reportId  (required)
   * @return Report
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Report object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Report findReport(UUID reportId) throws ApiException {
    return findReportWithHttpInfo(reportId).getData();
  }

  /**
   * A single report can be retrieved using this endpoint with the corresponding unique identifier.
   * 
   * @param reportId  (required)
   * @return ApiResponse&lt;Report&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Report object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Report> findReportWithHttpInfo(UUID reportId) throws ApiException {
    // Check required parameters
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling findReport");
    }

    // Path parameters
    String localVarPath = "/reports/{report_id}"
            .replaceAll("\\{report_id}", apiClient.escapeString(reportId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Report> localVarReturnType = new GenericType<Report>() {};
    return apiClient.invokeAPI("DefaultApi.findReport", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * A single task can be retrieved by calling this endpoint with the unique identifier of the Task and Workflow Run.
   * 
   * @param workflowRunId The unique identifier of the Workflow Run to which the Task belongs. (required)
   * @param taskId The identifier of the Task you want to retrieve. (required)
   * @return Task
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Task object. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Task findTask(UUID workflowRunId, String taskId) throws ApiException {
    return findTaskWithHttpInfo(workflowRunId, taskId).getData();
  }

  /**
   * A single task can be retrieved by calling this endpoint with the unique identifier of the Task and Workflow Run.
   * 
   * @param workflowRunId The unique identifier of the Workflow Run to which the Task belongs. (required)
   * @param taskId The identifier of the Task you want to retrieve. (required)
   * @return ApiResponse&lt;Task&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Task object. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Task> findTaskWithHttpInfo(UUID workflowRunId, String taskId) throws ApiException {
    // Check required parameters
    if (workflowRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunId' when calling findTask");
    }
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling findTask");
    }

    // Path parameters
    String localVarPath = "/workflow_runs/{workflow_run_id}/tasks/{task_id}"
            .replaceAll("\\{workflow_run_id}", apiClient.escapeString(workflowRunId.toString()))
            .replaceAll("\\{task_id}", apiClient.escapeString(taskId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Task> localVarReturnType = new GenericType<Task>() {};
    return apiClient.invokeAPI("DefaultApi.findTask", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieves a single monitor
   * 
   * @param monitorId The watchlist monitor&#39;s unique identifier. (required)
   * @return WatchlistMonitor
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A watchlist monitor </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WatchlistMonitor findWatchlistMonitor(UUID monitorId) throws ApiException {
    return findWatchlistMonitorWithHttpInfo(monitorId).getData();
  }

  /**
   * Retrieves a single monitor
   * 
   * @param monitorId The watchlist monitor&#39;s unique identifier. (required)
   * @return ApiResponse&lt;WatchlistMonitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A watchlist monitor </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WatchlistMonitor> findWatchlistMonitorWithHttpInfo(UUID monitorId) throws ApiException {
    // Check required parameters
    if (monitorId == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorId' when calling findWatchlistMonitor");
    }

    // Path parameters
    String localVarPath = "/watchlist_monitors/{monitor_id}"
            .replaceAll("\\{monitor_id}", apiClient.escapeString(monitorId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<WatchlistMonitor> localVarReturnType = new GenericType<WatchlistMonitor>() {};
    return apiClient.invokeAPI("DefaultApi.findWatchlistMonitor", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Webhook
   * 
   * @param webhookId  (required)
   * @return Webhook
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Webhook object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Webhook findWebhook(UUID webhookId) throws ApiException {
    return findWebhookWithHttpInfo(webhookId).getData();
  }

  /**
   * Retrieve a Webhook
   * 
   * @param webhookId  (required)
   * @return ApiResponse&lt;Webhook&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Webhook object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Webhook> findWebhookWithHttpInfo(UUID webhookId) throws ApiException {
    // Check required parameters
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling findWebhook");
    }

    // Path parameters
    String localVarPath = "/webhooks/{webhook_id}"
            .replaceAll("\\{webhook_id}", apiClient.escapeString(webhookId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Webhook> localVarReturnType = new GenericType<Webhook>() {};
    return apiClient.invokeAPI("DefaultApi.findWebhook", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * A single workflow run can be retrieved by calling this endpoint with the unique identifier of the Workflow Run.
   * 
   * @param workflowRunId The unique identifier of the Workflow Run. (required)
   * @return WorkflowRun
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Workflow Run object. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WorkflowRun findWorkflowRun(UUID workflowRunId) throws ApiException {
    return findWorkflowRunWithHttpInfo(workflowRunId).getData();
  }

  /**
   * A single workflow run can be retrieved by calling this endpoint with the unique identifier of the Workflow Run.
   * 
   * @param workflowRunId The unique identifier of the Workflow Run. (required)
   * @return ApiResponse&lt;WorkflowRun&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Workflow Run object. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkflowRun> findWorkflowRunWithHttpInfo(UUID workflowRunId) throws ApiException {
    // Check required parameters
    if (workflowRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunId' when calling findWorkflowRun");
    }

    // Path parameters
    String localVarPath = "/workflow_runs/{workflow_run_id}"
            .replaceAll("\\{workflow_run_id}", apiClient.escapeString(workflowRunId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<WorkflowRun> localVarReturnType = new GenericType<WorkflowRun>() {};
    return apiClient.invokeAPI("DefaultApi.findWorkflowRun", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Force new report creation (BETA)
   * 
   * @param monitorId  (required)
   * @return Applicant
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - Link to the newly generated report. <br>  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Applicant forceNewRecordCreation(UUID monitorId) throws ApiException {
    return forceNewRecordCreationWithHttpInfo(monitorId).getData();
  }

  /**
   * Force new report creation (BETA)
   * 
   * @param monitorId  (required)
   * @return ApiResponse&lt;Applicant&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - Link to the newly generated report. <br>  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Applicant> forceNewRecordCreationWithHttpInfo(UUID monitorId) throws ApiException {
    // Check required parameters
    if (monitorId == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorId' when calling forceNewRecordCreation");
    }

    // Path parameters
    String localVarPath = "/watchlist_monitors/{monitor_id}/new_report"
            .replaceAll("\\{monitor_id}", apiClient.escapeString(monitorId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Applicant> localVarReturnType = new GenericType<Applicant>() {};
    return apiClient.invokeAPI("DefaultApi.forceNewRecordCreation", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Generate a SDK token
   * 
   * @param sdkTokenBuilder  (required)
   * @return SdkToken
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Generated </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SdkToken generateSdkToken(SdkTokenBuilder sdkTokenBuilder) throws ApiException {
    return generateSdkTokenWithHttpInfo(sdkTokenBuilder).getData();
  }

  /**
   * Generate a SDK token
   * 
   * @param sdkTokenBuilder  (required)
   * @return ApiResponse&lt;SdkToken&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Generated </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SdkToken> generateSdkTokenWithHttpInfo(SdkTokenBuilder sdkTokenBuilder) throws ApiException {
    // Check required parameters
    if (sdkTokenBuilder == null) {
      throw new ApiException(400, "Missing the required parameter 'sdkTokenBuilder' when calling generateSdkToken");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<SdkToken> localVarReturnType = new GenericType<SdkToken>() {};
    return apiClient.invokeAPI("DefaultApi.generateSdkToken", "/sdk_token", "POST", new ArrayList<>(), sdkTokenBuilder,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List Applicants
   * 
   * @param page The page to return. The first page is &#x60;page&#x3D;1&#x60; (optional, default to 1)
   * @param perPage The number of objects per page. (optional, default to 20)
   * @param includeDeleted Whether to also include applicants scheduled for deletion. (optional, default to false)
   * @return ApplicantsList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of applicants </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApplicantsList listApplicants(Integer page, Integer perPage, Boolean includeDeleted) throws ApiException {
    return listApplicantsWithHttpInfo(page, perPage, includeDeleted).getData();
  }

  /**
   * List Applicants
   * 
   * @param page The page to return. The first page is &#x60;page&#x3D;1&#x60; (optional, default to 1)
   * @param perPage The number of objects per page. (optional, default to 20)
   * @param includeDeleted Whether to also include applicants scheduled for deletion. (optional, default to false)
   * @return ApiResponse&lt;ApplicantsList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of applicants </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApplicantsList> listApplicantsWithHttpInfo(Integer page, Integer perPage, Boolean includeDeleted) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "page", page)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_deleted", includeDeleted));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<ApplicantsList> localVarReturnType = new GenericType<ApplicantsList>() {};
    return apiClient.invokeAPI("DefaultApi.listApplicants", "/applicants", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve Checks
   * 
   * @param applicantId  (required)
   * @return ChecksList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of checks </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ChecksList listChecks(UUID applicantId) throws ApiException {
    return listChecksWithHttpInfo(applicantId).getData();
  }

  /**
   * Retrieve Checks
   * 
   * @param applicantId  (required)
   * @return ApiResponse&lt;ChecksList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of checks </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChecksList> listChecksWithHttpInfo(UUID applicantId) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling listChecks");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "applicant_id", applicantId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<ChecksList> localVarReturnType = new GenericType<ChecksList>() {};
    return apiClient.invokeAPI("DefaultApi.listChecks", "/checks", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List documents
   * All documents belonging to an applicant can be listed from this endpoint
   * @param applicantId  (required)
   * @return DocumentsList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of Documents </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DocumentsList listDocuments(UUID applicantId) throws ApiException {
    return listDocumentsWithHttpInfo(applicantId).getData();
  }

  /**
   * List documents
   * All documents belonging to an applicant can be listed from this endpoint
   * @param applicantId  (required)
   * @return ApiResponse&lt;DocumentsList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of Documents </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DocumentsList> listDocumentsWithHttpInfo(UUID applicantId) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling listDocuments");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "applicant_id", applicantId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<DocumentsList> localVarReturnType = new GenericType<DocumentsList>() {};
    return apiClient.invokeAPI("DefaultApi.listDocuments", "/documents", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List ID photos
   * 
   * @param applicantId The id of the applicant the ID photos belong to. (required)
   * @return IDPhotosList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of ID photos </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public IDPhotosList listIdPhotos(UUID applicantId) throws ApiException {
    return listIdPhotosWithHttpInfo(applicantId).getData();
  }

  /**
   * List ID photos
   * 
   * @param applicantId The id of the applicant the ID photos belong to. (required)
   * @return ApiResponse&lt;IDPhotosList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of ID photos </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IDPhotosList> listIdPhotosWithHttpInfo(UUID applicantId) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling listIdPhotos");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "applicant_id", applicantId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<IDPhotosList> localVarReturnType = new GenericType<IDPhotosList>() {};
    return apiClient.invokeAPI("DefaultApi.listIdPhotos", "/id_photos", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List live photos
   * 
   * @param applicantId The id of the applicant the live photos belong to. (required)
   * @return LivePhotosList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of live photos </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public LivePhotosList listLivePhotos(UUID applicantId) throws ApiException {
    return listLivePhotosWithHttpInfo(applicantId).getData();
  }

  /**
   * List live photos
   * 
   * @param applicantId The id of the applicant the live photos belong to. (required)
   * @return ApiResponse&lt;LivePhotosList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of live photos </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LivePhotosList> listLivePhotosWithHttpInfo(UUID applicantId) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling listLivePhotos");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "applicant_id", applicantId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<LivePhotosList> localVarReturnType = new GenericType<LivePhotosList>() {};
    return apiClient.invokeAPI("DefaultApi.listLivePhotos", "/live_photos", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List live videos
   * 
   * @param applicantId The id of the applicant the live videos belong to. (required)
   * @return LiveoVideosList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of live videos </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public LiveoVideosList listLiveVideos(UUID applicantId) throws ApiException {
    return listLiveVideosWithHttpInfo(applicantId).getData();
  }

  /**
   * List live videos
   * 
   * @param applicantId The id of the applicant the live videos belong to. (required)
   * @return ApiResponse&lt;LiveoVideosList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of live videos </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LiveoVideosList> listLiveVideosWithHttpInfo(UUID applicantId) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling listLiveVideos");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "applicant_id", applicantId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<LiveoVideosList> localVarReturnType = new GenericType<LiveoVideosList>() {};
    return apiClient.invokeAPI("DefaultApi.listLiveVideos", "/live_videos", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List motion captures
   * 
   * @param applicantId The id of the applicant the motion captures belong to. (required)
   * @return MotionCapturesList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of motion captures </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public MotionCapturesList listMotionCaptures(UUID applicantId) throws ApiException {
    return listMotionCapturesWithHttpInfo(applicantId).getData();
  }

  /**
   * List motion captures
   * 
   * @param applicantId The id of the applicant the motion captures belong to. (required)
   * @return ApiResponse&lt;MotionCapturesList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of motion captures </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MotionCapturesList> listMotionCapturesWithHttpInfo(UUID applicantId) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling listMotionCaptures");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "applicant_id", applicantId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<MotionCapturesList> localVarReturnType = new GenericType<MotionCapturesList>() {};
    return apiClient.invokeAPI("DefaultApi.listMotionCaptures", "/motion_captures", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Returns all repeat attempts for a given Document report.
   * 
   * @param reportId  (required)
   * @return RepeatAttemptsList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Repeat attempts object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RepeatAttemptsList listRepeatAttempts(UUID reportId) throws ApiException {
    return listRepeatAttemptsWithHttpInfo(reportId).getData();
  }

  /**
   * Returns all repeat attempts for a given Document report.
   * 
   * @param reportId  (required)
   * @return ApiResponse&lt;RepeatAttemptsList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Repeat attempts object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RepeatAttemptsList> listRepeatAttemptsWithHttpInfo(UUID reportId) throws ApiException {
    // Check required parameters
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling listRepeatAttempts");
    }

    // Path parameters
    String localVarPath = "/repeat_attempts/{report_id}"
            .replaceAll("\\{report_id}", apiClient.escapeString(reportId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<RepeatAttemptsList> localVarReturnType = new GenericType<RepeatAttemptsList>() {};
    return apiClient.invokeAPI("DefaultApi.listRepeatAttempts", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * All the reports belonging to a particular check can be listed from this endpoint.
   * 
   * @param checkId  (required)
   * @return ReportsList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of Reports </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ReportsList listReports(UUID checkId) throws ApiException {
    return listReportsWithHttpInfo(checkId).getData();
  }

  /**
   * All the reports belonging to a particular check can be listed from this endpoint.
   * 
   * @param checkId  (required)
   * @return ApiResponse&lt;ReportsList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of Reports </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReportsList> listReportsWithHttpInfo(UUID checkId) throws ApiException {
    // Check required parameters
    if (checkId == null) {
      throw new ApiException(400, "Missing the required parameter 'checkId' when calling listReports");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "check_id", checkId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<ReportsList> localVarReturnType = new GenericType<ReportsList>() {};
    return apiClient.invokeAPI("DefaultApi.listReports", "/reports", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * The tasks of a Workflow can be retrieved by calling this endpoint with the unique identifier of the Workflow Run.
   * 
   * @param workflowRunId The unique identifier of the Workflow Run to which the Tasks belong. (required)
   * @return List&lt;Task&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of subset Task objects that were already started or completed, ordered by the created_at field, in ascending order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public List<Task> listTasks(UUID workflowRunId) throws ApiException {
    return listTasksWithHttpInfo(workflowRunId).getData();
  }

  /**
   * The tasks of a Workflow can be retrieved by calling this endpoint with the unique identifier of the Workflow Run.
   * 
   * @param workflowRunId The unique identifier of the Workflow Run to which the Tasks belong. (required)
   * @return ApiResponse&lt;List&lt;Task&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of subset Task objects that were already started or completed, ordered by the created_at field, in ascending order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Task>> listTasksWithHttpInfo(UUID workflowRunId) throws ApiException {
    // Check required parameters
    if (workflowRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunId' when calling listTasks");
    }

    // Path parameters
    String localVarPath = "/workflow_runs/{workflow_run_id}/tasks"
            .replaceAll("\\{workflow_run_id}", apiClient.escapeString(workflowRunId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<List<Task>> localVarReturnType = new GenericType<List<Task>>() {};
    return apiClient.invokeAPI("DefaultApi.listTasks", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List match IDs on this monitor, as well as their enabled/disabled status
   * 
   * @param monitorId  (required)
   * @return List&lt;WatchlistMonitorMatch&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of watchlist monitors </td><td>  -  </td></tr>
     </table>
   */
  public List<WatchlistMonitorMatch> listWatchlistMonitorMatches(UUID monitorId) throws ApiException {
    return listWatchlistMonitorMatchesWithHttpInfo(monitorId).getData();
  }

  /**
   * List match IDs on this monitor, as well as their enabled/disabled status
   * 
   * @param monitorId  (required)
   * @return ApiResponse&lt;List&lt;WatchlistMonitorMatch&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of watchlist monitors </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WatchlistMonitorMatch>> listWatchlistMonitorMatchesWithHttpInfo(UUID monitorId) throws ApiException {
    // Check required parameters
    if (monitorId == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorId' when calling listWatchlistMonitorMatches");
    }

    // Path parameters
    String localVarPath = "/watchlist_monitors/{monitor_id}/matches"
            .replaceAll("\\{monitor_id}", apiClient.escapeString(monitorId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<List<WatchlistMonitorMatch>> localVarReturnType = new GenericType<List<WatchlistMonitorMatch>>() {};
    return apiClient.invokeAPI("DefaultApi.listWatchlistMonitorMatches", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all available monitors for an applicant
   * 
   * @param applicantId The id of the applicant the watchlist monitors belong to. If omitted, all monitors for the account will be listed. (required)
   * @param includeDeleted Whether to also include deleted (inactive) monitors. (optional, default to false)
   * @return List&lt;WatchlistMonitor&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of watchlist monitors </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public List<WatchlistMonitor> listWatchlistMonitors(UUID applicantId, Boolean includeDeleted) throws ApiException {
    return listWatchlistMonitorsWithHttpInfo(applicantId, includeDeleted).getData();
  }

  /**
   * List all available monitors for an applicant
   * 
   * @param applicantId The id of the applicant the watchlist monitors belong to. If omitted, all monitors for the account will be listed. (required)
   * @param includeDeleted Whether to also include deleted (inactive) monitors. (optional, default to false)
   * @return ApiResponse&lt;List&lt;WatchlistMonitor&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of watchlist monitors </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WatchlistMonitor>> listWatchlistMonitorsWithHttpInfo(UUID applicantId, Boolean includeDeleted) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling listWatchlistMonitors");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "applicant_id", applicantId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_deleted", includeDeleted));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<List<WatchlistMonitor>> localVarReturnType = new GenericType<List<WatchlistMonitor>>() {};
    return apiClient.invokeAPI("DefaultApi.listWatchlistMonitors", "/watchlist_monitors", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List webhooks
   * 
   * @return WebhooksList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of webhooks </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WebhooksList listWebhooks() throws ApiException {
    return listWebhooksWithHttpInfo().getData();
  }

  /**
   * List webhooks
   * 
   * @return ApiResponse&lt;WebhooksList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of webhooks </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WebhooksList> listWebhooksWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<WebhooksList> localVarReturnType = new GenericType<WebhooksList>() {};
    return apiClient.invokeAPI("DefaultApi.listWebhooks", "/webhooks", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List Workflow Runs.
   * 
   * @param page The number of the page to be retrieved. If not specified, defaults to 1. (optional, default to 1)
   * @param status A list of comma separated status values to filter the results. Possible values are &#39;processing&#39;, &#39;awaiting_input&#39;, &#39;approved&#39;, &#39;declined&#39;, &#39;review&#39;, &#39;abandoned&#39; and &#39;error&#39;. (optional)
   * @param createdAtGt A ISO-8601 date to filter results with a created date greater than (after) the one provided. (optional)
   * @param createdAtLt A ISO-8601 date to filter results with a created date less than (before) the one provided. (optional)
   * @param sort A string with the value &#39;desc&#39; or &#39;asc&#39; that allows to sort the returned list by the completed datetime either descending or ascending, respectively. If not specified, defaults to &#39;desc&#39;. (optional, default to desc)
   * @return List&lt;WorkflowRun&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of Workflow Run objects matching the query parameters. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkflowRun> listWorkflowRuns(Integer page, String status, OffsetDateTime createdAtGt, OffsetDateTime createdAtLt, String sort) throws ApiException {
    return listWorkflowRunsWithHttpInfo(page, status, createdAtGt, createdAtLt, sort).getData();
  }

  /**
   * List Workflow Runs.
   * 
   * @param page The number of the page to be retrieved. If not specified, defaults to 1. (optional, default to 1)
   * @param status A list of comma separated status values to filter the results. Possible values are &#39;processing&#39;, &#39;awaiting_input&#39;, &#39;approved&#39;, &#39;declined&#39;, &#39;review&#39;, &#39;abandoned&#39; and &#39;error&#39;. (optional)
   * @param createdAtGt A ISO-8601 date to filter results with a created date greater than (after) the one provided. (optional)
   * @param createdAtLt A ISO-8601 date to filter results with a created date less than (before) the one provided. (optional)
   * @param sort A string with the value &#39;desc&#39; or &#39;asc&#39; that allows to sort the returned list by the completed datetime either descending or ascending, respectively. If not specified, defaults to &#39;desc&#39;. (optional, default to desc)
   * @return ApiResponse&lt;List&lt;WorkflowRun&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of Workflow Run objects matching the query parameters. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkflowRun>> listWorkflowRunsWithHttpInfo(Integer page, String status, OffsetDateTime createdAtGt, OffsetDateTime createdAtLt, String sort) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "page", page)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at_gt", createdAtGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at_lt", createdAtLt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<List<WorkflowRun>> localVarReturnType = new GenericType<List<WorkflowRun>>() {};
    return apiClient.invokeAPI("DefaultApi.listWorkflowRuns", "/workflow_runs", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Run a health check on the Onfido API
   * 
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Regional base URL is operational </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public String ping() throws ApiException {
    return pingWithHttpInfo().getData();
  }

  /**
   * Run a health check on the Onfido API
   * 
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Regional base URL is operational </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> pingWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("text/plain", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("DefaultApi.ping", "/ping", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Feedback on checks and reports (ALPHA)
   * 
   * @param resultsFeedback  (required)
   * @return ResultsFeedback
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Created feedback </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ResultsFeedback postResultsFeedback(ResultsFeedback resultsFeedback) throws ApiException {
    return postResultsFeedbackWithHttpInfo(resultsFeedback).getData();
  }

  /**
   * Create Feedback on checks and reports (ALPHA)
   * 
   * @param resultsFeedback  (required)
   * @return ApiResponse&lt;ResultsFeedback&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Created feedback </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultsFeedback> postResultsFeedbackWithHttpInfo(ResultsFeedback resultsFeedback) throws ApiException {
    // Check required parameters
    if (resultsFeedback == null) {
      throw new ApiException(400, "Missing the required parameter 'resultsFeedback' when calling postResultsFeedback");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<ResultsFeedback> localVarReturnType = new GenericType<ResultsFeedback>() {};
    return apiClient.invokeAPI("DefaultApi.postResultsFeedback", "/results_feedback", "POST", new ArrayList<>(), resultsFeedback,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Resends webhooks
   * 
   * @param webhookResend  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Webhooks are resent for the respective checks </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Request was received but it could not be processed </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void resendWebhooks(WebhookResend webhookResend) throws ApiException {
    resendWebhooksWithHttpInfo(webhookResend);
  }

  /**
   * Resends webhooks
   * 
   * @param webhookResend  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Webhooks are resent for the respective checks </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Request was received but it could not be processed </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> resendWebhooksWithHttpInfo(WebhookResend webhookResend) throws ApiException {
    // Check required parameters
    if (webhookResend == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookResend' when calling resendWebhooks");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    return apiClient.invokeAPI("DefaultApi.resendWebhooks", "/webhooks/resend", "POST", new ArrayList<>(), webhookResend,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Restore Applicant
   * 
   * @param applicantId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void restoreApplicant(UUID applicantId) throws ApiException {
    restoreApplicantWithHttpInfo(applicantId);
  }

  /**
   * Restore Applicant
   * 
   * @param applicantId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> restoreApplicantWithHttpInfo(UUID applicantId) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling restoreApplicant");
    }

    // Path parameters
    String localVarPath = "/applicants/{applicant_id}/restore"
            .replaceAll("\\{applicant_id}", apiClient.escapeString(applicantId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    return apiClient.invokeAPI("DefaultApi.restoreApplicant", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Resume a Check
   * 
   * @param checkId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void resumeCheck(UUID checkId) throws ApiException {
    resumeCheckWithHttpInfo(checkId);
  }

  /**
   * Resume a Check
   * 
   * @param checkId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> resumeCheckWithHttpInfo(UUID checkId) throws ApiException {
    // Check required parameters
    if (checkId == null) {
      throw new ApiException(400, "Missing the required parameter 'checkId' when calling resumeCheck");
    }

    // Path parameters
    String localVarPath = "/checks/{check_id}/resume"
            .replaceAll("\\{check_id}", apiClient.escapeString(checkId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    return apiClient.invokeAPI("DefaultApi.resumeCheck", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * This endpoint is for resuming individual paused reports.
   * 
   * @param reportId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void resumeReport(UUID reportId) throws ApiException {
    resumeReportWithHttpInfo(reportId);
  }

  /**
   * This endpoint is for resuming individual paused reports.
   * 
   * @param reportId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> resumeReportWithHttpInfo(UUID reportId) throws ApiException {
    // Check required parameters
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling resumeReport");
    }

    // Path parameters
    String localVarPath = "/reports/{report_id}/resume"
            .replaceAll("\\{report_id}", apiClient.escapeString(reportId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Token"};
    return apiClient.invokeAPI("DefaultApi.resumeReport", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update Applicant
   * Allows updating applicant&#39;s information before any checks is created. - Partial updates - Addresses and ID numbers present will replace existing ones - Same applicant validations to create applicant 
   * @param applicantId  (required)
   * @param applicantUpdater  (required)
   * @return Applicant
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Applicant Object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Applicant updateApplicant(UUID applicantId, ApplicantUpdater applicantUpdater) throws ApiException {
    return updateApplicantWithHttpInfo(applicantId, applicantUpdater).getData();
  }

  /**
   * Update Applicant
   * Allows updating applicant&#39;s information before any checks is created. - Partial updates - Addresses and ID numbers present will replace existing ones - Same applicant validations to create applicant 
   * @param applicantId  (required)
   * @param applicantUpdater  (required)
   * @return ApiResponse&lt;Applicant&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Applicant Object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Applicant> updateApplicantWithHttpInfo(UUID applicantId, ApplicantUpdater applicantUpdater) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling updateApplicant");
    }
    if (applicantUpdater == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantUpdater' when calling updateApplicant");
    }

    // Path parameters
    String localVarPath = "/applicants/{applicant_id}"
            .replaceAll("\\{applicant_id}", apiClient.escapeString(applicantId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Applicant> localVarReturnType = new GenericType<Applicant>() {};
    return apiClient.invokeAPI("DefaultApi.updateApplicant", localVarPath, "PUT", new ArrayList<>(), applicantUpdater,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update the status of the given matches.
   * 
   * @param monitorId  (required)
   * @param updateMonitorMatchRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void updateMonitorMatch(UUID monitorId, UpdateMonitorMatchRequest updateMonitorMatchRequest) throws ApiException {
    updateMonitorMatchWithHttpInfo(monitorId, updateMonitorMatchRequest);
  }

  /**
   * Update the status of the given matches.
   * 
   * @param monitorId  (required)
   * @param updateMonitorMatchRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateMonitorMatchWithHttpInfo(UUID monitorId, UpdateMonitorMatchRequest updateMonitorMatchRequest) throws ApiException {
    // Check required parameters
    if (monitorId == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorId' when calling updateMonitorMatch");
    }
    if (updateMonitorMatchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateMonitorMatchRequest' when calling updateMonitorMatch");
    }

    // Path parameters
    String localVarPath = "/watchlist_monitors/{monitor_id}/matches"
            .replaceAll("\\{monitor_id}", apiClient.escapeString(monitorId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    return apiClient.invokeAPI("DefaultApi.updateMonitorMatch", localVarPath, "PATCH", new ArrayList<>(), updateMonitorMatchRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Edit a webhook
   * 
   * @param webhookId  (required)
   * @param webhookUpdater  (required)
   * @return Webhook
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Webhook Object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Webhook updateWebhook(UUID webhookId, WebhookUpdater webhookUpdater) throws ApiException {
    return updateWebhookWithHttpInfo(webhookId, webhookUpdater).getData();
  }

  /**
   * Edit a webhook
   * 
   * @param webhookId  (required)
   * @param webhookUpdater  (required)
   * @return ApiResponse&lt;Webhook&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Webhook Object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Webhook> updateWebhookWithHttpInfo(UUID webhookId, WebhookUpdater webhookUpdater) throws ApiException {
    // Check required parameters
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling updateWebhook");
    }
    if (webhookUpdater == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookUpdater' when calling updateWebhook");
    }

    // Path parameters
    String localVarPath = "/webhooks/{webhook_id}"
            .replaceAll("\\{webhook_id}", apiClient.escapeString(webhookId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Webhook> localVarReturnType = new GenericType<Webhook>() {};
    return apiClient.invokeAPI("DefaultApi.updateWebhook", localVarPath, "PUT", new ArrayList<>(), webhookUpdater,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Upload a document
   * Documents are uploaded using this endpoint. Along with the file upload the relevant document type must be specified. Documents must be uploaded as a multipart form. The valid file types are: jpg, png and pdf. The file size must be between 2KB and 3MB. 
   * @param type The type of document (required)
   * @param applicantId The ID of the applicant whose document is being uploaded. (required)
   * @param _file The file to be uploaded. (required)
   * @param fileType The file type of the uploaded file (optional)
   * @param side The side of the document, if applicable. The possible values are front and back (optional)
   * @param issuingCountry The issuing country of the document, a 3-letter ISO code. (optional)
   * @param validateImageQuality Defaults to false. When true the submitted image will undergo an image quality validation which may take up to 5 seconds. (optional)
   * @param location  (optional)
   * @return Document
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A document </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Document uploadDocument(String type, UUID applicantId, File _file, String fileType, String side, CountryCodes issuingCountry, Boolean validateImageQuality, LocationBuilder location) throws ApiException {
    return uploadDocumentWithHttpInfo(type, applicantId, _file, fileType, side, issuingCountry, validateImageQuality, location).getData();
  }

  /**
   * Upload a document
   * Documents are uploaded using this endpoint. Along with the file upload the relevant document type must be specified. Documents must be uploaded as a multipart form. The valid file types are: jpg, png and pdf. The file size must be between 2KB and 3MB. 
   * @param type The type of document (required)
   * @param applicantId The ID of the applicant whose document is being uploaded. (required)
   * @param _file The file to be uploaded. (required)
   * @param fileType The file type of the uploaded file (optional)
   * @param side The side of the document, if applicable. The possible values are front and back (optional)
   * @param issuingCountry The issuing country of the document, a 3-letter ISO code. (optional)
   * @param validateImageQuality Defaults to false. When true the submitted image will undergo an image quality validation which may take up to 5 seconds. (optional)
   * @param location  (optional)
   * @return ApiResponse&lt;Document&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A document </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Document> uploadDocumentWithHttpInfo(String type, UUID applicantId, File _file, String fileType, String side, CountryCodes issuingCountry, Boolean validateImageQuality, LocationBuilder location) throws ApiException {
    // Check required parameters
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling uploadDocument");
    }
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling uploadDocument");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling uploadDocument");
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (fileType != null) {
      localVarFormParams.put("file_type", fileType);
    }
    localVarFormParams.put("type", type);
    if (side != null) {
      localVarFormParams.put("side", side);
    }
    if (issuingCountry != null) {
      localVarFormParams.put("issuing_country", issuingCountry);
    }
    localVarFormParams.put("applicant_id", applicantId);
    localVarFormParams.put("file", _file);
    if (validateImageQuality != null) {
      localVarFormParams.put("validate_image_quality", validateImageQuality);
    }
    if (location != null) {
      localVarFormParams.put("location", location);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<Document> localVarReturnType = new GenericType<Document>() {};
    return apiClient.invokeAPI("DefaultApi.uploadDocument", "/documents", "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Upload ID photo
   * You can upload ID photos to this endpoint. Like document upload, files must be uploaded as a multipart form. Valid file types are jpg, png and pdf. The file size must be between 32KB and 10MB. 
   * @param applicantId The ID of the applicant whose ID photo is being uploaded. (required)
   * @param _file The file to be uploaded. (required)
   * @return IdPhoto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The ID photo </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public IdPhoto uploadIdPhoto(UUID applicantId, File _file) throws ApiException {
    return uploadIdPhotoWithHttpInfo(applicantId, _file).getData();
  }

  /**
   * Upload ID photo
   * You can upload ID photos to this endpoint. Like document upload, files must be uploaded as a multipart form. Valid file types are jpg, png and pdf. The file size must be between 32KB and 10MB. 
   * @param applicantId The ID of the applicant whose ID photo is being uploaded. (required)
   * @param _file The file to be uploaded. (required)
   * @return ApiResponse&lt;IdPhoto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The ID photo </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdPhoto> uploadIdPhotoWithHttpInfo(UUID applicantId, File _file) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling uploadIdPhoto");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling uploadIdPhoto");
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams.put("applicant_id", applicantId);
    localVarFormParams.put("file", _file);

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<IdPhoto> localVarReturnType = new GenericType<IdPhoto>() {};
    return apiClient.invokeAPI("DefaultApi.uploadIdPhoto", "/id_photos", "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Upload live photo
   * You can upload live photos to this endpoint. Like document upload, files must be uploaded as a multipart form. Valid file types are jpg, png and pdf. The file size must be between 32KB and 10MB. Live photos are validated at the point of upload to check that they contain exactly one face. This validation can be disabled by setting the advanced_validation argument to false. 
   * @param applicantId The ID of the applicant whose live photo is being uploaded. (required)
   * @param _file The file to be uploaded. (required)
   * @param advancedValidation Validates that the live photo contains exactly one face. (optional, default to true)
   * @return LivePhoto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The Live Photo </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public LivePhoto uploadLivePhoto(UUID applicantId, File _file, Boolean advancedValidation) throws ApiException {
    return uploadLivePhotoWithHttpInfo(applicantId, _file, advancedValidation).getData();
  }

  /**
   * Upload live photo
   * You can upload live photos to this endpoint. Like document upload, files must be uploaded as a multipart form. Valid file types are jpg, png and pdf. The file size must be between 32KB and 10MB. Live photos are validated at the point of upload to check that they contain exactly one face. This validation can be disabled by setting the advanced_validation argument to false. 
   * @param applicantId The ID of the applicant whose live photo is being uploaded. (required)
   * @param _file The file to be uploaded. (required)
   * @param advancedValidation Validates that the live photo contains exactly one face. (optional, default to true)
   * @return ApiResponse&lt;LivePhoto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The Live Photo </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LivePhoto> uploadLivePhotoWithHttpInfo(UUID applicantId, File _file, Boolean advancedValidation) throws ApiException {
    // Check required parameters
    if (applicantId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicantId' when calling uploadLivePhoto");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling uploadLivePhoto");
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams.put("applicant_id", applicantId);
    localVarFormParams.put("file", _file);
    if (advancedValidation != null) {
      localVarFormParams.put("advanced_validation", advancedValidation);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"Token"};
    GenericType<LivePhoto> localVarReturnType = new GenericType<LivePhoto>() {};
    return apiClient.invokeAPI("DefaultApi.uploadLivePhoto", "/live_photos", "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
