package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Campaign object
 */
public class Campaign {
    /**
     * Campaign ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Campaign type
     */
    @SerializedName("type")
    private CampaignType type;

    /**
     * Campaign title
     */
    @SerializedName("name")
    private Integer name;

    /**
     * Campaign status
     */
    @SerializedName("status")
    private CampaignStatus status;

    /**
     * Campaign's day limit, rubles
     */
    @SerializedName("day_limit")
    private String dayLimit;

    /**
     * Campaign's total limit, rubles
     */
    @SerializedName("all_limit")
    private String allLimit;

    /**
     * Campaign start time, as Unixtime
     */
    @SerializedName("start_time")
    private Integer startTime;

    /**
     * Campaign stop time, as Unixtime
     */
    @SerializedName("stop_time")
    private Integer stopTime;

    public Integer getId() {
        return id;
    }

    public CampaignType getType() {
        return type;
    }

    public Integer getName() {
        return name;
    }

    public CampaignStatus getStatus() {
        return status;
    }

    public String getDayLimit() {
        return dayLimit;
    }

    public String getAllLimit() {
        return allLimit;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Integer getStopTime() {
        return stopTime;
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
        return Objects.equals(id, campaign.id) &&
                Objects.equals(type, campaign.type) &&
                Objects.equals(name, campaign.name) &&
                Objects.equals(status, campaign.status) &&
                Objects.equals(dayLimit, campaign.dayLimit) &&
                Objects.equals(allLimit, campaign.allLimit) &&
                Objects.equals(startTime, campaign.startTime) &&
                Objects.equals(stopTime, campaign.stopTime);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Campaign{");
        sb.append("id=").append(id);
        sb.append(", type='").append(type).append("'");
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", dayLimit='").append(dayLimit).append("'");
        sb.append(", allLimit='").append(allLimit).append("'");
        sb.append(", startTime=").append(startTime);
        sb.append(", stopTime=").append(stopTime);
        sb.append('}');
        return sb.toString();
    }
}
