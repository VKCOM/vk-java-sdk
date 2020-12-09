package com.vk.api.sdk.exceptions;

public class ApiMessagesIntentLimitOverflowException extends ApiException {
    public ApiMessagesIntentLimitOverflowException(String message) {
        super(944, "Limits overflow for this intent", message);
    }
}
