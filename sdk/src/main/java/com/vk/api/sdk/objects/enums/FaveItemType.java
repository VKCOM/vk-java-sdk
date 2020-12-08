package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum FaveItemType implements EnumParam {
    @SerializedName("article")
    ARTICLE("article"),

    @SerializedName("clip")
    CLIP("clip"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("narrative")
    NARRATIVE("narrative"),

    @SerializedName("page")
    PAGE("page"),

    @SerializedName("podcast")
    PODCAST("podcast"),

    @SerializedName("post")
    POST("post"),

    @SerializedName("product")
    PRODUCT("product"),

    @SerializedName("video")
    VIDEO("video");

    private final String value;

    FaveItemType(String value) {
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
