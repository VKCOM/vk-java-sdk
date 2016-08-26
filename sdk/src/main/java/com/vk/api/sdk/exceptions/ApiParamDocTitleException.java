package com.vk.api.sdk.exceptions;

public class ApiParamDocTitleException extends ApiException {
    public ApiParamDocTitleException(String message) {
        super(1152, "Invalid document title", message);
    }
}
