package com.vk.api.sdk.exceptions;

public class ApiWallAdsPublishedException extends ApiException {
    public ApiWallAdsPublishedException(String message) {
        super(219, "Advertisement post was recently added", message);
    }
}
