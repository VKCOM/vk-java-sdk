package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

public class Keyboard {

    @SerializedName("one_time")
    private Boolean oneTime;

    @SerializedName("buttons")
    private Button[][] buttons;

    public Keyboard(Boolean oneTime, Button[]... buttons) {
        this.oneTime = oneTime;
        this.buttons = buttons;
    }

}
