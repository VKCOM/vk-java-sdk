package com.vk.api.sdk.exceptions;

public class ApiPrettyCardsCardIsConnectedToPostException extends ApiException {
    public ApiPrettyCardsCardIsConnectedToPostException(String message) {
        super(1902, "Card is connected to post", message);
    }
}
