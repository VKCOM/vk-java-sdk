package com.vk.api.sdk.exceptions;

public class ApiAssertVotesException extends ApiException {
    public ApiAssertVotesException(String message) {
        super(3305, "Assert votes", message);
    }
}
