package com.vk.api.sdk.objects.adsweb.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * GetAdCategoriesResponse object
 */
public class GetAdCategoriesResponse implements Validable {
    @SerializedName("categories")
    @Required
    private List<GetAdCategoriesResponseCategoriesCategory> categories;

    public List<GetAdCategoriesResponseCategoriesCategory> getCategories() {
        return categories;
    }

    public GetAdCategoriesResponse setCategories(
            List<GetAdCategoriesResponseCategoriesCategory> categories) {
        this.categories = categories;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(categories);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAdCategoriesResponse getAdCategoriesResponse = (GetAdCategoriesResponse) o;
        return Objects.equals(categories, getAdCategoriesResponse.categories);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAdCategoriesResponse{");
        sb.append("categories=").append(categories);
        sb.append('}');
        return sb.toString();
    }
}
