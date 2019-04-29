package com.vk.api.sdk.exceptions;

public class ApiMessagesContactNotFoundException extends ApiException {
    public ApiMessagesContactNotFoundException(String message) {
        super(936, "Contact not found", message);
    }
}
