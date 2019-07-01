package com.vk.api.sdk.exceptions;

public class ApiMarketGroupingMustContainMoreThanOneItemException extends ApiException {
    public ApiMarketGroupingMustContainMoreThanOneItemException(String message) {
        super(1425, "Grouping must have two or more items", message);
    }
}
