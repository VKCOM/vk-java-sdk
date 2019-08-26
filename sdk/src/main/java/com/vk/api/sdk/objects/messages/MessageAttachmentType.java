package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Attachment type
 */
public enum MessageAttachmentType implements EnumParam {
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

    @SerializedName("market_album")
    MARKET_ALBUM("market_album"),

    @SerializedName("gift")
    GIFT("gift"),

    @SerializedName("sticker")
    STICKER("sticker"),

    @SerializedName("wall")
    WALL("wall"),

    @SerializedName("wall_reply")
    WALL_REPLY("wall_reply"),

    @SerializedName("article")
    ARTICLE("article"),

    @SerializedName("graffiti")
    GRAFFITI("graffiti"),

    @SerializedName("audio_message")
    AUDIO_MESSAGE("audio_message");

    private final String value;

    MessageAttachmentType(String value) {
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
