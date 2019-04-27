package com.vk.api.sdk.exceptions;

public class ApiRateLimitException extends ApiException {
    public ApiRateLimitException(String message) {
        super(29, "Rate limit reached", message);
    }
}
