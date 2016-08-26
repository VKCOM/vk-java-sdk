package com.vk.api.sdk.exceptions;

public class ApiMessagesPrivacyException extends ApiException {
    public ApiMessagesPrivacyException(String message) {
        super(902, "Can't send messages to this user due to their privacy settings", message);
    }
}
