package com.vk.api.sdk.exceptions;

public class LongPollServerKeyExpiredException extends ApiException {
    public LongPollServerKeyExpiredException(String message) {
        super(2, "LongPoll Server key expired", message);
    }
}
