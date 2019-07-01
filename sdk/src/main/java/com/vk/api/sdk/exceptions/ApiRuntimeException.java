package com.vk.api.sdk.exceptions;

public class ApiRuntimeException extends ApiException {
    public ApiRuntimeException(String message) {
        super(13, "Runtime error occurred during code invocation", message);
    }
}
