package com.vk.api.sdk.exceptions;

public class ApiParamGroupIdException extends ApiException {
    public ApiParamGroupIdException(String message) {
        super(125, "Invalid group id", message);
    }
}
