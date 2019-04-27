package com.vk.api.sdk.exceptions;

public class ApiNeedConfirmationException extends ApiException {
    public ApiNeedConfirmationException(String message) {
        super(24, "Confirmation required", message);
    }
}
