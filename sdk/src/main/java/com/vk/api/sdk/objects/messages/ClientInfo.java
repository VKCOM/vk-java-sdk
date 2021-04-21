package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Geo;
import java.util.List;
import java.util.Objects;

/**
 * ClientInfo object
 */
public class ClientInfo implements Validable {
    @SerializedName("button_actions")
    private List<KeyboardButtonActionType> buttonActions;

    @SerializedName("keyboard")
    private Boolean keyboard;

    @SerializedName("inline_keyboard")
    private Boolean inlineKeyboard;

    @SerializedName("carousel")
    private Boolean carousel;

    @SerializedName("lang_id")
    private Integer lang_id;

    public List<KeyboardButtonActionType> getButtonActions() {
        return buttonActions;
    }

    public Boolean getKeyboard() {
        return keyboard;
    }

    public Boolean getInlineKeyboard() {
        return inlineKeyboard;
    }

    public Boolean getCarousel() {
        return carousel;
    }

    public Integer getLang_id() {
        return lang_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(buttonActions, keyboard, inlineKeyboard, carousel, lang_id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientInfo clientInfo = (ClientInfo) o;
        return Objects.equals(buttonActions, clientInfo.buttonActions) &&
                Objects.equals(keyboard, clientInfo.keyboard) &&
                Objects.equals(inlineKeyboard, clientInfo.inlineKeyboard) &&
                Objects.equals(carousel, clientInfo.carousel) &&
                Objects.equals(lang_id, clientInfo.lang_id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ClientInfo{");
        sb.append("buttonActions=").append(buttonActions);
        sb.append(", keyboard=").append(keyboard);
        sb.append(", inlineKeyboard=").append(inlineKeyboard);
        sb.append(", carousel=").append(carousel);
        sb.append(", lang_id=").append(lang_id);
        sb.append('}');
        return sb.toString();
    }
}
