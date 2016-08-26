package com.vk.api.sdk.exceptions;

public class ApiAuthParamPasswordException extends ApiException {
    public ApiAuthParamPasswordException(String message) {
        super(1111, "Invalid password", message);
    }
}
