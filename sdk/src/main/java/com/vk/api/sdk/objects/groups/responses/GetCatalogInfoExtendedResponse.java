package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupCategoryFull;

import java.util.List;
import java.util.Objects;

/**
 * GetCatalogInfoExtendedResponse object
 */
public class GetCatalogInfoExtendedResponse {
    /**
     * Information whether catalog is enabled for current user
     */
    @SerializedName("enabled")
    private Integer enabled;

    @SerializedName("categories")
    private List<GroupCategoryFull> categories;

    public Integer getEnabled() {
        return enabled;
    }

    public List<GroupCategoryFull> getCategories() {
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
        GetCatalogInfoExtendedResponse getCatalogInfoExtendedResponse = (GetCatalogInfoExtendedResponse) o;
        return Objects.equals(enabled, getCatalogInfoExtendedResponse.enabled) &&
                Objects.equals(categories, getCatalogInfoExtendedResponse.categories);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCatalogInfoExtendedResponse{");
        sb.append("enabled=").append(enabled);
        sb.append(", categories=").append(categories);
        sb.append('}');
        return sb.toString();
    }
}
