package com.vk.api.sdk.exceptions;

public class ApiMessagesChatUserNotInChatException extends ApiException {
    public ApiMessagesChatUserNotInChatException(String message) {
        super(935, "User not found in chat", message);
    }
}
