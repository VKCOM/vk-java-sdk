package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;

/**
 * Returns 1 if suggestion has been declined
 */
public enum DeleteResponseSuggestionDeleted {
    @SerializedName("1")
    OK(1);

    private final Integer value;

    DeleteResponseSuggestionDeleted(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
