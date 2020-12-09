package com.vk.api.sdk.objects.adsweb.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * GetAdUnitsResponse object
 */
public class GetAdUnitsResponse implements Validable {
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("ad_units")
    private List<GetAdUnitsResponseAdUnitsAdUnit> adUnits;

    public Integer getCount() {
        return count;
    }

    public GetAdUnitsResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<GetAdUnitsResponseAdUnitsAdUnit> getAdUnits() {
        return adUnits;
    }

    public GetAdUnitsResponse setAdUnits(List<GetAdUnitsResponseAdUnitsAdUnit> adUnits) {
        this.adUnits = adUnits;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, adUnits);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAdUnitsResponse getAdUnitsResponse = (GetAdUnitsResponse) o;
        return Objects.equals(adUnits, getAdUnitsResponse.adUnits) &&
                Objects.equals(count, getAdUnitsResponse.count);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAdUnitsResponse{");
        sb.append("adUnits=").append(adUnits);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
