package com.vk.api.sdk.captcha.anticaptcha.entities.requests;

import com.vk.api.sdk.captcha.anticaptcha.entities.ImageToTextTaskRequestObject;

public class CreateTaskRequest {
    private String clientKey;
    private ImageToTextTaskRequestObject task;

    public CreateTaskRequest setClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    public CreateTaskRequest setTask(ImageToTextTaskRequestObject task) {
        this.task = task;
        return this;
    }
}
