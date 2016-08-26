package com.vk.api.sdk.exceptions;

public class ApiParamNoteIdException extends ApiException {
    public ApiParamNoteIdException(String message) {
        super(180, "Note not found", message);
    }
}
