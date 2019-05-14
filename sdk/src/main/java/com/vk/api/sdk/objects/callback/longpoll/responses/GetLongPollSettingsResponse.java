package com.vk.api.sdk.objects.callback.longpoll.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.LongPollServerSettings;

import java.util.Objects;

public class GetLongPollSettingsResponse {

    @SerializedName("is_enabled")
    private Boolean isEnabled;

    @SerializedName("events")
    private LongPollServerSettings events;

    public Boolean isEnabled() {
        return isEnabled;
    }

    public LongPollServerSettings getEvents() {
        return events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLongPollSettingsResponse that = (GetLongPollSettingsResponse) o;
        return Objects.equals(isEnabled, that.isEnabled) &&
                Objects.equals(events, that.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEnabled, events);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetLongPollSettingsResponse{");
        sb.append("isEnabled=").append(isEnabled);
        sb.append(", events=").append(events);
        sb.append('}');
        return sb.toString();
    }
}