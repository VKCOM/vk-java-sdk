package com.vk.api.sdk.exceptions;

public class ApiGroupInviteLinksNotValidException extends ApiException {
    public ApiGroupInviteLinksNotValidException(String message) {
        super(714, "Invite link is invalid - expired, deleted or not exists", message);
    }
}
