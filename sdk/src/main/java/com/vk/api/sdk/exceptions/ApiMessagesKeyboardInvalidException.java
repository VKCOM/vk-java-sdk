package com.vk.api.sdk.exceptions;

public class ApiMessagesKeyboardInvalidException extends ApiException {
    public ApiMessagesKeyboardInvalidException(String message) {
        super(911, "Keyboard format is invalid", message);
    }
}
