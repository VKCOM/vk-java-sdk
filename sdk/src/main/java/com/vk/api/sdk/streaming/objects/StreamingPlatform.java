package com.vk.api.sdk.streaming.objects;

import com.google.gson.annotations.SerializedName;

/**
 * Streaming platform
 */
public enum StreamingPlatform {
    @SerializedName("1")
    MOBILE_SITE(1),

    @SerializedName("2")
    IPHONE(2),

    @SerializedName("3")
    IPAD(3),

    @SerializedName("4")
    ANDROID(4),

    @SerializedName("5")
    WINDOWS_PHONE(5),

    @SerializedName("6")
    WINDOWS_8(6),

    @SerializedName("7")
    DESKTOP_SITE(7),

    @SerializedName("8")
    OTHER(8);

    private final int value;

    StreamingPlatform(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
