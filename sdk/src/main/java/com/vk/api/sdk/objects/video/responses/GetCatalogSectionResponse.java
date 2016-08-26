package com.vk.api.sdk.objects.video.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.video.CatElement;

import java.util.List;
import java.util.Objects;

/**
 * GetCatalogSectionResponse object
 */
public class GetCatalogSectionResponse {
    @SerializedName("items")
    private List<CatElement> items;

    /**
     * New value for _from_ parameter
     */
    @SerializedName("next")
    private String next;

    public List<CatElement> getItems() {
        return items;
    }

    public String getNext() {
        return next;
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCatalogSectionResponse getCatalogSectionResponse = (GetCatalogSectionResponse) o;
        return Objects.equals(items, getCatalogSectionResponse.items) &&
                Objects.equals(next, getCatalogSectionResponse.next);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCatalogSectionResponse{");
        sb.append("items=").append(items);
        sb.append(", next='").append(next).append("'");
        sb.append('}');
        return sb.toString();
    }
}
