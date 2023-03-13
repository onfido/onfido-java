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
}
