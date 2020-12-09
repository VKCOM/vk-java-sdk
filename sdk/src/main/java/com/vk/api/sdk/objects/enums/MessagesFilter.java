package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Filter to apply: 'all' — all conversations, 'unread' — conversations with unread messages, 'important' — conversations, marked as important (only for community messages), 'unanswered' — conversations, marked as unanswered (only for community messages)
 */
public enum MessagesFilter implements EnumParam {
    @SerializedName("all")
    ALL("all"),

    @SerializedName("important")
    IMPORTANT("important"),

    @SerializedName("unanswered")
    UNANSWERED("unanswered"),

    @SerializedName("unread")
    UNREAD("unread");

    private final String value;

    MessagesFilter(String value) {
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
