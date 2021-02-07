package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetLongPollServerResponse object
 */
public class GetLongPollServerResponse implements Validable {
    /**
     * Long Poll key
     */
    @SerializedName("key")
    @Required
    private String key;

    /**
     * Long Poll server address
     */
    @SerializedName("server")
    @Required
    private String server;

    /**
     * Number of the last event
     */
    @SerializedName("ts")
    @Required
    private String ts;

    public String getKey() {
        return key;
    }

    public GetLongPollServerResponse setKey(String key) {
        this.key = key;
        return this;
    }

    public String getServer() {
        return server;
    }

    public GetLongPollServerResponse setServer(String server) {
        this.server = server;
        return this;
    }

    public String getTs() {
        return ts;
    }

    public GetLongPollServerResponse setTs(String ts) {
        this.ts = ts;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, key, ts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLongPollServerResponse getLongPollServerResponse = (GetLongPollServerResponse) o;
        return Objects.equals(server, getLongPollServerResponse.server) &&
                Objects.equals(key, getLongPollServerResponse.key) &&
                Objects.equals(ts, getLongPollServerResponse.ts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetLongPollServerResponse{");
        sb.append("server='").append(server).append("'");
        sb.append(", key='").append(key).append("'");
        sb.append(", ts='").append(ts).append("'");
        sb.append('}');
        return sb.toString();
    }
}
