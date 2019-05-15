package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ConversationMessageRequest implements EnumParam {
    @SerializedName("pending")
    PENDING("pending"),

    @SerializedName("rejected")
    REJECTED("rejected");

    private final String value;

    ConversationMessageRequest(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
