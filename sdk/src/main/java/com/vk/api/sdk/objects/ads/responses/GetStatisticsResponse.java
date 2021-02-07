package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.ads.ObjectType;
import com.vk.api.sdk.objects.ads.StatsFormat;
import com.vk.api.sdk.objects.ads.StatsViewsTimes;
import java.util.Objects;

/**
 * GetStatisticsResponse object
 */
public class GetStatisticsResponse implements Validable {
    /**
     * Object ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("stats")
    private StatsFormat stats;

    @SerializedName("type")
    private ObjectType type;

    @SerializedName("views_times")
    private StatsViewsTimes viewsTimes;

    public Integer getId() {
        return id;
    }

    public GetStatisticsResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public StatsFormat getStats() {
        return stats;
    }

    public GetStatisticsResponse setStats(StatsFormat stats) {
        this.stats = stats;
        return this;
    }

    public ObjectType getType() {
        return type;
    }

    public GetStatisticsResponse setType(ObjectType type) {
        this.type = type;
        return this;
    }

    public StatsViewsTimes getViewsTimes() {
        return viewsTimes;
    }

    public GetStatisticsResponse setViewsTimes(StatsViewsTimes viewsTimes) {
        this.viewsTimes = viewsTimes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stats, id, type, viewsTimes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetStatisticsResponse getStatisticsResponse = (GetStatisticsResponse) o;
        return Objects.equals(stats, getStatisticsResponse.stats) &&
                Objects.equals(viewsTimes, getStatisticsResponse.viewsTimes) &&
                Objects.equals(id, getStatisticsResponse.id) &&
                Objects.equals(type, getStatisticsResponse.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetStatisticsResponse{");
        sb.append("stats=").append(stats);
        sb.append(", viewsTimes=").append(viewsTimes);
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
