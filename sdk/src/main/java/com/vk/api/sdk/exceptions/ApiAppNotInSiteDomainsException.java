package com.vk.api.sdk.exceptions;

public class ApiAppNotInSiteDomainsException extends ApiException {
    public ApiAppNotInSiteDomainsException(String message) {
        super(612, "Application must be in domains list of site of ad unit", message);
    }
}
