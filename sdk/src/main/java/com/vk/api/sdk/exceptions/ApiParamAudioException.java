package com.vk.api.sdk.exceptions;

public class ApiParamAudioException extends ApiException {
    public ApiParamAudioException(String message) {
        super(123, "Invalid audio", message);
    }
}
