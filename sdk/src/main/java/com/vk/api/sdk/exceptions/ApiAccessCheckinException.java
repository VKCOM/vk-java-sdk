package com.vk.api.sdk.exceptions;

public class ApiAccessCheckinException extends ApiException {
    public ApiAccessCheckinException(String message) {
        super(191, "Access to checkins denied", message);
    }
}
