package com.vk.api.sdk.exceptions;

public class ApiNotImplementedYetException extends ApiException {
    public ApiNotImplementedYetException(String message) {
        super(33, "Not implemented yet", message);
    }
}
