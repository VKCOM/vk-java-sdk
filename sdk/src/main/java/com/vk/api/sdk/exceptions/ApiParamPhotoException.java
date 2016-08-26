package com.vk.api.sdk.exceptions;

public class ApiParamPhotoException extends ApiException {
    public ApiParamPhotoException(String message) {
        super(129, "Invalid photo", message);
    }
}
