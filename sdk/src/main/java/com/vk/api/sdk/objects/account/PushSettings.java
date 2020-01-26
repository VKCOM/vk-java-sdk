package com.vk.api.sdk.objects.account;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * PushSettings object
 */
public class PushSettings implements Validable {
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

    @SerializedName("settings")
    private PushParams settings;

    @SerializedName("conversations")
    private PushConversations conversations;

    public boolean isDisabled() {
        return disabled == BoolInt.YESBOOL;
    }

    public BoolInt getDisabled() {
        return disabled;
    }

    public Integer getDisabledUntil() {
        return disabledUntil;
    }

    public PushSettings setDisabledUntil(Integer disabledUntil) {
        this.disabledUntil = disabledUntil;
        return this;
    }

    public PushParams getSettings() {
        return settings;
    }

    public PushSettings setSettings(PushParams settings) {
        this.settings = settings;
        return this;
    }

    public PushConversations getConversations() {
        return conversations;
    }

    public PushSettings setConversations(PushConversations conversations) {
        this.conversations = conversations;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(settings, disabledUntil, disabled, conversations);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PushSettings pushSettings = (PushSettings) o;
        return Objects.equals(settings, pushSettings.settings) &&
                Objects.equals(disabledUntil, pushSettings.disabledUntil) &&
                Objects.equals(disabled, pushSettings.disabled) &&
                Objects.equals(conversations, pushSettings.conversations);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PushSettings{");
        sb.append("settings=").append(settings);
        sb.append(", disabledUntil=").append(disabledUntil);
        sb.append(", disabled=").append(disabled);
        sb.append(", conversations=").append(conversations);
        sb.append('}');
        return sb.toString();
    }
}
