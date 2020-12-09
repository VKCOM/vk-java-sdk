package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum Filters implements EnumParam {
    @SerializedName("post")
    POST("post"),

    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("photo_tag")
    PHOTO_TAG("photo_tag"),

    @SerializedName("wall_photo")
    WALL_PHOTO("wall_photo"),

    @SerializedName("friend")
    FRIEND("friend"),

    @SerializedName("recommended_groups")
    RECOMMENDED_GROUPS("recommended_groups"),

    @SerializedName("note")
    NOTE("note"),

    @SerializedName("audio")
    AUDIO("audio"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("audio_playlist")
    AUDIO_PLAYLIST("audio_playlist"),

    @SerializedName("games_carousel")
    GAMES_CAROUSEL("games_carousel"),

    @SerializedName("clip")
    CLIP("clip");

    private final String value;

    Filters(String value) {
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
