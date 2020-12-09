package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Lookalike request status
 */
public enum LookalikeRequestStatus implements EnumParam {
    @SerializedName("search_in_progress")
    SEARCH_IN_PROGRESS("search_in_progress"),

    @SerializedName("search_failed")
    SEARCH_FAILED("search_failed"),

    @SerializedName("search_done")
    SEARCH_DONE("search_done"),

    @SerializedName("save_in_progress")
    SAVE_IN_PROGRESS("save_in_progress"),

    @SerializedName("save_failed")
    SAVE_FAILED("save_failed"),

    @SerializedName("save_done")
    SAVE_DONE("save_done");

    private final String value;

    LookalikeRequestStatus(String value) {
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
