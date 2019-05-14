package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Type of requested objects listed in 'ids' parameter: *ad — ads,, *campaign — campaigns,, *client — clients,, *office — account.
 */
public enum AdsIdsType implements EnumParam {
    @SerializedName("ad")
    AD("ad"),

    @SerializedName("campaign")
    CAMPAIGN("campaign"),

    @SerializedName("client")
    CLIENT("client"),

    @SerializedName("office")
    OFFICE("office");

    private final String value;

    AdsIdsType(String value) {
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
