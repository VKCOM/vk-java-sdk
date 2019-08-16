package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * platform. Possible values: *'ios' — iOS,, *'android' — Android,, *'winphone' — Windows Phone,, *'web' — приложения на vk.com. By default: 'web'. */
public enum AppsPlatform implements EnumParam {
    @SerializedName("android")
    ANDROID("android"),

    @SerializedName("ios")
    IOS("ios"),

    @SerializedName("web")
    WEB("web"),

    @SerializedName("winphone")
    WINPHONE("winphone");

    private final String value;

    AppsPlatform(String value) {
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
