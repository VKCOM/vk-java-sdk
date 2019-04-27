package com.vk.api.sdk.exceptions;

public class ApiPollsAccessWithoutVoteException extends ApiException {
    public ApiPollsAccessWithoutVoteException(String message) {
        super(253, "Access denied, please vote first", message);
    }
}
