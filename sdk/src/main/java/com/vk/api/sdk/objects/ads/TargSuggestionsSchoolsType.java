package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

/**
 * School type
 */
public enum TargSuggestionsSchoolsType {
    @SerializedName("school")
    SCHOOL("school"),

    @SerializedName("university")
    UNIVERSITY("university"),

    @SerializedName("faculty")
    FACULTY("faculty"),

    @SerializedName("chair")
    CHAIR("chair");

    private final String value;

    TargSuggestionsSchoolsType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
