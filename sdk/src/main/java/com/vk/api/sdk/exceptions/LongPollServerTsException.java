package com.vk.api.sdk.exceptions;

public class LongPollServerTsException extends ApiException {
    public LongPollServerTsException(String message) {
        super(1, "Incorrect \'ts\' value", message);
    }
}
