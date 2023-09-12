package com.vk.api.sdk.objects.callback.longpoll.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
import java.net.URI;

public class GetLongPollServerResponse {

    @SerializedName("key")
    private String key;

    @SerializedName("server")
    private URI server;

    @SerializedName("ts")
    private String ts;

    public String getKey() {
        return key;
    }

    public URI getServer() {
        return server;
    }

    public String getTs() {
        return ts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLongPollServerResponse that = (GetLongPollServerResponse) o;
        return Objects.equals(key, that.key) &&
                Objects.equals(server, that.server) &&
                Objects.equals(ts, that.ts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, server, ts);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetLongPollServerResponse{");
        sb.append("key='").append(key).append('\'');
        sb.append(", server='").append(server.toString()).append('\'');
        sb.append(", ts=").append(ts);
        sb.append('}');
        return sb.toString();
    }
}
