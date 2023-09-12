package com.vk.api.sdk.exceptions;

import java.util.HashMap;
import java.util.Map;

public class LongPollServerKeyExpiredException extends ApiExtendedException {
    public LongPollServerKeyExpiredException(Integer statusCode, String message) {
        super(2, statusCode, new HashMap<>(), "Long poll server key expired", message);
    }

    public LongPollServerKeyExpiredException(Integer statusCode, String message, Map<String, String> headers) {
        super(1, statusCode, headers, "Long poll server key expired", message);
    }
}
