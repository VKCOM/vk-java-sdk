package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Request status
 */
public enum NameRequestStatus implements EnumParam {
    @SerializedName("success")
    SUCCESS("success"),

    @SerializedName("processing")
    PROCESSING("processing"),

    @SerializedName("declined")
    DECLINED("declined"),

    @SerializedName("was_accepted")
    WAS_ACCEPTED("was_accepted"),

    @SerializedName("was_declined")
    WAS_DECLINED("was_declined");

    private final String value;

    NameRequestStatus(String value) {
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
