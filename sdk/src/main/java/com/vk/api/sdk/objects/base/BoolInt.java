package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.deserializers.BoolIntDeserializer;

@JsonAdapter(BoolIntDeserializer.class)
public enum BoolInt {
    @SerializedName("0")
    NO(0),

    @SerializedName("1")
    YES(1);

    private final Integer value;

    BoolInt(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
