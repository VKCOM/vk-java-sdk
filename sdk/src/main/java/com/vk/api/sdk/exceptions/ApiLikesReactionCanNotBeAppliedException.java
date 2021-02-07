package com.vk.api.sdk.exceptions;

public class ApiLikesReactionCanNotBeAppliedException extends ApiException {
    public ApiLikesReactionCanNotBeAppliedException(String message) {
        super(232, "Reaction can not be applied to the object", message);
    }
}
