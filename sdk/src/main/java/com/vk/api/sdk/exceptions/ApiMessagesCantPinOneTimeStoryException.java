package com.vk.api.sdk.exceptions;

public class ApiMessagesCantPinOneTimeStoryException extends ApiException {
    public ApiMessagesCantPinOneTimeStoryException(String message) {
        super(942, "Cannot pin one-time story", message);
    }
}
