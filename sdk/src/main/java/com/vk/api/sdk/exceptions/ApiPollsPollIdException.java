package com.vk.api.sdk.exceptions;

public class ApiPollsPollIdException extends ApiException {
    public ApiPollsPollIdException(String message) {
        super(251, "Invalid poll id", message);
    }
}
