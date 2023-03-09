package com.onfido;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.WorkflowRun;
import java.util.List;
import okhttp3.OkHttpClient;

/**
 * Manager class for the WorkflowRun resource type. Contains resource-specific methods for interacting
 * with the API.
 */
public class WorkflowRunManager extends ResourceManager {
  private ApiJson<WorkflowRun> workflowRunParser = new ApiJson<>(WorkflowRun.class);
  private ApiJson<WorkflowRun.Request> requestFormatter = new ApiJson<>(WorkflowRun.Request.class);

  protected WorkflowRunManager(Config config, OkHttpClient client) {
    super("workflow_runs/", config, client);
  }

  /**
   * Create a workflow run.
   *
   * @param request the request body
   * @return the WorkflowRun
   * @throws OnfidoException the onfido exception
   */
  public WorkflowRun create(WorkflowRun.Request request) throws OnfidoException {
    return workflowRunParser.parse(post("", requestFormatter.toJson(request)));
  }

  /**
   * Retrieves a single WorkflowRun.
   *
   * @param workflowRunId the workflow run id
   * @return the WorkflowRun
   * @throws OnfidoException the onfido exception
   */
  public WorkflowRun find(String workflowRunId) throws OnfidoException {
    return workflowRunParser.parse(get(workflowRunId));
  }

   /**
   * Lists all workflow runs you’ve created, sorted by completion date in descending order.
   *
   * @param page the page
   * @param status list of comma separated status values to filter the results
   * @param createdAtGt a ISO-8601 date to filter results with a created date greater than (after) the one provided
   * @param createdAtLt a ISO-8601 date to filter results with a created date less than (before) the one provided
   * @param sort a string with the value desc or asc that allows to sort the returned list by the completed datetime
   * @return the list of WorkflowRuns
   * @throws OnfidoException the onfido exception
   */
  public List<WorkflowRun> list(int page, String status, String createdAtGt, String createdAtLt, 
    String sort)
      throws OnfidoException {
    return workflowRunParser.parseWrappedList(
        get("?page=" + page +
            "&status=" + status +
            "&created_at_gt=" + createdAtGt +
            "&created_at_lt=" + createdAtLt +
            "&sort=" + sort),
        "applicants");
  }
}
