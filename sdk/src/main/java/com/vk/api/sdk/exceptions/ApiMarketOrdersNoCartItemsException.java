package com.vk.api.sdk.exceptions;

public class ApiMarketOrdersNoCartItemsException extends ApiException {
    public ApiMarketOrdersNoCartItemsException(String message) {
        super(1427, "Cart is empty", message);
    }
}
