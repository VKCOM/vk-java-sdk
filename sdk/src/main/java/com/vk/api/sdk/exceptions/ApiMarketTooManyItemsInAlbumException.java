package com.vk.api.sdk.exceptions;

public class ApiMarketTooManyItemsInAlbumException extends ApiException {
    public ApiMarketTooManyItemsInAlbumException(String message) {
        super(1406, "Too many items in album", message);
    }
}
