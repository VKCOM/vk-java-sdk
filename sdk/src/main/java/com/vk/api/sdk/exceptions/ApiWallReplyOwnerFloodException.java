package com.vk.api.sdk.exceptions;

public class ApiWallReplyOwnerFloodException extends ApiException {
    public ApiWallReplyOwnerFloodException(String message) {
        super(223, "Too many replies", message);
    }
}
