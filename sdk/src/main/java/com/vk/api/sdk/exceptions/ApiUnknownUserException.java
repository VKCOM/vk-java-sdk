package com.vk.api.sdk.exceptions;

public class ApiUnknownUserException extends ApiException {
    public ApiUnknownUserException(String message) {
        super(39, "Unknown user", message);
    }
}
