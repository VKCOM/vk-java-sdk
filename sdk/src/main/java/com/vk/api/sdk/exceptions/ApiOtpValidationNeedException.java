package com.vk.api.sdk.exceptions;

public class ApiOtpValidationNeedException extends ApiException {
    public ApiOtpValidationNeedException(String message) {
        super(3303, "Otp app validation needed", message);
    }
}
