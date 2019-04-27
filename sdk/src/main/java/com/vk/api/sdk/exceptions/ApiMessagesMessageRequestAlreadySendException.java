package com.vk.api.sdk.exceptions;

public class ApiMessagesMessageRequestAlreadySendException extends ApiException {
    public ApiMessagesMessageRequestAlreadySendException(String message) {
        super(939, "Message request already send", message);
    }
}
