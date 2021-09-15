package com.vk.api.sdk.exceptions;

public class ApiMarketGroupingAlreadyHasSuchVariantException extends ApiException {
    public ApiMarketGroupingAlreadyHasSuchVariantException(String message) {
        super(1413, "Grouping already has such variant", message);
    }
}
