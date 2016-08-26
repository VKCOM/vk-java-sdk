package com.vk.api.sdk.exceptions;

public class OAuthException extends ApiException {

    private String redirectUri;

    public OAuthException(String name, String description, String redirectUri) {
        super(0, name, description);
        this.redirectUri = redirectUri;
    }

    public String getRedirectUri() {
        return redirectUri;
    }
}
