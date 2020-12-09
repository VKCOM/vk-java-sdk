package com.vk.api.sdk.exceptions;

public class ApiPhoneValidationNeedException extends ApiException {
    public ApiPhoneValidationNeedException(String message) {
        super(3301, "Phone validation needed", message);
    }
}
