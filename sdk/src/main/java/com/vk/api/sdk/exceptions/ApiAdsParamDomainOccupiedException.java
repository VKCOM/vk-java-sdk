package com.vk.api.sdk.exceptions;

public class ApiAdsParamDomainOccupiedException extends ApiException {
    public ApiAdsParamDomainOccupiedException(String message) {
        super(607, "Domain is occupied", message);
    }
}
