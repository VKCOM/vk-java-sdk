package com.vk.api.sdk.objects.likes.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * AddResponse object
 */
public class AddResponse {
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
        AddResponse addResponse = (AddResponse) o;
        return Objects.equals(likes, addResponse.likes);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddResponse{");
        sb.append("likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
