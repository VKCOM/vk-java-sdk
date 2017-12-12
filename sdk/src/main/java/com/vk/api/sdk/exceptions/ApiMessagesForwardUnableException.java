package com.vk.api.sdk.exceptions;

public class ApiMessagesForwardUnableException extends ApiException {
    public ApiMessagesForwardUnableException(String message) {
        super(921, "Unable to forward selected messages", message);
    }
}
