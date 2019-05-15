package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Type of media files to return: *'photo',, *'video',, *'audio',, *'doc',, *'link'.,*'market'.,*'wall'.,*'share'
 */
public enum MessagesMediaType implements EnumParam {
    @SerializedName("audio")
    AUDIO("audio"),

    @SerializedName("audio_message")
    AUDIO_MESSAGE("audio_message"),

    @SerializedName("doc")
    DOC("doc"),

    @SerializedName("graffiti")
    GRAFFITI("graffiti"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("market")
    MARKET("market"),

    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("share")
    SHARE("share"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("wall")
    WALL("wall");

    private final String value;

    MessagesMediaType(String value) {
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
