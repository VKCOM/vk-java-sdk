package com.vk.api.sdk.streaming.exceptions;

import com.vk.api.sdk.streaming.objects.StreamingError;

/**
 * Streaming API exception
 */
public class StreamingApiException extends Exception {

    public StreamingApiException(StreamingError error) {
        super("Code " + error.getErrorCode() + ": " + error.getMessage());
    }
}
