package com.vk.api.sdk.exceptions;

public class ApiPhoneAlreadyUsedException extends ApiException {
    public ApiPhoneAlreadyUsedException(String message) {
        super(1004, "This phone number is used by another user", message);
    }
}
