package com.vk.api.sdk.exceptions;

public class ApiMessagesUserNotDonException extends ApiException {
    public ApiMessagesUserNotDonException(String message) {
        super(962, "You can't access donut chat without subscription", message);
    }
}
