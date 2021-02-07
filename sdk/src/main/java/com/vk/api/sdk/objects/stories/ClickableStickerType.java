package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ClickableStickerType implements EnumParam {
    @SerializedName("hashtag")
    HASHTAG("hashtag"),

    @SerializedName("mention")
    MENTION("mention"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("question")
    QUESTION("question"),

    @SerializedName("place")
    PLACE("place"),

    @SerializedName("market_item")
    MARKET_ITEM("market_item"),

    @SerializedName("music")
    MUSIC("music"),

    @SerializedName("story_reply")
    STORY_REPLY("story_reply"),

    @SerializedName("owner")
    OWNER("owner"),

    @SerializedName("post")
    POST("post"),

    @SerializedName("poll")
    POLL("poll"),

    @SerializedName("sticker")
    STICKER("sticker"),

    @SerializedName("app")
    APP("app"),

    @SerializedName("situational_theme")
    SITUATIONAL_THEME("situational_theme");

    private final String value;

    ClickableStickerType(String value) {
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
