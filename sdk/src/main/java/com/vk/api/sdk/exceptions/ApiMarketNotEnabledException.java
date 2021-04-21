package com.vk.api.sdk.exceptions;

public class ApiMarketNotEnabledException extends ApiException {
    public ApiMarketNotEnabledException(String message) {
        super(1438, "Market not enabled", message);
    }
}
