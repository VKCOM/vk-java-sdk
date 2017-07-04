package com.vk.api.sdk.streaming.objects;

import com.google.gson.annotations.SerializedName;

/**
 * Streaming event author object
 */
public class StreamingEventAuthor {

    @SerializedName("id")
    private Integer id;

    @SerializedName("platform")
    private StreamingPlatform platform;

    public Integer getId() {
        return id;
    }

    public StreamingPlatform getPlatform() {
        return platform;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingEventAuthor{");
        sb.append("id=").append(id);
        sb.append(", platform=").append(platform);
        sb.append('}');
        return sb.toString();
    }
}
