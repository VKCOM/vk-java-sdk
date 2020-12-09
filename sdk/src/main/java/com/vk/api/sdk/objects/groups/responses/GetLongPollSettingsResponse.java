package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.LongPollEvents;
import java.util.Objects;

/**
 * GetLongPollSettingsResponse object
 */
public class GetLongPollSettingsResponse implements Validable {
    /**
     * API version used for the events
     */
    @SerializedName("api_version")
    private String apiVersion;

    @SerializedName("events")
    @Required
    private LongPollEvents events;

    /**
     * Shows whether Long Poll is enabled
     */
    @SerializedName("is_enabled")
    private Boolean isEnabled;

    public String getApiVersion() {
        return apiVersion;
    }

    public GetLongPollSettingsResponse setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public LongPollEvents getEvents() {
        return events;
    }

    public GetLongPollSettingsResponse setEvents(LongPollEvents events) {
        this.events = events;
        return this;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public GetLongPollSettingsResponse setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, isEnabled, events);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLongPollSettingsResponse getLongPollSettingsResponse = (GetLongPollSettingsResponse) o;
        return Objects.equals(isEnabled, getLongPollSettingsResponse.isEnabled) &&
                Objects.equals(apiVersion, getLongPollSettingsResponse.apiVersion) &&
                Objects.equals(events, getLongPollSettingsResponse.events);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetLongPollSettingsResponse{");
        sb.append("isEnabled=").append(isEnabled);
        sb.append(", apiVersion='").append(apiVersion).append("'");
        sb.append(", events=").append(events);
        sb.append('}');
        return sb.toString();
    }
}
