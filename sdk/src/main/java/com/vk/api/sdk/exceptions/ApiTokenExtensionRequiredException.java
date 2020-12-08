package com.vk.api.sdk.exceptions;

public class ApiTokenExtensionRequiredException extends ApiException {
    public ApiTokenExtensionRequiredException(String message) {
        super(3609, "Token extension required", message);
    }
}
