package com.vk.api.sdk.exceptions;

import java.util.Map;

public class ApiExtendedException extends ApiException {

    private Integer statusCode;
    private Map<String, String> headers;

    public ApiExtendedException(
            Integer code,
            Integer statusCode,
            Map<String, String> headers,
            String description,
            String message
    ) {
        super(code, description, message);
        this.statusCode = statusCode;
        this.headers = headers;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }
}