package com.vk.api.sdk.exceptions;

public class ApiUserDeletedException extends ApiException {
    public ApiUserDeletedException(String message) {
        super(18, "User was deleted or banned", message);
    }
}
