package com.vk.api.sdk.exceptions;

public class ApiServerException extends ApiException {
    public ApiServerException(String message) {
        super(10, "Internal server error", message);
    }
}
