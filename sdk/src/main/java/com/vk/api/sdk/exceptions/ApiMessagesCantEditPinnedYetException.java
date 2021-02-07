package com.vk.api.sdk.exceptions;

public class ApiMessagesCantEditPinnedYetException extends ApiException {
    public ApiMessagesCantEditPinnedYetException(String message) {
        super(949, "Can't edit pinned message yet", message);
    }
}
