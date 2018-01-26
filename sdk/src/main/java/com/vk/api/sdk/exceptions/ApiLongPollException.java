package com.vk.api.sdk.exceptions;

public class ApiLongPollException extends ApiException {
    public ApiLongPollException(String message) {
        super(2100, "LongPoll error", message);
    }
}
