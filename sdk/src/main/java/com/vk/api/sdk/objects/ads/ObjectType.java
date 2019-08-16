package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Object type */
public enum ObjectType implements EnumParam {
    @SerializedName("ad")
    AD("ad"),

    @SerializedName("campaign")
    CAMPAIGN("campaign"),

    @SerializedName("client")
    CLIENT("client"),

    @SerializedName("office")
    OFFICE("office");

    private final String value;

    ObjectType(String value) {
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
