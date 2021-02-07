package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ClickableStickerStyle implements EnumParam {
    @SerializedName("transparent")
    TRANSPARENT("transparent"),

    @SerializedName("blue_gradient")
    BLUE_GRADIENT("blue_gradient"),

    @SerializedName("red_gradient")
    RED_GRADIENT("red_gradient"),

    @SerializedName("underline")
    UNDERLINE("underline"),

    @SerializedName("blue")
    BLUE("blue"),

    @SerializedName("green")
    GREEN("green"),

    @SerializedName("white")
    WHITE("white"),

    @SerializedName("question_reply")
    QUESTION_REPLY("question_reply"),

    @SerializedName("light")
    LIGHT("light"),

    @SerializedName("impressive")
    IMPRESSIVE("impressive");

    private final String value;

    ClickableStickerStyle(String value) {
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
