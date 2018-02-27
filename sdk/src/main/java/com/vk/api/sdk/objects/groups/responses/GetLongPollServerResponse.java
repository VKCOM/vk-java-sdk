package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class GetLongPollServerResponse {

    @SerializedName("key")
    private String key;

    @SerializedName("server")
    private String server;

    @SerializedName("ts")
    private Integer ts;

    public String getKey() {
        return key;
    }

    public String getServer() {
        return server;
    }

    public Integer getTs() {
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
        sb.append(", server='").append(server).append('\'');
        sb.append(", ts=").append(ts);
        sb.append('}');
        return sb.toString();
    }
}
