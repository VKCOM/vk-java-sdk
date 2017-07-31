package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.stats.WallpostStat;

import java.util.Objects;

/**
 * PostStats object
 */
public class PostStats extends WallpostStat {
    /**
     * Object ID
     */
    @SerializedName("ad_id")
    private Integer adId;

    public Integer getAdId() {
        return adId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), adId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PostStats postStats = (PostStats) o;
        return Objects.equals(adId, postStats.adId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PostStats{");
        sb.append("adId=").append(adId);
        sb.append(", hide=").append(getHide());
        sb.append(", joinGroup=").append(getJoinGroup());
        sb.append(", links=").append(getLinks());
        sb.append(", reachSubscribers=").append(getReachSubscribers());
        sb.append(", reachTotal=").append(getReachTotal());
        sb.append(", report=").append(getReport());
        sb.append(", toGroup=").append(getToGroup());
        sb.append(", unsubscribe=").append(getUnsubscribe());
        sb.append('}');
        return sb.toString();
    }
}
