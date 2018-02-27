package com.vk.api.sdk.exceptions;

public class ApiWallAdsPostLimitReachedException extends ApiException {
    public ApiWallAdsPostLimitReachedException(String message) {
        super(224, "Too many ads posts", message);
    }
}
