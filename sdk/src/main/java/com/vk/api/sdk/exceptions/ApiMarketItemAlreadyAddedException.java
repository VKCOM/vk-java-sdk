package com.vk.api.sdk.exceptions;

public class ApiMarketItemAlreadyAddedException extends ApiException {
    public ApiMarketItemAlreadyAddedException(String message) {
        super(1404, "Item already added to album", message);
    }
}
