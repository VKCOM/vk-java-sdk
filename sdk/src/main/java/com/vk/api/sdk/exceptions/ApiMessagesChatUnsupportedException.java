package com.vk.api.sdk.exceptions;

public class ApiMessagesChatUnsupportedException extends ApiException {
    public ApiMessagesChatUnsupportedException(String message) {
        super(946, "Chat not supported", message);
    }
}
