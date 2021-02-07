package com.vk.api.sdk.exceptions;

public class ApiClientUpdateNeededException extends ApiException {
    public ApiClientUpdateNeededException(String message) {
        super(35, "Client update needed", message);
    }
}
