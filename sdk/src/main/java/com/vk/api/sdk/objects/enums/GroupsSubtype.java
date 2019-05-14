package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Public page subtype. Possible values: *'1' – place or small business,, *'2' – company, organization or website,, *'3' – famous person or group of people,, *'4' – product or work of art.
 */
public enum GroupsSubtype implements EnumParam {
    @SerializedName("1")
    PLACE_OR_BUSINESS(1),

    @SerializedName("2")
    COMPANY_OR_WEBSITE(2),

    @SerializedName("3")
    PERSON_OR_GROUP(3),

    @SerializedName("4")
    PRODUCT_OR_ART(4);

    private final Integer value;

    GroupsSubtype(Integer value) {
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
