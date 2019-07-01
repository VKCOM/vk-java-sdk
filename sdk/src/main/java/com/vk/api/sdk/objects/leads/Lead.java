package com.vk.api.sdk.objects.leads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Lead object
 */
public class Lead implements Validable {
    /**
     * Completed offers number
     */
    @SerializedName("completed")
    private Integer completed;

    /**
     * Offer cost
     */
    @SerializedName("cost")
    private Integer cost;

    @SerializedName("days")
    private LeadDays days;

    /**
     * Impressions number
     */
    @SerializedName("impressions")
    private Integer impressions;

    /**
     * Lead limit
     */
    @SerializedName("limit")
    private Integer limit;

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

    public Lead setCompleted(Integer completed) {
        this.completed = completed;
        return this;
    }

    public Integer getCost() {
        return cost;
    }

    public Lead setCost(Integer cost) {
        this.cost = cost;
        return this;
    }

    public LeadDays getDays() {
        return days;
    }

    public Lead setDays(LeadDays days) {
        this.days = days;
        return this;
    }

    public Integer getImpressions() {
        return impressions;
    }

    public Lead setImpressions(Integer impressions) {
        this.impressions = impressions;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public Lead setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getSpent() {
        return spent;
    }

    public Lead setSpent(Integer spent) {
        this.spent = spent;
        return this;
    }

    public Integer getStarted() {
        return started;
    }

    public Lead setStarted(Integer started) {
        this.started = started;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, spent, limit, days, started, completed, impressions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return Objects.equals(cost, lead.cost) &&
                Objects.equals(spent, lead.spent) &&
                Objects.equals(limit, lead.limit) &&
                Objects.equals(days, lead.days) &&
                Objects.equals(started, lead.started) &&
                Objects.equals(completed, lead.completed) &&
                Objects.equals(impressions, lead.impressions);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Lead{");
        sb.append("cost=").append(cost);
        sb.append(", spent=").append(spent);
        sb.append(", limit=").append(limit);
        sb.append(", days=").append(days);
        sb.append(", started=").append(started);
        sb.append(", completed=").append(completed);
        sb.append(", impressions=").append(impressions);
        sb.append('}');
        return sb.toString();
    }
}
