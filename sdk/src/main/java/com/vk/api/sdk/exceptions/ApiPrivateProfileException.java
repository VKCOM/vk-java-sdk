package com.vk.api.sdk.exceptions;

public class ApiPrivateProfileException extends ApiException {
    public ApiPrivateProfileException(String message) {
        super(30, "This profile is private", message);
    }
}
