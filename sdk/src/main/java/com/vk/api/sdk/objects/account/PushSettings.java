package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * PushSettings object
 */
public class PushSettings {
    /**
     * Information whether notifications are disabled
     */
    @SerializedName("disabled")
    private BoolInt disabled;

    /**
     * Time until that notifications are disabled in Unixtime
     */
    @SerializedName("disabled_until")
    private Integer disabledUntil;

    @SerializedName("conversations")
    private PushConversations conversations;

    @SerializedName("settings")
    private PushParams settings;

    public boolean isDisabled() {
        return disabled == BoolInt.YES;
    }

    public Integer getDisabledUntil() {
        return disabledUntil;
    }

    public PushConversations getConversations() {
        return conversations;
    }

    public PushParams getSettings() {
        return settings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(settings, disabled, disabledUntil, conversations);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PushSettings pushSettings = (PushSettings) o;
        return Objects.equals(disabled, pushSettings.disabled) &&
                Objects.equals(disabledUntil, pushSettings.disabledUntil) &&
                Objects.equals(conversations, pushSettings.conversations) &&
                Objects.equals(settings, pushSettings.settings);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PushSettings{");
        sb.append("disabled=").append(disabled);
        sb.append(", disabledUntil=").append(disabledUntil);
        sb.append(", conversations=").append(conversations);
        sb.append(", settings=").append(settings);
        sb.append('}');
        return sb.toString();
    }
}
