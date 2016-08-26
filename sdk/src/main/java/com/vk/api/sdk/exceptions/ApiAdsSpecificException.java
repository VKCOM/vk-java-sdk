package com.vk.api.sdk.exceptions;

public class ApiAdsSpecificException extends ApiException {
    public ApiAdsSpecificException(String message) {
        super(603, "Some ads error occured", message);
    }
}
