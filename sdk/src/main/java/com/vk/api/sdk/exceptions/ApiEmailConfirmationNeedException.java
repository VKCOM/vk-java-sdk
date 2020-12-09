package com.vk.api.sdk.exceptions;

public class ApiEmailConfirmationNeedException extends ApiException {
    public ApiEmailConfirmationNeedException(String message) {
        super(3304, "Email confirmation needed", message);
    }
}
