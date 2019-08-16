package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Peer type */
public enum ConversationPeerType implements EnumParam {
    @SerializedName("chat")
    CHAT("chat"),

    @SerializedName("email")
    EMAIL("email"),

    @SerializedName("user")
    USER("user"),

    @SerializedName("group")
    GROUP("group");

    private final String value;

    ConversationPeerType(String value) {
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
