package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Campaign status */
public enum CampaignStatus implements EnumParam {
    @SerializedName("0")
    STOPPED(0),

    @SerializedName("1")
    STARTED(1),

    @SerializedName("2")
    DELETED(2);

    private final Integer value;

    CampaignStatus(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
