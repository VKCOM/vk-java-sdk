package com.vk.api.sdk.exceptions;

public class ApiMarketTooManyAlbumsException extends ApiException {
    public ApiMarketTooManyAlbumsException(String message) {
        super(1407, "Too many albums", message);
    }
}
