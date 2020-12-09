package com.vk.api.sdk.exceptions;

public class ApiMarketCantChangeVkpayStatusException extends ApiException {
    public ApiMarketCantChangeVkpayStatusException(String message) {
        super(1430, "VK Pay status can not be changed", message);
    }
}
