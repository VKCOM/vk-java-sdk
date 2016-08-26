package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * RejectReason object
 */
public class RejectReason {
    /**
     * Comment text
     */
    @SerializedName("comment")
    private String comment;

    @SerializedName("rules")
    private List<Rules> rules;

    public String getComment() {
        return comment;
    }

    public List<Rules> getRules() {
        return rules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, rules);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RejectReason rejectReason = (RejectReason) o;
        return Objects.equals(comment, rejectReason.comment) &&
                Objects.equals(rules, rejectReason.rules);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RejectReason{");
        sb.append("comment='").append(comment).append("'");
        sb.append(", rules=").append(rules);
        sb.append('}');
        return sb.toString();
    }
}
