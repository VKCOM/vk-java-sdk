package com.vk.api.sdk.exceptions;

public class ApiAccessPageException extends ApiException {
    public ApiAccessPageException(String message) {
        super(141, "Access to page denied", message);
    }
}
