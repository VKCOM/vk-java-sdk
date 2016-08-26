package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * ChatPushSettings object
 */
public class ChatPushSettings {
    /**
     * Information whether the sound is on
     */
    @SerializedName("sound")
    private BoolInt sound;

    /**
     * Time until that notifications are disabled
     */
    @SerializedName("disabled_until")
    private Integer disabledUntil;

    public boolean isSound() {
        return sound == BoolInt.YES;
    }

    public Integer getDisabledUntil() {
        return disabledUntil;
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
        return Objects.equals(sound, chatPushSettings.sound) &&
                Objects.equals(disabledUntil, chatPushSettings.disabledUntil);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChatPushSettings{");
        sb.append("sound=").append(sound);
        sb.append(", disabledUntil=").append(disabledUntil);
        sb.append('}');
        return sb.toString();
    }
}
