package com.vk.api.sdk.exceptions;

public class ApiMessagesForbiddenInviteLinkException extends ApiException {
    public ApiMessagesForbiddenInviteLinkException(String message) {
        super(919, "You can't see invite link for this chat", message);
    }
}
