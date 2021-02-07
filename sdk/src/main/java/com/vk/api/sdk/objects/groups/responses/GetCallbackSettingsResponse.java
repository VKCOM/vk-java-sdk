package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.groups.LongPollEvents;
import java.util.Objects;

/**
 * GetCallbackSettingsResponse object
 */
public class GetCallbackSettingsResponse implements Validable {
    /**
     * API version used for the events
     */
    @SerializedName("api_version")
    private String apiVersion;

    @SerializedName("events")
    private LongPollEvents events;

    public String getApiVersion() {
        return apiVersion;
    }

    public GetCallbackSettingsResponse setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public LongPollEvents getEvents() {
        return events;
    }

    public GetCallbackSettingsResponse setEvents(LongPollEvents events) {
        this.events = events;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, events);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCallbackSettingsResponse getCallbackSettingsResponse = (GetCallbackSettingsResponse) o;
        return Objects.equals(apiVersion, getCallbackSettingsResponse.apiVersion) &&
                Objects.equals(events, getCallbackSettingsResponse.events);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCallbackSettingsResponse{");
        sb.append("apiVersion='").append(apiVersion).append("'");
        sb.append(", events=").append(events);
        sb.append('}');
        return sb.toString();
    }
}
