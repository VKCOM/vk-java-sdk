package com.vk.api.sdk.exceptions;

public class ApiAuthValidationException extends ApiException {
    public ApiAuthValidationException(String message) {
        super(17, "Validation required", message);
    }
}
