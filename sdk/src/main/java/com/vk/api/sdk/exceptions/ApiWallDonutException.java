package com.vk.api.sdk.exceptions;

public class ApiWallDonutException extends ApiException {
    public ApiWallDonutException(String message) {
        super(225, "Donut is disabled", message);
    }
}
