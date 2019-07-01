package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Objects;

/**
 * RepostResponse object
 */
public class RepostResponse implements Validable {
    @SerializedName("success")
    @Required
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

    public RepostResponse setSuccess(OkResponse success) {
        this.success = success;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public RepostResponse setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public Integer getRepostsCount() {
        return repostsCount;
    }

    public RepostResponse setRepostsCount(Integer repostsCount) {
        this.repostsCount = repostsCount;
        return this;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public RepostResponse setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
        return this;
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
        return Objects.equals(likesCount, repostResponse.likesCount) &&
                Objects.equals(postId, repostResponse.postId) &&
                Objects.equals(success, repostResponse.success) &&
                Objects.equals(repostsCount, repostResponse.repostsCount);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("RepostResponse{");
        sb.append("likesCount=").append(likesCount);
        sb.append(", postId=").append(postId);
        sb.append(", success=").append(success);
        sb.append(", repostsCount=").append(repostsCount);
        sb.append('}');
        return sb.toString();
    }
}
