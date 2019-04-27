package com.vk.api.sdk.exceptions;

public class ApiAdsObjectDeletedException extends ApiException {
    public ApiAdsObjectDeletedException(String message) {
        super(629, "Object deleted", message);
    }
}
