package com.vk.api.sdk.objects.adsweb.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * GetSitesResponse object
 */
public class GetSitesResponse implements Validable {
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("sites")
    private List<GetSitesResponseSitesSite> sites;

    public Integer getCount() {
        return count;
    }

    public GetSitesResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<GetSitesResponseSitesSite> getSites() {
        return sites;
    }

    public GetSitesResponse setSites(List<GetSitesResponseSitesSite> sites) {
        this.sites = sites;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, sites);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSitesResponse getSitesResponse = (GetSitesResponse) o;
        return Objects.equals(count, getSitesResponse.count) &&
                Objects.equals(sites, getSitesResponse.sites);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSitesResponse{");
        sb.append("count=").append(count);
        sb.append(", sites=").append(sites);
        sb.append('}');
        return sb.toString();
    }
}
