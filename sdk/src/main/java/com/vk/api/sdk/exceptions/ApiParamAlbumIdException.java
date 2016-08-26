package com.vk.api.sdk.exceptions;

public class ApiParamAlbumIdException extends ApiException {
    public ApiParamAlbumIdException(String message) {
        super(114, "Invalid album id", message);
    }
}
