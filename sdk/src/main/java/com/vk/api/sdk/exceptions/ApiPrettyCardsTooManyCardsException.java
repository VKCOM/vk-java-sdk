package com.vk.api.sdk.exceptions;

public class ApiPrettyCardsTooManyCardsException extends ApiException {
    public ApiPrettyCardsTooManyCardsException(String message) {
        super(1901, "Too many cards", message);
    }
}
