package com.vk.api.sdk.objects.apps;

import com.google.gson.annotations.SerializedName;

/**
 * Application type
 */
public enum AppType {
    @SerializedName("app")
    APP("app"),

    @SerializedName("game")
    GAME("game"),

    @SerializedName("site")
    SITE("site"),

    @SerializedName("standalone")
    STANDALONE("standalone");

    private final String value;

    AppType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
