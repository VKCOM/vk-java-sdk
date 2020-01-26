package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum BoolInt implements EnumParam {
    @SerializedName("0")
    NOINT(0),

    @SerializedName("1")
    YESINT(1),

    @SerializedName("false")
    NOBOOL(0),

    @SerializedName("true")
    YESBOOL(1);

    private final Integer value;

    BoolInt(Integer value) {
        this.value = value;
    }

    BoolInt(Boolean value) {
        this.value = value ? 1 : 0;
    }

    public String getValue() {
        return value.toString();
    }

    public Integer getInteger(){
        return value;
    }

    public Boolean getBoolean(){
        return value == 1;
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
