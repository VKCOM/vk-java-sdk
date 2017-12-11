package com.vk.api.sdk.exceptions;

public class ApiMessagesLongMessageException extends ApiException {
    public ApiMessagesLongMessageException(String message) {
        super(914, "Too long message to be sent", message);
    }
}
