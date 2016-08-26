package com.vk.api.sdk.exceptions;

public class ApiAccessMarketException extends ApiException {
    public ApiAccessMarketException(String message) {
        super(205, "Access denied", message);
    }
}
