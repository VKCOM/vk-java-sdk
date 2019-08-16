package com.vk.api.sdk.exceptions;

public class ApiGroupAppIsNotInstalledInCommunityException extends ApiException {
    public ApiGroupAppIsNotInstalledInCommunityException(String message) {
        super(711, "Application is not installed in community", message);
    }
}
