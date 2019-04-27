package com.vk.api.sdk.exceptions;

public class ApiStoryIncorrectReplyPrivacyException extends ApiException {
    public ApiStoryIncorrectReplyPrivacyException(String message) {
        super(1602, "Incorrect reply privacy", message);
    }
}
