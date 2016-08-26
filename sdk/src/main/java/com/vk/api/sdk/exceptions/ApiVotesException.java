package com.vk.api.sdk.exceptions;

public class ApiVotesException extends ApiException {
    public ApiVotesException(String message) {
        super(503, "Not enough votes", message);
    }
}
