package com.vk.api.sdk.exceptions;

public class ApiVideoCommentsClosedException extends ApiException {
    public ApiVideoCommentsClosedException(String message) {
        super(801, "Comments for this video are closed", message);
    }
}
