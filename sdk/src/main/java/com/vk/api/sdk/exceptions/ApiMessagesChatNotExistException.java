package com.vk.api.sdk.exceptions;

public class ApiMessagesChatNotExistException extends ApiException {
    public ApiMessagesChatNotExistException(String message) {
        super(927, "Chat does not exist", message);
    }
}
