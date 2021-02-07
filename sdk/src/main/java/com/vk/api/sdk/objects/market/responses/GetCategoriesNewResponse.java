package com.vk.api.sdk.objects.market.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.market.MarketCategoryTree;
import java.util.List;
import java.util.Objects;

/**
 * GetCategoriesNewResponse object
 */
public class GetCategoriesNewResponse implements Validable {
    @SerializedName("items")
    @Required
    private List<MarketCategoryTree> items;

    public List<MarketCategoryTree> getItems() {
        return items;
    }

    public GetCategoriesNewResponse setItems(List<MarketCategoryTree> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCategoriesNewResponse getCategoriesNewResponse = (GetCategoriesNewResponse) o;
        return Objects.equals(items, getCategoriesNewResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCategoriesNewResponse{");
        sb.append("items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
