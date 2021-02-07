package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.ads.Musician;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * GetMusiciansResponse object
 */
public class GetMusiciansResponse implements Validable {
    /**
     * Musicians
     */
    @SerializedName("items")
    @Required
    private List<Musician> items;

    public List<Musician> getItems() {
        return items;
    }

    public GetMusiciansResponse setItems(List<Musician> items) {
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
        GetMusiciansResponse getMusiciansResponse = (GetMusiciansResponse) o;
        return Objects.equals(items, getMusiciansResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetMusiciansResponse{");
        sb.append("items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
