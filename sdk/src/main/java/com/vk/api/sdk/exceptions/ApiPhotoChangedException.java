package com.vk.api.sdk.exceptions;

public class ApiPhotoChangedException extends ApiException {
    public ApiPhotoChangedException(String message) {
        super(1160, "Original photo was changed", message);
    }
}
