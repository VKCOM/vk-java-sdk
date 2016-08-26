package com.vk.api.sdk.exceptions;

public class ApiMessagesDenySendException extends ApiException {
    public ApiMessagesDenySendException(String message) {
        super(901, "Can't send messages for users without dialogs", message);
    }
}
