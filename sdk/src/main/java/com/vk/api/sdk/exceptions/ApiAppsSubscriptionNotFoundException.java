package com.vk.api.sdk.exceptions;

public class ApiAppsSubscriptionNotFoundException extends ApiException {
    public ApiAppsSubscriptionNotFoundException(String message) {
        super(1256, "Subscription not found", message);
    }
}
