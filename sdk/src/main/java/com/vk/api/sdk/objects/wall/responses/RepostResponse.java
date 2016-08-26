package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Objects;

/**
 * RepostResponse object
 */
public class RepostResponse {
    @SerializedName("success")
    private OkResponse success;

    /**
     * Created post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    /**
     * Reposts number
     */
    @SerializedName("reposts_count")
    private Integer repostsCount;

    /**
     * Reposts number
     */
    @SerializedName("likes_count")
    private Integer likesCount;

    public OkResponse getSuccess() {
        return success;
    }

    public Integer getPostId() {
        return postId;
    }

    public Integer getRepostsCount() {
        return repostsCount;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(repostsCount, likesCount, success, postId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepostResponse repostResponse = (RepostResponse) o;
        return Objects.equals(success, repostResponse.success) &&
                Objects.equals(postId, repostResponse.postId) &&
                Objects.equals(repostsCount, repostResponse.repostsCount) &&
                Objects.equals(likesCount, repostResponse.likesCount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RepostResponse{");
        sb.append("success=").append(success);
        sb.append(", postId=").append(postId);
        sb.append(", repostsCount=").append(repostsCount);
        sb.append(", likesCount=").append(likesCount);
        sb.append('}');
        return sb.toString();
    }
}
