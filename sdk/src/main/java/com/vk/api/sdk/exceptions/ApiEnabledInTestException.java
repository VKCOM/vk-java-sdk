package com.vk.api.sdk.exceptions;

public class ApiEnabledInTestException extends ApiException {
    public ApiEnabledInTestException(String message) {
        super(11, "In test mode application should be disabled or user should be authorized", message);
    }
}
