package com.vk.api.sdk.exceptions;

public class ApiMessagesIntentCantUseException extends ApiException {
    public ApiMessagesIntentCantUseException(String message) {
        super(943, "Cannot use this intent", message);
    }
}
