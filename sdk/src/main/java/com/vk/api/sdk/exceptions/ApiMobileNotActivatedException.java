package com.vk.api.sdk.exceptions;

public class ApiMobileNotActivatedException extends ApiException {
    public ApiMobileNotActivatedException(String message) {
        super(146, "The mobile number of the user is unknown", message);
    }
}
