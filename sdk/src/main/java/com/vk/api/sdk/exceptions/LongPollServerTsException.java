package com.vk.api.sdk.exceptions;

import java.util.HashMap;
import java.util.Map;

public class LongPollServerTsException extends ApiExtendedException {
    public LongPollServerTsException(Integer statusCode, String message) {
        super(1, statusCode, new HashMap<>(), "Incorrect \'ts\' value", message);
    }

    public LongPollServerTsException(Integer statusCode, String message, Map<String, String> headers) {
        super(1, statusCode, headers, "Incorrect \'ts\' value", message);
    }
}
