package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;

/**
 * Request status
 */
public enum NameRequestStatus {
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
}
