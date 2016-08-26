package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;

/**
 * Size type
 */
public enum PhotoSizesType {
    @SerializedName("s")
    S("s"),

    @SerializedName("m")
    M("m"),

    @SerializedName("x")
    X("x"),

    @SerializedName("o")
    O("o"),

    @SerializedName("p")
    P("p"),

    @SerializedName("q")
    Q("q"),

    @SerializedName("r")
    R("r"),

    @SerializedName("y")
    Y("y"),

    @SerializedName("z")
    Z("z"),

    @SerializedName("w")
    W("w");

    private final String value;

    PhotoSizesType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
