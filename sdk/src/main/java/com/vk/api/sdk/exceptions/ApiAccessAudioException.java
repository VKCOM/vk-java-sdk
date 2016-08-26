package com.vk.api.sdk.exceptions;

public class ApiAccessAudioException extends ApiException {
    public ApiAccessAudioException(String message) {
        super(201, "Access denied", message);
    }
}
