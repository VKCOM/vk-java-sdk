package com.vk.api.sdk.exceptions;

public class ApiMarketCommentsClosedException extends ApiException {
    public ApiMarketCommentsClosedException(String message) {
        super(1401, "Comments for this market are closed", message);
    }
}
