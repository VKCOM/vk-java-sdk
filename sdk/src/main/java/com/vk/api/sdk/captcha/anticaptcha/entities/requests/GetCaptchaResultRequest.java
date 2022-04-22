package com.vk.api.sdk.captcha.anticaptcha.entities.requests;

public class GetCaptchaResultRequest {
    private String clientKey;
    private Integer taskId;

    public GetCaptchaResultRequest setClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    public GetCaptchaResultRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
}
