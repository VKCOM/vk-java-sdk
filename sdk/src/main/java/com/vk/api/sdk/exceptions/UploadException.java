package com.vk.api.sdk.exceptions;

/**
 * Created by tsivarev on 18.08.16.
 */
public class UploadException extends ApiException {

    public UploadException(Integer code, String description, String message) {
        super(code, description, message);
    }
}
