package com.vk.api.sdk.exceptions;

public class ApiFriendsListIdException extends ApiException {
    public ApiFriendsListIdException(String message) {
        super(171, "Invalid list id", message);
    }
}
