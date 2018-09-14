package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

public class Button {

    @SerializedName("action")
    private ButtonAction action;

    @SerializedName("color")
    private ButtonColor color;

    public Button(ButtonAction action, ButtonColor color) {
        this.action = action;
        this.color = color;
    }

}
