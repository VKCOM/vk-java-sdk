package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * AddListResponse object
 */
public class AddListResponse {
    /**
     * List ID
     */
    @SerializedName("list_id")
    private Integer listId;

    public Integer getListId() {
        return listId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(listId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddListResponse addListResponse = (AddListResponse) o;
        return Objects.equals(listId, addListResponse.listId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddListResponse{");
        sb.append("listId=").append(listId);
        sb.append('}');
        return sb.toString();
    }
}
