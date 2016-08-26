package com.vk.api.sdk.objects.likes.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * DeleteResponse object
 */
public class DeleteResponse {
    /**
     * Total likes number
     */
    @SerializedName("likes")
    private Integer likes;

    public Integer getLikes() {
        return likes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteResponse deleteResponse = (DeleteResponse) o;
        return Objects.equals(likes, deleteResponse.likes);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeleteResponse{");
        sb.append("likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
