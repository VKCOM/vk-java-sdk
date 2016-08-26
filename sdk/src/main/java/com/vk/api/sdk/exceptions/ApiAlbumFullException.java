package com.vk.api.sdk.exceptions;

public class ApiAlbumFullException extends ApiException {
    public ApiAlbumFullException(String message) {
        super(300, "This album is full", message);
    }
}
