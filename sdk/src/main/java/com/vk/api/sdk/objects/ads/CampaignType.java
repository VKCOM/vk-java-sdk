package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Campaign type */
public enum CampaignType implements EnumParam {
    @SerializedName("normal")
    NORMAL("normal"),

    @SerializedName("vk_apps_managed")
    VK_APPS_MANAGED("vk_apps_managed"),

    @SerializedName("mobile_apps")
    MOBILE_APPS("mobile_apps"),

    @SerializedName("promoted_posts")
    PROMOTED_POSTS("promoted_posts");

    private final String value;

    CampaignType(String value) {
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
