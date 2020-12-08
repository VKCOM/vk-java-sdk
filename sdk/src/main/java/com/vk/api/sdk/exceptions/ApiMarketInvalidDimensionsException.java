package com.vk.api.sdk.exceptions;

public class ApiMarketInvalidDimensionsException extends ApiException {
    public ApiMarketInvalidDimensionsException(String message) {
        super(1429, "Specify width, length, height and weight all together", message);
    }
}
