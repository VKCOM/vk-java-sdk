package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;

/**
 * Type of post source
 */
public enum PostSourceType {
    @SerializedName("vk")
    VK("vk"),

    @SerializedName("widget")
    WIDGET("widget"),

    @SerializedName("api")
    API("api"),

    @SerializedName("rss")
    RSS("rss"),

    @SerializedName("sms")
    SMS("sms");

    private final String value;

    PostSourceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
