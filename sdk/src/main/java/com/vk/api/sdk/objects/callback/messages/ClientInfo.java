package com.vk.api.sdk.objects.callback.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.callback.MessageType;

import java.util.Objects;

public class ClientInfo {

    @SerializedName("button_actions")
    private ButtonActions buttonActions;

    @SerializedName("keyboard")
    private Boolean keyboard;

    @SerializedName("inline_keyboard")
    private Boolean inlineKeyboard;

    @SerializedName("lang_id")
    private Integer langId;

    public boolean isKeyboardSupport(){
        return keyboard;
    }

    public boolean isInlineKeyboardSupport(){
        return inlineKeyboard;
    }

    public Integer getLangId() {
        return langId;
    }

    public ButtonActions getButtonActions() {
        return buttonActions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientInfo that = (ClientInfo) o;
        return buttonActions == that.buttonActions &&
                Objects.equals(keyboard, that.keyboard) &&
                Objects.equals(inlineKeyboard, that.inlineKeyboard) &&
                Objects.equals(langId, that.langId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buttonActions, keyboard, inlineKeyboard, langId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientInfo{");
        sb.append("buttonActions=").append(buttonActions);
        sb.append(", keyboard=").append(keyboard);
        sb.append(", inlineKeyboard=").append(inlineKeyboard);
        sb.append(", langId=").append(langId);
        sb.append('}');
        return sb.toString();
    }
}
