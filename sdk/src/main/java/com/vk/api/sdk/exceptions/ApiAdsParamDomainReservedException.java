package com.vk.api.sdk.exceptions;

public class ApiAdsParamDomainReservedException extends ApiException {
    public ApiAdsParamDomainReservedException(String message) {
        super(606, "Domain is reserved", message);
    }
}
