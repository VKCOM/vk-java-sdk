package com.vk.api.sdk.exceptions;

public class ApiBlockedException extends ApiException {
    public ApiBlockedException(String message) {
        super(19, "Content blocked", message);
    }
}
