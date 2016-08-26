package com.vk.api.sdk.exceptions;

public class ApiAuthParamCodeException extends ApiException {
    public ApiAuthParamCodeException(String message) {
        super(1110, "Incorrect code", message);
    }
}
