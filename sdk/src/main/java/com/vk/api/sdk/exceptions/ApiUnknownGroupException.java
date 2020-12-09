package com.vk.api.sdk.exceptions;

public class ApiUnknownGroupException extends ApiException {
    public ApiUnknownGroupException(String message) {
        super(40, "Unknown group", message);
    }
}
