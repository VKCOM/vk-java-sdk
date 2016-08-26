package com.vk.api.sdk.exceptions;

public class ApiUploadException extends ApiException {
    public ApiUploadException(String message) {
        super(22, "Upload error", message);
    }
}
