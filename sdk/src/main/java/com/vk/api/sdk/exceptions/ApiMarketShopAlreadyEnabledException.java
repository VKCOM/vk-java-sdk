package com.vk.api.sdk.exceptions;

public class ApiMarketShopAlreadyEnabledException extends ApiException {
    public ApiMarketShopAlreadyEnabledException(String message) {
        super(1431, "Market was already enabled in this group", message);
    }
}
