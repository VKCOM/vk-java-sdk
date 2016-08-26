package com.vk.api.sdk.exceptions;

public class ApiAdsParamDomainAppInvalidException extends ApiException {
    public ApiAdsParamDomainAppInvalidException(String message) {
        super(609, "Domain app is invalid", message);
    }
}
