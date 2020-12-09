package com.vk.api.sdk.exceptions;

public class ApiPasswordValidationNeedException extends ApiException {
    public ApiPasswordValidationNeedException(String message) {
        super(3302, "Password validation needed", message);
    }
}
