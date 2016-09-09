package com.vk.api.examples.youtrack.callback;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Anton Tsivarev on 09.09.16.
 */
public enum CallbackVkType {

    @SerializedName("confirmation")
    CONFIRMATION("confirmation"),

    @SerializedName("message_new")
    MESSAGE_NEW("message_new");

    private final String value;

    CallbackVkType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
