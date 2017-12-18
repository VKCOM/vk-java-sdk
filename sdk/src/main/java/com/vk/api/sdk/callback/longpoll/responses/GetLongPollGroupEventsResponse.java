package com.vk.api.sdk.callback.longpoll.responses;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class GetLongPollGroupEventsResponse {

    @SerializedName("timestamp")
    private Integer timestamp;

    @SerializedName("updates")
    private List<JsonObject> updates;

    public Integer getTimestamp() {
        return timestamp;
    }

    public List<JsonObject> getUpdates() {
        return updates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLongPollGroupEventsResponse that = (GetLongPollGroupEventsResponse) o;
        return Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(updates, that.updates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, updates);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetEventsResponse{");
        sb.append("timestamp=").append(timestamp);
        sb.append(", updates=").append(updates);
        sb.append('}');
        return sb.toString();
    }
}

