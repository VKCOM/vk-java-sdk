package com.vk.api.sdk.exceptions;

public class ApiStickersNotFavoriteException extends ApiException {
    public ApiStickersNotFavoriteException(String message) {
        super(2102, "Stickers are not favorite", message);
    }
}
