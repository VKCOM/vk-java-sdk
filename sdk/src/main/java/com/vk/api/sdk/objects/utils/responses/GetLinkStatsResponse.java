package com.vk.api.sdk.objects.utils.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.utils.Stats;
import java.util.List;
import java.util.Objects;

/**
 * GetLinkStatsResponse object
 */
public class GetLinkStatsResponse implements Validable {
    /**
     * Link key (characters after vk.cc/)
     */
    @SerializedName("key")
    private String key;

    @SerializedName("stats")
    private List<Stats> stats;

    public String getKey() {
        return key;
    }

    public GetLinkStatsResponse setKey(String key) {
        this.key = key;
        return this;
    }

    public List<Stats> getStats() {
        return stats;
    }

    public GetLinkStatsResponse setStats(List<Stats> stats) {
        this.stats = stats;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stats, key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLinkStatsResponse getLinkStatsResponse = (GetLinkStatsResponse) o;
        return Objects.equals(stats, getLinkStatsResponse.stats) &&
                Objects.equals(key, getLinkStatsResponse.key);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetLinkStatsResponse{");
        sb.append("stats=").append(stats);
        sb.append(", key='").append(key).append("'");
        sb.append('}');
        return sb.toString();
    }
}
