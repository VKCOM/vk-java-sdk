package com.vk.api.sdk.exceptions;

public class ApiAuthValidationException extends ApiException {

    private String redirectUri;

    public ApiAuthValidationException(String message, String redirectUri) {
        super(17, "Validation required", message);
        this.redirectUri = redirectUri;
    }

    public String getRedirectUri() {
        return redirectUri;
    }
}
