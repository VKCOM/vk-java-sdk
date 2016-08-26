package com.vk.api.sdk.exceptions;

public class ApiNotFoundException extends ApiException {
    public ApiNotFoundException(String message) {
        super(104, "Not found", message);
    }
}
