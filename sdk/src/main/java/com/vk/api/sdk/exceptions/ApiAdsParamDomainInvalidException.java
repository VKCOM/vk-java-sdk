package com.vk.api.sdk.exceptions;

public class ApiAdsParamDomainInvalidException extends ApiException {
    public ApiAdsParamDomainInvalidException(String message) {
        super(604, "Invalid domain", message);
    }
}
