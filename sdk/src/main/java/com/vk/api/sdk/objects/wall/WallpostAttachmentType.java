package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;

/**
 * Attachment type
 */
public enum WallpostAttachmentType {
    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("posted_photo")
    POSTED_PHOTO("posted_photo"),

    @SerializedName("audio")
    AUDIO("audio"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("doc")
    DOC("doc"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("graffiti")
    GRAFFITI("graffiti"),

    @SerializedName("note")
    NOTE("note"),

    @SerializedName("app")
    APP("app"),

    @SerializedName("poll")
    POLL("poll"),

    @SerializedName("page")
    PAGE("page"),

    @SerializedName("album")
    ALBUM("album"),

    @SerializedName("photos_list")
    PHOTOS_LIST("photos_list"),

    @SerializedName("market_market_album")
    MARKET_MARKET_ALBUM("market_market_album"),

    @SerializedName("market")
    MARKET("market");

    private final String value;

    WallpostAttachmentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
