package com.vk.api.sdk.exceptions;

public class ApiTimeoutException extends ApiException {
    public ApiTimeoutException(String message) {
        super(36, "Method execution was interrupted due to timeout", message);
    }
}
