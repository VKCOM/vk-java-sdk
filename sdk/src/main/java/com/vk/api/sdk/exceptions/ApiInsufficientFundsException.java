package com.vk.api.sdk.exceptions;

public class ApiInsufficientFundsException extends ApiException {
    public ApiInsufficientFundsException(String message) {
        super(147, "Application has insufficient funds", message);
    }
}
