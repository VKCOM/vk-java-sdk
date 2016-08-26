package com.vk.api.sdk.exceptions;

public class ApiAccessGroupException extends ApiException {
    public ApiAccessGroupException(String message) {
        super(203, "Access to group denied", message);
    }
}
