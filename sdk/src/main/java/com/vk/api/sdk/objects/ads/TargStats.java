package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * TargStats object
 */
public class TargStats implements Validable {
    /**
     * Audience
     */
    @SerializedName("audience_count")
    private Integer audienceCount;

    /**
     * Recommended CPC value
     */
    @SerializedName("recommended_cpc")
    private Float recommendedCpc;

    /**
     * Recommended CPM value
     */
    @SerializedName("recommended_cpm")
    private Float recommendedCpm;

    public Integer getAudienceCount() {
        return audienceCount;
    }

    public TargStats setAudienceCount(Integer audienceCount) {
        this.audienceCount = audienceCount;
        return this;
    }

    public Float getRecommendedCpc() {
        return recommendedCpc;
    }

    public TargStats setRecommendedCpc(Float recommendedCpc) {
        this.recommendedCpc = recommendedCpc;
        return this;
    }

    public Float getRecommendedCpm() {
        return recommendedCpm;
    }

    public TargStats setRecommendedCpm(Float recommendedCpm) {
        this.recommendedCpm = recommendedCpm;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendedCpm, audienceCount, recommendedCpc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargStats targStats = (TargStats) o;
        return Objects.equals(recommendedCpc, targStats.recommendedCpc) &&
                Objects.equals(audienceCount, targStats.audienceCount) &&
                Objects.equals(recommendedCpm, targStats.recommendedCpm);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("TargStats{");
        sb.append("recommendedCpc=").append(recommendedCpc);
        sb.append(", audienceCount=").append(audienceCount);
        sb.append(", recommendedCpm=").append(recommendedCpm);
        sb.append('}');
        return sb.toString();
    }
}
