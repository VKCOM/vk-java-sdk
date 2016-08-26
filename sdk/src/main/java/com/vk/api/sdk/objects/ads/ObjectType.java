package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

/**
 * Object type
 */
public enum ObjectType {
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
}
