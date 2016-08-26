package com.vk.api.sdk.exceptions;

public class ApiPermissionException extends ApiException {
    public ApiPermissionException(String message) {
        super(7, "Permission to perform this action is denied", message);
    }
}
