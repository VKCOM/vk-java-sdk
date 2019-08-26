package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.stories.PromoBlock;
import com.vk.api.sdk.objects.stories.Story;
import java.util.List;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse implements Validable {
    /**
     * Stories count
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Story> items;

    @SerializedName("promo_data")
    private PromoBlock promoData;

    public Integer getCount() {
        return count;
    }

    public GetResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Story> getItems() {
        return items;
    }

    public GetResponse setItems(List<Story> items) {
        this.items = items;
        return this;
    }

    public PromoBlock getPromoData() {
        return promoData;
    }

    public GetResponse setPromoData(PromoBlock promoData) {
        this.promoData = promoData;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items, promoData);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(promoData, getResponse.promoData) &&
                Objects.equals(count, getResponse.count) &&
                Objects.equals(items, getResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("promoData=").append(promoData);
        sb.append(", count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
