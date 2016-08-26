package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupCategory;

import java.util.List;
import java.util.Objects;

/**
 * GetCatalogInfoResponse object
 */
public class GetCatalogInfoResponse {
    /**
     * Information whether catalog is enabled for current user
     */
    @SerializedName("enabled")
    private Integer enabled;

    @SerializedName("categories")
    private List<GroupCategory> categories;

    public Integer getEnabled() {
        return enabled;
    }

    public List<GroupCategory> getCategories() {
        return categories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(categories, enabled);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCatalogInfoResponse getCatalogInfoResponse = (GetCatalogInfoResponse) o;
        return Objects.equals(enabled, getCatalogInfoResponse.enabled) &&
                Objects.equals(categories, getCatalogInfoResponse.categories);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCatalogInfoResponse{");
        sb.append("enabled=").append(enabled);
        sb.append(", categories=").append(categories);
        sb.append('}');
        return sb.toString();
    }
}
