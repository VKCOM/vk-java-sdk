package com.vk.api.sdk.objects.leads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * LeadDays object
 */
public class LeadDays implements Validable {
    /**
     * Completed offers number
     */
    @SerializedName("completed")
    private Integer completed;

    /**
     * Impressions number
     */
    @SerializedName("impressions")
    private Integer impressions;

    /**
     * Amount of spent votes
     */
    @SerializedName("spent")
    private Integer spent;

    /**
     * Started offers number
     */
    @SerializedName("started")
    private Integer started;

    public Integer getCompleted() {
        return completed;
    }

    public LeadDays setCompleted(Integer completed) {
        this.completed = completed;
        return this;
    }

    public Integer getImpressions() {
        return impressions;
    }

    public LeadDays setImpressions(Integer impressions) {
        this.impressions = impressions;
        return this;
    }

    public Integer getSpent() {
        return spent;
    }

    public LeadDays setSpent(Integer spent) {
        this.spent = spent;
        return this;
    }

    public Integer getStarted() {
        return started;
    }

    public LeadDays setStarted(Integer started) {
        this.started = started;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(spent, started, completed, impressions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeadDays leadDays = (LeadDays) o;
        return Objects.equals(spent, leadDays.spent) &&
                Objects.equals(started, leadDays.started) &&
                Objects.equals(completed, leadDays.completed) &&
                Objects.equals(impressions, leadDays.impressions);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LeadDays{");
        sb.append("spent=").append(spent);
        sb.append(", started=").append(started);
        sb.append(", completed=").append(completed);
        sb.append(", impressions=").append(impressions);
        sb.append('}');
        return sb.toString();
    }
}
