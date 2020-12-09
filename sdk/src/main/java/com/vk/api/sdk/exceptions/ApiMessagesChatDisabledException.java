package com.vk.api.sdk.exceptions;

public class ApiMessagesChatDisabledException extends ApiException {
    public ApiMessagesChatDisabledException(String message) {
        super(945, "Chat was disabled", message);
    }
}
