package com.vk.api.sdk.exceptions;

public class ApiAccessNoteException extends ApiException {
    public ApiAccessNoteException(String message) {
        super(181, "Access to note denied", message);
    }
}
