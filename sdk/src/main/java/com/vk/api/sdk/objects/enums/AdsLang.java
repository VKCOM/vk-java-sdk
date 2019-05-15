package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
public enum AdsLang implements EnumParam {
    @SerializedName("ru")
    RUSSIAN("ru"),

    @SerializedName("ua")
    UKRAINIAN("ua"),

    @SerializedName("en")
    ENGLISH("en");

    private final String value;

    AdsLang(String value) {
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
