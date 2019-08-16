package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Relative type */
public enum RelativeType implements EnumParam {
    @SerializedName("parent")
    PARENT("parent"),

    @SerializedName("child")
    CHILD("child"),

    @SerializedName("grandparent")
    GRANDPARENT("grandparent"),

    @SerializedName("grandchild")
    GRANDCHILD("grandchild"),

    @SerializedName("sibling")
    SIBLING("sibling");

    private final String value;

    RelativeType(String value) {
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
