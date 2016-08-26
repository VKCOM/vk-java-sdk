package com.vk.api.sdk.exceptions;

public class ApiWallAccessRepliesException extends ApiException {
    public ApiWallAccessRepliesException(String message) {
        super(212, "Access to post comments denied", message);
    }
}
