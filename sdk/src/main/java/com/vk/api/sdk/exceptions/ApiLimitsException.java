package com.vk.api.sdk.exceptions;

public class ApiLimitsException extends ApiException {
    public ApiLimitsException(String message) {
        super(103, "Out of limits", message);
    }
}
