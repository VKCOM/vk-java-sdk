package com.vk.api.sdk.streaming.objects;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Streaming rule object
 */
public class StreamingRule {

    @SerializedName("tag")
    private String tag;

    @SerializedName("value")
    private String value;

    public String getTag() {
        return tag;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreamingRule that = (StreamingRule) o;
        return Objects.equals(tag, that.tag) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingRule{");
        sb.append("tag='").append(tag).append('\'');
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
