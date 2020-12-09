package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum Filter implements EnumParam {
    @SerializedName("admin")
    ADMIN("admin"),

    @SerializedName("editor")
    EDITOR("editor"),

    @SerializedName("moder")
    MODER("moder"),

    @SerializedName("advertiser")
    ADVERTISER("advertiser"),

    @SerializedName("groups")
    GROUPS("groups"),

    @SerializedName("publics")
    PUBLICS("publics"),

    @SerializedName("events")
    EVENTS("events"),

    @SerializedName("has_addresses")
    HAS_ADDRESSES("has_addresses");

    private final String value;

    Filter(String value) {
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
