package com.vk.api.sdk.callback.objects.group;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public enum CallbackGroupJoinType {

    @SerializedName("join")
    JOIN("join"),

    @SerializedName("unsure")
    UNSURE("unsure"),

    @SerializedName("accepted")
    ACCEPTED("accepted"),

    @SerializedName("approved")
    APPROVED("approved"),

    @SerializedName("request")
    REQUEST("request");

    private final String value;

    CallbackGroupJoinType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
