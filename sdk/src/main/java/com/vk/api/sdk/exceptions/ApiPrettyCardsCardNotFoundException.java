package com.vk.api.sdk.exceptions;

public class ApiPrettyCardsCardNotFoundException extends ApiException {
    public ApiPrettyCardsCardNotFoundException(String message) {
        super(1900, "Card not found", message);
    }
}
