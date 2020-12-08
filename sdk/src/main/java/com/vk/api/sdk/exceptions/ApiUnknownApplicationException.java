package com.vk.api.sdk.exceptions;

public class ApiUnknownApplicationException extends ApiException {
    public ApiUnknownApplicationException(String message) {
        super(38, "Unknown application", message);
    }
}
