package com.vk.api.sdk.exceptions;

public class ApiWallLinksForbiddenException extends ApiException {
    public ApiWallLinksForbiddenException(String message) {
        super(222, "Hyperlinks are forbidden", message);
    }
}
