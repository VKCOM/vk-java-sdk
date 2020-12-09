package com.vk.api.sdk.exceptions;

public class ApiUserDeactivatedException extends ApiException {
    public ApiUserDeactivatedException(String message) {
        super(3610, "User is deactivated", message);
    }
}
