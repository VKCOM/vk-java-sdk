package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

/**
 * Attachments type
 */
public enum HistoryMessageAttachmentType {
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
    SHARE("share");

    private final String value;

    HistoryMessageAttachmentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
