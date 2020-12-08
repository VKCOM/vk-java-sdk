package com.vk.api.sdk.exceptions;

public class ApiMarketShopAlreadyDisabledException extends ApiException {
    public ApiMarketShopAlreadyDisabledException(String message) {
        super(1432, "Market was already disabled in this group", message);
    }
}
