package com.vk.api.sdk.exceptions;

public class ApiAdsPartialSuccessException extends ApiException {
    public ApiAdsPartialSuccessException(String message) {
        super(602, "Some part of the request has not been completed", message);
    }
}
