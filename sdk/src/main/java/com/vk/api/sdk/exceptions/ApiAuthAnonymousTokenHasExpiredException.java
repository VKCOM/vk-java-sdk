package com.vk.api.sdk.exceptions;

public class ApiAuthAnonymousTokenHasExpiredException extends ApiException {
    public ApiAuthAnonymousTokenHasExpiredException(String message) {
        super(1114, "Anonymous token has expired", message);
    }
}
