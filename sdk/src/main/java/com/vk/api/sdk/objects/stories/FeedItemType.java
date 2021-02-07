package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Type of Feed Item
 */
public enum FeedItemType implements EnumParam {
    @SerializedName("promo_stories")
    PROMO_STORIES("promo_stories"),

    @SerializedName("stories")
    STORIES("stories"),

    @SerializedName("live_active")
    LIVE_ACTIVE("live_active"),

    @SerializedName("live_finished")
    LIVE_FINISHED("live_finished"),

    @SerializedName("community_grouped_stories")
    COMMUNITY_GROUPED_STORIES("community_grouped_stories"),

    @SerializedName("app_grouped_stories")
    APP_GROUPED_STORIES("app_grouped_stories"),

    @SerializedName("birthday")
    BIRTHDAY("birthday");

    private final String value;

    FeedItemType(String value) {
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
