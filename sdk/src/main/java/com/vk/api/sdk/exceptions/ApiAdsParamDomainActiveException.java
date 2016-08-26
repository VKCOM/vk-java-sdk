package com.vk.api.sdk.exceptions;

public class ApiAdsParamDomainActiveException extends ApiException {
    public ApiAdsParamDomainActiveException(String message) {
        super(608, "Domain is active", message);
    }
}
