package com.vk.api.sdk.exceptions;

public class ApiAccessException extends ApiException {
    public ApiAccessException(String message) {
        super(15, "Access denied", message);
    }
}
