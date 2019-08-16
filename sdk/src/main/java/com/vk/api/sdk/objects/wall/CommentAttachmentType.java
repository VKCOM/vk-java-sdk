package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Attachment type */
public enum CommentAttachmentType implements EnumParam {
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

    @SerializedName("note")
    NOTE("note"),

    @SerializedName("page")
    PAGE("page"),

    @SerializedName("market_market_album")
    MARKET_MARKET_ALBUM("market_market_album"),

    @SerializedName("market")
    MARKET("market"),

    @SerializedName("sticker")
    STICKER("sticker");

    private final String value;

    CommentAttachmentType(String value) {
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
