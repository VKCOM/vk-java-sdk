package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Campaign object
 */
public class Campaign implements Validable {
    /**
     * Campaign's total limit, rubles
     */
    @SerializedName("all_limit")
    private String allLimit;

    /**
     * Campaign's day limit, rubles
     */
    @SerializedName("day_limit")
    private String dayLimit;

    /**
     * Campaign ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Campaign title
     */
    @SerializedName("name")
    @Required
    private String name;

    /**
     * Campaign start time, as Unixtime
     */
    @SerializedName("start_time")
    private Integer startTime;

    @SerializedName("status")
    @Required
    private CampaignStatus status;

    /**
     * Campaign stop time, as Unixtime
     */
    @SerializedName("stop_time")
    private Integer stopTime;

    @SerializedName("type")
    @Required
    private CampaignType type;

    public String getAllLimit() {
        return allLimit;
    }

    public Campaign setAllLimit(String allLimit) {
        this.allLimit = allLimit;
        return this;
    }

    public String getDayLimit() {
        return dayLimit;
    }

    public Campaign setDayLimit(String dayLimit) {
        this.dayLimit = dayLimit;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Campaign setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Campaign setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Campaign setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    public CampaignStatus getStatus() {
        return status;
    }

    public Campaign setStatus(CampaignStatus status) {
        this.status = status;
        return this;
    }

    public Integer getStopTime() {
        return stopTime;
    }

    public Campaign setStopTime(Integer stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    public CampaignType getType() {
        return type;
    }

    public Campaign setType(CampaignType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayLimit, allLimit, name, startTime, stopTime, id, type, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campaign campaign = (Campaign) o;
        return Objects.equals(allLimit, campaign.allLimit) &&
                Objects.equals(startTime, campaign.startTime) &&
                Objects.equals(stopTime, campaign.stopTime) &&
                Objects.equals(dayLimit, campaign.dayLimit) &&
                Objects.equals(name, campaign.name) &&
                Objects.equals(id, campaign.id) &&
                Objects.equals(type, campaign.type) &&
                Objects.equals(status, campaign.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Campaign{");
        sb.append("allLimit='").append(allLimit).append("'");
        sb.append(", startTime=").append(startTime);
        sb.append(", stopTime=").append(stopTime);
        sb.append(", dayLimit='").append(dayLimit).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
