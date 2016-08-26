package com.vk.api.sdk.exceptions;

public class ApiParamUserIdException extends ApiException {
    public ApiParamUserIdException(String message) {
        super(113, "Invalid user id", message);
    }
}
