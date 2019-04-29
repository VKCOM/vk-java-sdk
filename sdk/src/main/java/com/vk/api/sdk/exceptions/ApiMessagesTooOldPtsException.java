package com.vk.api.sdk.exceptions;

public class ApiMessagesTooOldPtsException extends ApiException {
    public ApiMessagesTooOldPtsException(String message) {
        super(907, "Value of ts or pts is too old", message);
    }
}
