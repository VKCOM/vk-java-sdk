package com.vk.api.sdk.exceptions;

public class ApiAuthException extends ApiException {
    public ApiAuthException(String message) {
        super(5, "User authorization failed", message);
    }
}
