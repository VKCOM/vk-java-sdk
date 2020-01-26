package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * ChatPushSettings object
 */
public class ChatPushSettings implements Validable {
    /**
     * Time until that notifications are disabled
     */
    @SerializedName("disabled_until")
    private Integer disabledUntil;

    /**
     * Information whether the sound is on
     */
    @SerializedName("sound")
    private BoolInt sound;

    public Integer getDisabledUntil() {
        return disabledUntil;
    }

    public ChatPushSettings setDisabledUntil(Integer disabledUntil) {
        this.disabledUntil = disabledUntil;
        return this;
    }

    public boolean isSound() {
        return sound == BoolInt.YESBOOL;
    }

    public BoolInt getSound() {
        return sound;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sound, disabledUntil);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatPushSettings chatPushSettings = (ChatPushSettings) o;
        return Objects.equals(disabledUntil, chatPushSettings.disabledUntil) &&
                Objects.equals(sound, chatPushSettings.sound);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ChatPushSettings{");
        sb.append("disabledUntil=").append(disabledUntil);
        sb.append(", sound=").append(sound);
        sb.append('}');
        return sb.toString();
    }
}
