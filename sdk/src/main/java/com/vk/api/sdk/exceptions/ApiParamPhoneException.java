package com.vk.api.sdk.exceptions;

public class ApiParamPhoneException extends ApiException {
    public ApiParamPhoneException(String message) {
        super(1000, "Invalid phone number", message);
    }
}
