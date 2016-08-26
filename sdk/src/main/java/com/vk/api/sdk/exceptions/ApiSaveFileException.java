package com.vk.api.sdk.exceptions;

public class ApiSaveFileException extends ApiException {
    public ApiSaveFileException(String message) {
        super(105, "Couldn't save file", message);
    }
}
