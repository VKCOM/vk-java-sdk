package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.ads.Category;

import java.util.List;
import java.util.Objects;

/**
 * Created by Anton Tsivarev on 19.06.17.
 */
public class GetCategoriesResponse {

    /**
     * Old categories
     */
    @SerializedName("v1")
    private List<Category> v1;

    /**
     * Actual categories
     */
    @SerializedName("v2")
    private List<Category> v2;

    public List<Category> getV1() {
        return v1;
    }

    public List<Category> getV2() {
        return v2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCategoriesResponse that = (GetCategoriesResponse) o;
        return Objects.equals(v1, that.v1) &&
                Objects.equals(v2, that.v2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCategoriesResponse{");
        sb.append("v1=").append(v1);
        sb.append(", v2=").append(v2);
        sb.append('}');
        return sb.toString();
    }
}
