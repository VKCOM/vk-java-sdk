package com.vk.api.sdk.exceptions;

public class ApiMessagesTooLongMessageException extends ApiException {
    public ApiMessagesTooLongMessageException(String message) {
        super(914, "Message is too long", message);
    }
}
