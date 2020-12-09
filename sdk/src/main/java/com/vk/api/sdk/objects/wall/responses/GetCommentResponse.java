package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.wall.WallComment;
import java.util.List;
import java.util.Objects;

/**
 * GetCommentResponse object
 */
public class GetCommentResponse implements Validable {
    @SerializedName("items")
    @Required
    private List<WallComment> items;

    public List<WallComment> getItems() {
        return items;
    }

    public GetCommentResponse setItems(List<WallComment> items) {
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
        GetCommentResponse getCommentResponse = (GetCommentResponse) o;
        return Objects.equals(items, getCommentResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCommentResponse{");
        sb.append("items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
