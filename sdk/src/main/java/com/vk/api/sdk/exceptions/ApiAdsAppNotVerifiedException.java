package com.vk.api.sdk.exceptions;

public class ApiAdsAppNotVerifiedException extends ApiException {
    public ApiAdsAppNotVerifiedException(String message) {
        super(611, "Application must be verified", message);
    }
}
