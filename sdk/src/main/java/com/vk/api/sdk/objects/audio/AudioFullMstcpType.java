package com.vk.api.sdk.objects.audio;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Audio type */
public enum AudioFullMstcpType implements EnumParam {
    @SerializedName("0")
    UGC(0),

    @SerializedName("1")
    MASTER_COPY(1),

    @SerializedName("2")
    COPY_OF_MASTER_COPY(2);

    private final Integer value;

    AudioFullMstcpType(Integer value) {
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
