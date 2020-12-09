package com.vk.api.sdk.exceptions;

public class ApiMarketShopNotEnabledException extends ApiException {
    public ApiMarketShopNotEnabledException(String message) {
        super(1409, "Shop not enabled", message);
    }
}
