package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GroupsTagColor implements EnumParam {
    @SerializedName("454647")
    _454647("454647"),

    @SerializedName("45678f")
    _45678F("45678f"),

    @SerializedName("4bb34b")
    _4BB34B("4bb34b"),

    @SerializedName("5181b8")
    _5181B8("5181b8"),

    @SerializedName("539b9c")
    _539B9C("539b9c"),

    @SerializedName("5c9ce6")
    _5C9CE6("5c9ce6"),

    @SerializedName("63b9ba")
    _63B9BA("63b9ba"),

    @SerializedName("6bc76b")
    _6BC76B("6bc76b"),

    @SerializedName("76787a")
    _76787A("76787a"),

    @SerializedName("792ec0")
    _792EC0("792ec0"),

    @SerializedName("7a6c4f")
    _7A6C4F("7a6c4f"),

    @SerializedName("7ececf")
    _7ECECF("7ececf"),

    @SerializedName("9e8d6b")
    _9E8D6B("9e8d6b"),

    @SerializedName("a162de")
    A162DE("a162de"),

    @SerializedName("aaaeb3")
    AAAEB3("aaaeb3"),

    @SerializedName("bbaa84")
    BBAA84("bbaa84"),

    @SerializedName("e64646")
    E64646("e64646"),

    @SerializedName("ff5c5c")
    FF5C5C("ff5c5c"),

    @SerializedName("ffa000")
    FFA000("ffa000"),

    @SerializedName("ffc107")
    FFC107("ffc107");

    private final String value;

    GroupsTagColor(String value) {
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
