package com.vk.api.sdk.objects.adsweb.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetSitesResponseSitesSite object
 */
public class GetSitesResponseSitesSite implements Validable {
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("status_user")
    private String statusUser;

    @SerializedName("status_moder")
    private String statusModer;

    @SerializedName("domains")
    private String domains;

    public Integer getId() {
        return id;
    }

    public GetSitesResponseSitesSite setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getStatusUser() {
        return statusUser;
    }

    public GetSitesResponseSitesSite setStatusUser(String statusUser) {
        this.statusUser = statusUser;
        return this;
    }

    public String getStatusModer() {
        return statusModer;
    }

    public GetSitesResponseSitesSite setStatusModer(String statusModer) {
        this.statusModer = statusModer;
        return this;
    }

    public String getDomains() {
        return domains;
    }

    public GetSitesResponseSitesSite setDomains(String domains) {
        this.domains = domains;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusUser, domains, id, statusModer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSitesResponseSitesSite getSitesResponseSitesSite = (GetSitesResponseSitesSite) o;
        return Objects.equals(statusModer, getSitesResponseSitesSite.statusModer) &&
                Objects.equals(statusUser, getSitesResponseSitesSite.statusUser) &&
                Objects.equals(domains, getSitesResponseSitesSite.domains) &&
                Objects.equals(id, getSitesResponseSitesSite.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSitesResponseSitesSite{");
        sb.append("statusModer='").append(statusModer).append("'");
        sb.append(", statusUser='").append(statusUser).append("'");
        sb.append(", domains='").append(domains).append("'");
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
