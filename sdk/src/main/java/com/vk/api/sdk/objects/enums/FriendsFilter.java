package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum FriendsFilter implements EnumParam {
    @SerializedName("mutual")
    MUTUAL("mutual"),

    @SerializedName("contacts")
    CONTACTS("contacts"),

    @SerializedName("mutual_contacts")
    MUTUAL_CONTACTS("mutual_contacts");

    private final String value;

    FriendsFilter(String value) {
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
