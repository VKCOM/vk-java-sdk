package com.vk.api.sdk.exceptions;

public class ApiAdsParamDomainAppForbiddenException extends ApiException {
    public ApiAdsParamDomainAppForbiddenException(String message) {
        super(610, "Domain app is forbidden", message);
    }
}
