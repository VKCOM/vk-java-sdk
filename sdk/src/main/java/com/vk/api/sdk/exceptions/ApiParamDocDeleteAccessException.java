package com.vk.api.sdk.exceptions;

public class ApiParamDocDeleteAccessException extends ApiException {
    public ApiParamDocDeleteAccessException(String message) {
        super(1151, "Access to document deleting is denied", message);
    }
}
