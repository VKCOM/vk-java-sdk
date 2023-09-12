package com.vk.api.sdk.exceptions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tsivarev on 18.08.16.
 */
public class UploadException extends ApiExtendedException {

    public UploadException(Integer code, Integer statusCode, String description, String message) {
        super(code, statusCode, new HashMap<>(), description, message);
    }

    public UploadException(
            Integer code,
            Integer statusCode,
            Map<String, String> headers,
            String description,
            String message
    ) {
        super(code, statusCode, headers, description, message);
    }
}
