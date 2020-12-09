package com.vk.api.sdk.exceptions;

public class ApiFaveAliexpressTagException extends ApiException {
    public ApiFaveAliexpressTagException(String message) {
        super(3800, "Can't set AliExpress tag to this type of object", message);
    }
}
