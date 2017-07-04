package com.vk.api.sdk.streaming.objects.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.streaming.objects.StreamingRule;

import java.util.List;
import java.util.Objects;

/**
 * Response object for GET /rules request
 */
public class StreamingGetRulesResponse extends StreamingResponse {

    @SerializedName("rules")
    private List<StreamingRule> rules;

    public List<StreamingRule> getRules() {
        return rules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StreamingGetRulesResponse that = (StreamingGetRulesResponse) o;
        return Objects.equals(rules, that.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rules);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingGetRulesResponse{");
        sb.append("rules=").append(rules);
        sb.append('}');
        return sb.toString();
    }
}
