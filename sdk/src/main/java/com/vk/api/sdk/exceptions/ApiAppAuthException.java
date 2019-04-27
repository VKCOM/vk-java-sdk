package com.vk.api.sdk.exceptions;

public class ApiAppAuthException extends ApiException {
    public ApiAppAuthException(String message) {
        super(28, "Application authorization failed", message);
    }
}
