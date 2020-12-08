package com.vk.api.sdk.exceptions;

public class ApiUserBannedException extends ApiException {
    public ApiUserBannedException(String message) {
        super(37, "User was banned", message);
    }
}
