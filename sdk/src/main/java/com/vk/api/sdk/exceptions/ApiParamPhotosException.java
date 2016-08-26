package com.vk.api.sdk.exceptions;

public class ApiParamPhotosException extends ApiException {
    public ApiParamPhotosException(String message) {
        super(122, "Invalid photos", message);
    }
}
