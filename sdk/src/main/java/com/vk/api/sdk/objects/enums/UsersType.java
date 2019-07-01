package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Type of complaint: 'porn' – pornography, 'spam' – spamming, 'insult' – abusive behavior, 'advertisement' – disruptive advertisements
 */
public enum UsersType implements EnumParam {
    @SerializedName("porn")
    PORN("porn"),

    @SerializedName("spam")
    SPAM("spam"),

    @SerializedName("insult")
    INSULT("insult"),

    @SerializedName("advertisement")
    ADVERTISEMENT("advertisement");

    private final String value;

    UsersType(String value) {
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
