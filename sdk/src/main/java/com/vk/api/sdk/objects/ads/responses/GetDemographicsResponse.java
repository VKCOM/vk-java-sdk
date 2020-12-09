package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.ads.DemostatsFormat;
import com.vk.api.sdk.objects.ads.ObjectType;
import java.util.Objects;

/**
 * GetDemographicsResponse object
 */
public class GetDemographicsResponse implements Validable {
    /**
     * Object ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("stats")
    private DemostatsFormat stats;

    @SerializedName("type")
    private ObjectType type;

    public Integer getId() {
        return id;
    }

    public GetDemographicsResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public DemostatsFormat getStats() {
        return stats;
    }

    public GetDemographicsResponse setStats(DemostatsFormat stats) {
        this.stats = stats;
        return this;
    }

    public ObjectType getType() {
        return type;
    }

    public GetDemographicsResponse setType(ObjectType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stats, id, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetDemographicsResponse getDemographicsResponse = (GetDemographicsResponse) o;
        return Objects.equals(stats, getDemographicsResponse.stats) &&
                Objects.equals(id, getDemographicsResponse.id) &&
                Objects.equals(type, getDemographicsResponse.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetDemographicsResponse{");
        sb.append("stats=").append(stats);
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
