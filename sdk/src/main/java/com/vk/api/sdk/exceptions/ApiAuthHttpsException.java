package com.vk.api.sdk.exceptions;

public class ApiAuthHttpsException extends ApiException {
    public ApiAuthHttpsException(String message) {
        super(16, "HTTP authorization failed", message);
    }
}
