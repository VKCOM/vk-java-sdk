package com.vk.api.sdk.exceptions;

public class ApiRecaptchaException extends ApiException {
    public ApiRecaptchaException(String message) {
        super(3300, "Recaptcha needed", message);
    }
}
