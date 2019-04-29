package com.vk.api.sdk.exceptions;

public class ApiMessagesTooLongForwardsException extends ApiException {
    public ApiMessagesTooLongForwardsException(String message) {
        super(913, "Too many forwarded messages", message);
    }
}
