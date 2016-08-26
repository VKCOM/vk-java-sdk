package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * PostResponse object
 */
public class PostResponse {
    /**
     * Created post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    public Integer getPostId() {
        return postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostResponse postResponse = (PostResponse) o;
        return Objects.equals(postId, postResponse.postId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PostResponse{");
        sb.append("postId=").append(postId);
        sb.append('}');
        return sb.toString();
    }
}
