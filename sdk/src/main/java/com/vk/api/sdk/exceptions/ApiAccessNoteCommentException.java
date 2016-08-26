package com.vk.api.sdk.exceptions;

public class ApiAccessNoteCommentException extends ApiException {
    public ApiAccessNoteCommentException(String message) {
        super(182, "You can't comment this note", message);
    }
}
