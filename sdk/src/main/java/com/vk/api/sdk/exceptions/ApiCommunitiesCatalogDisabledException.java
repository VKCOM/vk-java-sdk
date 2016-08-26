package com.vk.api.sdk.exceptions;

public class ApiCommunitiesCatalogDisabledException extends ApiException {
    public ApiCommunitiesCatalogDisabledException(String message) {
        super(1310, "Catalog is not available for this user", message);
    }
}
