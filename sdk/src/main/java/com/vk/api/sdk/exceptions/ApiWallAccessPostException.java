package com.vk.api.sdk.exceptions;

public class ApiWallAccessPostException extends ApiException {
    public ApiWallAccessPostException(String message) {
        super(210, "Access to wall's post denied", message);
    }
}
