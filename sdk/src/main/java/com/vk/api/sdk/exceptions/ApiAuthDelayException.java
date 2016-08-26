package com.vk.api.sdk.exceptions;

public class ApiAuthDelayException extends ApiException {
    public ApiAuthDelayException(String message) {
        super(1112, "Processing.. Try later", message);
    }
}
