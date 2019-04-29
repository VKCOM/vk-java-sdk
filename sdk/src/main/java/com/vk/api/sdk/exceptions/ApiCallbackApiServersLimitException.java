package com.vk.api.sdk.exceptions;

public class ApiCallbackApiServersLimitException extends ApiException {
    public ApiCallbackApiServersLimitException(String message) {
        super(2000, "Servers number limit is reached", message);
    }
}
