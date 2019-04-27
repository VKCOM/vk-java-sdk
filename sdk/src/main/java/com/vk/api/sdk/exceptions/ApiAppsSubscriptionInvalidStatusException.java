package com.vk.api.sdk.exceptions;

public class ApiAppsSubscriptionInvalidStatusException extends ApiException {
    public ApiAppsSubscriptionInvalidStatusException(String message) {
        super(1257, "Subscription is in invalid status", message);
    }
}
