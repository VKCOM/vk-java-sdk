package com.vk.api.sdk.exceptions;

public class ApiMarketExtendedNotEnabledException extends ApiException {
    public ApiMarketExtendedNotEnabledException(String message) {
        super(1409, "Extended market not enabled", message);
    }
}
