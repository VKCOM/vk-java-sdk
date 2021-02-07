package com.vk.api.sdk.exceptions;

public class ApiMarketPhotosCropOverflowException extends ApiException {
    public ApiMarketPhotosCropOverflowException(String message) {
        super(1434, "Crop bottom right corner is outside of the image", message);
    }
}
