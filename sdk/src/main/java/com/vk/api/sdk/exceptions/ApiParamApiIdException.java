package com.vk.api.sdk.exceptions;

public class ApiParamApiIdException extends ApiException {
    public ApiParamApiIdException(String message) {
        super(101, "Invalid application API ID", message);
    }
}
