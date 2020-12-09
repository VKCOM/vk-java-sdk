package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.ads.Rules;
import java.util.List;
import java.util.Objects;

/**
 * GetRejectionReasonResponse object
 */
public class GetRejectionReasonResponse implements Validable {
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

    public GetRejectionReasonResponse setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public List<Rules> getRules() {
        return rules;
    }

    public GetRejectionReasonResponse setRules(List<Rules> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, rules);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRejectionReasonResponse getRejectionReasonResponse = (GetRejectionReasonResponse) o;
        return Objects.equals(comment, getRejectionReasonResponse.comment) &&
                Objects.equals(rules, getRejectionReasonResponse.rules);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetRejectionReasonResponse{");
        sb.append("comment='").append(comment).append("'");
        sb.append(", rules=").append(rules);
        sb.append('}');
        return sb.toString();
    }
}
