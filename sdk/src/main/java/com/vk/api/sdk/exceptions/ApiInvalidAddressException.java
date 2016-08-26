package com.vk.api.sdk.exceptions;

public class ApiInvalidAddressException extends ApiException {
    public ApiInvalidAddressException(String message) {
        super(1260, "Invalid screen name", message);
    }
}
