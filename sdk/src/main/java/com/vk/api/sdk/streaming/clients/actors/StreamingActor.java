package com.vk.api.sdk.streaming.clients.actors;

import java.util.Objects;

/**
 * Actor for Streaming API
 */
public class StreamingActor {

    private String endpoint;

    private String key;

    public StreamingActor(String endpoint, String key) {
        this.endpoint = endpoint;
        this.key = key;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getKey() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreamingActor that = (StreamingActor) o;
        return Objects.equals(endpoint, that.endpoint) &&
                Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, key);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingActor{");
        sb.append("endpoint='").append(endpoint).append('\'');
        sb.append(", key='").append(key).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
