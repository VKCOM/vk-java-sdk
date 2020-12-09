package com.vk.api.sdk.exceptions;

public class ApiMarketPhotosCropInvalidFormatException extends ApiException {
    public ApiMarketPhotosCropInvalidFormatException(String message) {
        super(1433, "Invalid image crop format", message);
    }
}
