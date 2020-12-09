package com.vk.api.sdk.objects.adsweb.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetAdUnitsResponseAdUnitsAdUnit object
 */
public class GetAdUnitsResponseAdUnitsAdUnit implements Validable {
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("site_id")
    private Integer siteId;

    @SerializedName("name")
    private String name;

    public Integer getId() {
        return id;
    }

    public GetAdUnitsResponseAdUnitsAdUnit setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public GetAdUnitsResponseAdUnitsAdUnit setSiteId(Integer siteId) {
        this.siteId = siteId;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetAdUnitsResponseAdUnitsAdUnit setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, siteId, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAdUnitsResponseAdUnitsAdUnit getAdUnitsResponseAdUnitsAdUnit = (GetAdUnitsResponseAdUnitsAdUnit) o;
        return Objects.equals(siteId, getAdUnitsResponseAdUnitsAdUnit.siteId) &&
                Objects.equals(name, getAdUnitsResponseAdUnitsAdUnit.name) &&
                Objects.equals(id, getAdUnitsResponseAdUnitsAdUnit.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAdUnitsResponseAdUnitsAdUnit{");
        sb.append("siteId=").append(siteId);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
