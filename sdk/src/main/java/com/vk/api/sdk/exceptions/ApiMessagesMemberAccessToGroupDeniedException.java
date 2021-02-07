package com.vk.api.sdk.exceptions;

public class ApiMessagesMemberAccessToGroupDeniedException extends ApiException {
    public ApiMessagesMemberAccessToGroupDeniedException(String message) {
        super(947, "Can't add user to chat, because user has no access to group", message);
    }
}
