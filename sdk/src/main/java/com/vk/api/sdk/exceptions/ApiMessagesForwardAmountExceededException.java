package com.vk.api.sdk.exceptions;

public class ApiMessagesForwardAmountExceededException extends ApiException {
    public ApiMessagesForwardAmountExceededException(String message) {
        super(913, "Too many forward messages", message);
    }
}
