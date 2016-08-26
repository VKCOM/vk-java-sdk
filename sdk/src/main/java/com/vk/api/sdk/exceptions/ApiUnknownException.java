package com.vk.api.sdk.exceptions;

public class ApiUnknownException extends ApiException {
    public ApiUnknownException(String message) {
        super(1, "Unknown error occurred", message);
    }
}
