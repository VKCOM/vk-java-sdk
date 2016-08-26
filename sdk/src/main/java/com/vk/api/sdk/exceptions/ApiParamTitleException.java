package com.vk.api.sdk.exceptions;

public class ApiParamTitleException extends ApiException {
    public ApiParamTitleException(String message) {
        super(119, "Invalid title", message);
    }
}
