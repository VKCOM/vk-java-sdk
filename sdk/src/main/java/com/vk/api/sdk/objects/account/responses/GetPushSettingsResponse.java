package com.vk.api.sdk.objects.account.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.account.PushConversations;
import com.vk.api.sdk.objects.account.PushParams;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * GetPushSettingsResponse object
 */
public class GetPushSettingsResponse implements Validable {
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
        return disabled == BoolInt.YES;
    }

    public BoolInt getDisabled() {
        return disabled;
    }

    public Integer getDisabledUntil() {
        return disabledUntil;
    }

    public GetPushSettingsResponse setDisabledUntil(Integer disabledUntil) {
        this.disabledUntil = disabledUntil;
        return this;
    }

    public PushParams getSettings() {
        return settings;
    }

    public GetPushSettingsResponse setSettings(PushParams settings) {
        this.settings = settings;
        return this;
    }

    public PushConversations getConversations() {
        return conversations;
    }

    public GetPushSettingsResponse setConversations(PushConversations conversations) {
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
        GetPushSettingsResponse getPushSettingsResponse = (GetPushSettingsResponse) o;
        return Objects.equals(settings, getPushSettingsResponse.settings) &&
                Objects.equals(disabledUntil, getPushSettingsResponse.disabledUntil) &&
                Objects.equals(disabled, getPushSettingsResponse.disabled) &&
                Objects.equals(conversations, getPushSettingsResponse.conversations);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetPushSettingsResponse{");
        sb.append("settings=").append(settings);
        sb.append(", disabledUntil=").append(disabledUntil);
        sb.append(", disabled=").append(disabled);
        sb.append(", conversations=").append(conversations);
        sb.append('}');
        return sb.toString();
    }
}
