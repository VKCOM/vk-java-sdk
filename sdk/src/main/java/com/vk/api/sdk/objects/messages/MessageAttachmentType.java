package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

/**
 * Attachment type
 */
public enum MessageAttachmentType {
    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("audio")
    AUDIO("audio"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("doc")
    DOC("doc"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("market")
    MARKET("market"),

    @SerializedName("market_market_album")
    MARKET_MARKET_ALBUM("market_market_album"),

    @SerializedName("gift")
    GIFT("gift"),

    @SerializedName("sticker")
    STICKER("sticker"),

    @SerializedName("wall")
    WALL("wall"),

    @SerializedName("wall_reply")
    WALL_REPLY("wall_reply");

    private final String value;

    MessageAttachmentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
