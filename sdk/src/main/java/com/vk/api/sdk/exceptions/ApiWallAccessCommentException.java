package com.vk.api.sdk.exceptions;

public class ApiWallAccessCommentException extends ApiException {
    public ApiWallAccessCommentException(String message) {
        super(211, "Access to wall's comment denied", message);
    }
}
