package com.vk.api.sdk.exceptions;

public class ApiWallCheckLinkCantDetermineSourceException extends ApiException {
    public ApiWallCheckLinkCantDetermineSourceException(String message) {
        super(3102, "Specified link is incorrect (can't find source)", message);
    }
}
