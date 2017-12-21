package com.vk.api.sdk.exceptions;

public class ApiMessageInviteLinkNoAccessException extends ApiException {
    public ApiMessageInviteLinkNoAccessException(String message) {
        super(917, "You don't have access to this chat", message);
    }
}
