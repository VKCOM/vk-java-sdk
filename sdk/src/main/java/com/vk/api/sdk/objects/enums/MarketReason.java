package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Complaint reason. Possible values: *'0' — spam,, *'1' — child porn,, *'2' — extremism,, *'3' — violence,, *'4' — drugs propaganda,, *'5' — adult materials,, *'6' — insult. */
public enum MarketReason implements EnumParam {
    @SerializedName("0")
    SPAM(0),

    @SerializedName("1")
    CHILD_PORNOGRAPHY(1),

    @SerializedName("2")
    EXTREMISM(2),

    @SerializedName("3")
    VIOLENCE(3),

    @SerializedName("4")
    DRUG_PROPAGANDA(4),

    @SerializedName("5")
    ADULT_MATERIAL(5),

    @SerializedName("6")
    INSULT_ABUSE(6);

    private final Integer value;

    MarketReason(Integer value) {
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
