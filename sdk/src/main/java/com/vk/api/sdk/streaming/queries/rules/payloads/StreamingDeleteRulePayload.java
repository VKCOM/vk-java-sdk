package com.vk.api.sdk.streaming.queries.rules.payloads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Payload for delete rule query
 */
public class StreamingDeleteRulePayload {

    @SerializedName("tag")
    private String tag;

    public StreamingDeleteRulePayload(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreamingDeleteRulePayload that = (StreamingDeleteRulePayload) o;
        return Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingDeleteRulePayload{");
        sb.append("tag='").append(tag).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
