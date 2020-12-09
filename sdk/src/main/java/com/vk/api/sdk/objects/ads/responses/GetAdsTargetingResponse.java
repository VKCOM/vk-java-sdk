package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.ads.Criteria;
import java.util.Objects;

/**
 * GetAdsTargetingResponse object
 */
public class GetAdsTargetingResponse extends Criteria implements Validable {
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

    public GetAdsTargetingResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public GetAdsTargetingResponse setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignId, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAdsTargetingResponse getAdsTargetingResponse = (GetAdsTargetingResponse) o;
        return Objects.equals(id, getAdsTargetingResponse.id) &&
                Objects.equals(campaignId, getAdsTargetingResponse.campaignId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAdsTargetingResponse{");
        sb.append("id=").append(id);
        sb.append(", campaignId=").append(campaignId);
        sb.append('}');
        return sb.toString();
    }
}
