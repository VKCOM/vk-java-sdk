package com.vk.api.sdk.objects.search;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Section title */
public enum HintSection implements EnumParam {
    @SerializedName("groups")
    GROUPS("groups"),

    @SerializedName("events")
    EVENTS("events"),

    @SerializedName("publics")
    PUBLICS("publics"),

    @SerializedName("correspondents")
    CORRESPONDENTS("correspondents"),

    @SerializedName("people")
    PEOPLE("people"),

    @SerializedName("friends")
    FRIENDS("friends"),

    @SerializedName("mutual_friends")
    MUTUAL_FRIENDS("mutual_friends");

    private final String value;

    HintSection(String value) {
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
