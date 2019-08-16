package com.vk.api.sdk.objects.audio;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Photo type */
public enum PhotoSizesType implements EnumParam {
    @SerializedName("s")
    S("s"),

    @SerializedName("m")
    M("m"),

    @SerializedName("x")
    X("x"),

    @SerializedName("y")
    Y("y"),

    @SerializedName("z")
    Z("z"),

    @SerializedName("w")
    W("w"),

    @SerializedName("o")
    O("o"),

    @SerializedName("p")
    P("p"),

    @SerializedName("q")
    Q("q"),

    @SerializedName("r")
    R("r");

    private final String value;

    PhotoSizesType(String value) {
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
