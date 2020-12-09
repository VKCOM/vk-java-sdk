package com.vk.api.sdk.objects.apps;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Application type
 */
public enum AppType implements EnumParam {
    @SerializedName("app")
    APP("app"),

    @SerializedName("game")
    GAME("game"),

    @SerializedName("site")
    SITE("site"),

    @SerializedName("standalone")
    STANDALONE("standalone"),

    @SerializedName("vk_app")
    VK_APP("vk_app"),

    @SerializedName("community_app")
    COMMUNITY_APP("community_app"),

    @SerializedName("html5_game")
    HTML5_GAME("html5_game"),

    @SerializedName("mini_app")
    MINI_APP("mini_app");

    private final String value;

    AppType(String value) {
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
