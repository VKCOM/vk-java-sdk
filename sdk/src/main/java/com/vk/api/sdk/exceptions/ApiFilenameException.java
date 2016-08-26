package com.vk.api.sdk.exceptions;

public class ApiFilenameException extends ApiException {
    public ApiFilenameException(String message) {
        super(301, "Invalid filename", message);
    }
}
