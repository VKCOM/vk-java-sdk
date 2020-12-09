package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Size type
 */
public enum PhotoSizesType implements EnumParam {
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

    @SerializedName("k")
    K("k"),

    @SerializedName("l")
    L("l"),

    @SerializedName("y")
    Y("y"),

    @SerializedName("z")
    Z("z"),

    @SerializedName("c")
    C("c"),

    @SerializedName("w")
    W("w"),

    @SerializedName("a")
    A("a"),

    @SerializedName("b")
    B("b"),

    @SerializedName("e")
    E("e"),

    @SerializedName("i")
    I("i"),

    @SerializedName("d")
    D("d"),

    @SerializedName("j")
    J("j"),

    @SerializedName("temp")
    TEMP("temp"),

    @SerializedName("h")
    H("h"),

    @SerializedName("g")
    G("g"),

    @SerializedName("n")
    N("n"),

    @SerializedName("f")
    F("f"),

    @SerializedName("max")
    MAX("max");

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
