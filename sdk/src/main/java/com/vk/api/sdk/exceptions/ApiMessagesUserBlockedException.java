package com.vk.api.sdk.exceptions;

public class ApiMessagesUserBlockedException extends ApiException {
    public ApiMessagesUserBlockedException(String message) {
        super(900, "Can't send messages for users from blacklist", message);
    }
}
