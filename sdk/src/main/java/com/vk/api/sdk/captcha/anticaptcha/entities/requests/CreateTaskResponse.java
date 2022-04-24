package com.vk.api.sdk.captcha.anticaptcha.entities.requests;

import com.google.gson.Gson;

public class CreateTaskResponse {
    private Integer errorId;
    private Integer taskId;

    public Integer getErrorId() {
        return errorId;
    }

    public Integer getTaskId() {
        return taskId;
    }
}
