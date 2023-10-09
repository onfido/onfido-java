package com.onfido;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Task;
import com.onfido.models.TaskBase;
import com.onfido.models.TaskData;
import okhttp3.OkHttpClient;

import java.util.List;

public class TaskManager extends ResourceManager {
    private ApiJson<TaskBase> taskBaseParser = new ApiJson<>(TaskBase.class);
    private ApiJson<Task> taskParser = new ApiJson<>(Task.class);
    private ApiJson<TaskData.Request> requestFormatter = new ApiJson<>(TaskData.Request.class);

    protected TaskManager(Config config, OkHttpClient client) {
        super("workflow_runs/", config, client);
    }

    public List<TaskBase> list(String workflowRunId) throws OnfidoException {
        return taskBaseParser.parseList(get(workflowRunId + "/tasks"));
    }

    public Task find(String workflowRunId, String taskId) throws OnfidoException {
        return taskParser.parse(get(workflowRunId + "/tasks/" + taskId));
    }

    public void complete(String workflowRunId, String taskId, TaskData.Request request) throws OnfidoException {
        post(workflowRunId + "/tasks/" + taskId + "/complete", requestFormatter.toJson(request));
    }
}
