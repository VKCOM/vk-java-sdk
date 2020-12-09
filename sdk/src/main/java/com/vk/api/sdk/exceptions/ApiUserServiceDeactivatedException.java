package com.vk.api.sdk.exceptions;

public class ApiUserServiceDeactivatedException extends ApiException {
    public ApiUserServiceDeactivatedException(String message) {
        super(3611, "Service is deactivated for user", message);
    }
}
