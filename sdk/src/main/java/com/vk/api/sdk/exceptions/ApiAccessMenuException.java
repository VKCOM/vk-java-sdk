package com.vk.api.sdk.exceptions;

public class ApiAccessMenuException extends ApiException {
    public ApiAccessMenuException(String message) {
        super(148, "Access to the menu of the user denied", message);
    }
}
