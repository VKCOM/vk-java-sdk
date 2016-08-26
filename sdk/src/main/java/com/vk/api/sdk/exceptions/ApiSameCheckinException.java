package com.vk.api.sdk.exceptions;

public class ApiSameCheckinException extends ApiException {
    public ApiSameCheckinException(String message) {
        super(190, "You have sent same checkin in last 10 minutes", message);
    }
}
