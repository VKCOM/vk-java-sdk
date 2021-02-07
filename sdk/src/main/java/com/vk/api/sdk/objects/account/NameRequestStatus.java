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
    WAS_DECLINED("was_declined"),

    @SerializedName("declined_with_link")
    DECLINED_WITH_LINK("declined_with_link"),

    @SerializedName("response")
    RESPONSE("response"),

    @SerializedName("response_with_link")
    RESPONSE_WITH_LINK("response_with_link");

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
