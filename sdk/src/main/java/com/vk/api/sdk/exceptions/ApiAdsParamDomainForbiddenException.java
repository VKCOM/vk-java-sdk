package com.vk.api.sdk.exceptions;

public class ApiAdsParamDomainForbiddenException extends ApiException {
    public ApiAdsParamDomainForbiddenException(String message) {
        super(605, "Domain is forbidden", message);
    }
}
