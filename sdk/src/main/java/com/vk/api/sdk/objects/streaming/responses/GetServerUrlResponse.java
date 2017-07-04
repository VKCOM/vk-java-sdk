package com.vk.api.sdk.objects.streaming.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * GetServerUrlResponse object
 */
public class GetServerUrlResponse {

    /**
     * Server host
     */
    @SerializedName("endpoint")
    private String endpoint;

    /**
     * Access key.
     * Key has endless lifetime and revokes only then new key has been received.
     */
    @SerializedName("key")
    private String key;

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
        GetServerUrlResponse that = (GetServerUrlResponse) o;
        return Objects.equals(endpoint, that.endpoint) &&
                Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, key);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetServerUrlResponse{");
        sb.append("endpoint='").append(endpoint).append('\'');
        sb.append(", key='").append(key).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
