package com.vk.api.sdk.exceptions;

public class ApiMessagesPeerBlockedReasonByTimeException extends ApiException {
    public ApiMessagesPeerBlockedReasonByTimeException(String message) {
        super(950, "Can't send message, reply timed out", message);
    }
}
