package com.vk.api.sdk.exceptions;

public class ApiParamDocIdException extends ApiException {
    public ApiParamDocIdException(String message) {
        super(1150, "Invalid document id", message);
    }
}
