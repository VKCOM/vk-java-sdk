package com.vk.api.sdk.objects.docs;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Doc attachment type */
public enum DocAttachmentType implements EnumParam {
    @SerializedName("doc")
    DOC("doc"),

    @SerializedName("graffiti")
    GRAFFITI("graffiti"),

    @SerializedName("audio_message")
    AUDIO_MESSAGE("audio_message");

    private final String value;

    DocAttachmentType(String value) {
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
