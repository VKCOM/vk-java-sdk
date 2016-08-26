package com.vk.api.sdk.exceptions;

public class ApiFloodException extends ApiException {
    public ApiFloodException(String message) {
        super(9, "Flood control", message);
    }
}
