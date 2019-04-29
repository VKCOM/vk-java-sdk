package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Type of complaint: 'porn' – pornography, 'spam' – spamming, 'insult' – abusive behavior, 'advertisment' – disruptive advertisements
 */
public enum UsersType implements EnumParam {
    @SerializedName("porn")
    PORN("porn"),

    @SerializedName("spam")
    SPAM("spam"),

    @SerializedName("insult")
    INSULT("insult"),

    @SerializedName("advertisment")
    ADVERTISMENT("advertisment");

    private final String value;

    UsersType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
