package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

/**
 * Message action type
 */
public enum Action {

    @SerializedName("chat_photo_update")
    CHAT_PHOTO_UPDATE("chat_photo_update"),

    @SerializedName("chat_photo_remove")
    CHAT_PHOTO_REMOVE("chat_photo_remove"),

    @SerializedName("chat_create")
    CHAT_CREATE("chat_create"),

    @SerializedName("chat_title_update")
    CHAT_TITLE_UPDATE("chat_title_update"),

    @SerializedName("chat_invite_user")
    CHAT_INVITE_USER("chat_invite_user"),

    @SerializedName("chat_kick_user")
    CHAT_KICK_USER("chat_kick_user");

    private final String value;

    Action(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
