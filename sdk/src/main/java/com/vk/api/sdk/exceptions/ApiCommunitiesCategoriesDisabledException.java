package com.vk.api.sdk.exceptions;

public class ApiCommunitiesCategoriesDisabledException extends ApiException {
    public ApiCommunitiesCategoriesDisabledException(String message) {
        super(1311, "Catalog categories are not available for this user", message);
    }
}
