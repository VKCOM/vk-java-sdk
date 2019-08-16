package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Attachments type */
public enum HistoryMessageAttachmentType implements EnumParam {
    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("audio")
    AUDIO("audio"),

    @SerializedName("doc")
    DOC("doc"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("market")
    MARKET("market"),

    @SerializedName("wall")
    WALL("wall"),

    @SerializedName("share")
    SHARE("share"),

    @SerializedName("graffiti")
    GRAFFITI("graffiti"),

    @SerializedName("audio_message")
    AUDIO_MESSAGE("audio_message");

    private final String value;

    HistoryMessageAttachmentType(String value) {
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
