package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

public class ButtonAction {

    @SerializedName("type")
    private ButtonActionType type;

    @SerializedName("label")
    private String label;

    @SerializedName("payload")
    private String payload;

    public ButtonAction(ButtonActionType type, String label, String payload) {
        this.type = type;
        this.label = label;
        this.payload = payload;
    }

}
