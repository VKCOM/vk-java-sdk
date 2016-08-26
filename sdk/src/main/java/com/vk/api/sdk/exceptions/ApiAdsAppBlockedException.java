package com.vk.api.sdk.exceptions;

public class ApiAdsAppBlockedException extends ApiException {
    public ApiAdsAppBlockedException(String message) {
        super(613, "Application is blocked", message);
    }
}
