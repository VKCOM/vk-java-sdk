package com.vk.api.sdk.exceptions;

public class ApiMarketPhotosCropSizeTooLowException extends ApiException {
    public ApiMarketPhotosCropSizeTooLowException(String message) {
        super(1435, "Crop size is less than the minimum", message);
    }
}
