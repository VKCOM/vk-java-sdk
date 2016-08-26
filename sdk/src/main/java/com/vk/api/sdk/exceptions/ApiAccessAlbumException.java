package com.vk.api.sdk.exceptions;

public class ApiAccessAlbumException extends ApiException {
    public ApiAccessAlbumException(String message) {
        super(200, "Access denied", message);
    }
}
