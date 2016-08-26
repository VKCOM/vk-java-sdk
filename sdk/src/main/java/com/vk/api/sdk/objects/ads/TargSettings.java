package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * TargSettings object
 */
public class TargSettings extends Criteria {
    /**
     * Ad ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Campaign ID
     */
    @SerializedName("campaign_id")
    private Integer campaignId;

    public Integer getId() {
        return id;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignId, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargSettings targSettings = (TargSettings) o;
        return Objects.equals(id, targSettings.id) &&
                Objects.equals(campaignId, targSettings.campaignId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TargSettings{");
        sb.append("id=").append(id);
        sb.append(", campaignId=").append(campaignId);
        sb.append('}');
        return sb.toString();
    }
}
