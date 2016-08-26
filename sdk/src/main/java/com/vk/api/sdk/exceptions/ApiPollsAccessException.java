package com.vk.api.sdk.exceptions;

public class ApiPollsAccessException extends ApiException {
    public ApiPollsAccessException(String message) {
        super(250, "Access to poll denied", message);
    }
}
