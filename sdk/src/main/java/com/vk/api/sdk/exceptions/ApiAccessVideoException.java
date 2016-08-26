package com.vk.api.sdk.exceptions;

public class ApiAccessVideoException extends ApiException {
    public ApiAccessVideoException(String message) {
        super(204, "Access denied", message);
    }
}
