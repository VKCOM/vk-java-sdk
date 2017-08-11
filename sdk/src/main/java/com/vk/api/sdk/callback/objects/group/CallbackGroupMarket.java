package com.vk.api.sdk.callback.objects.group;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Anton Tsivarev on 11.08.17.
 */
public enum CallbackGroupMarket {

    @SerializedName("0")
    DISABLED(0),

    @SerializedName("1")
    OPEN(1);

    private final Integer value;

    CallbackGroupMarket(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
