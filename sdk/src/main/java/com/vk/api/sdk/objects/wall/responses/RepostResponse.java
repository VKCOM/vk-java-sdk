package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * RepostResponse object
 */
public class RepostResponse implements Validable {
    @SerializedName("success")
    @Required
    private Integer success;

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
     * Reposts to wall number
     */
    @SerializedName("wall_repost_count")
    private Integer wallRepostCount;

    /**
     * Reposts to mail number
     */
    @SerializedName("mail_repost_count")
    private Integer mailRepostCount;

    /**
     * Reposts number
     */
    @SerializedName("likes_count")
    private Integer likesCount;

    public Integer getSuccess() {
        return success;
    }

    public RepostResponse setSuccess(Integer success) {
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

    public Integer getWallRepostCount() {
        return wallRepostCount;
    }

    public RepostResponse setWallRepostCount(Integer wallRepostCount) {
        this.wallRepostCount = wallRepostCount;
        return this;
    }

    public Integer getMailRepostCount() {
        return mailRepostCount;
    }

    public RepostResponse setMailRepostCount(Integer mailRepostCount) {
        this.mailRepostCount = mailRepostCount;
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
        return Objects.hash(repostsCount, likesCount, mailRepostCount, wallRepostCount, success, postId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepostResponse repostResponse = (RepostResponse) o;
        return Objects.equals(likesCount, repostResponse.likesCount) &&
                Objects.equals(mailRepostCount, repostResponse.mailRepostCount) &&
                Objects.equals(postId, repostResponse.postId) &&
                Objects.equals(success, repostResponse.success) &&
                Objects.equals(wallRepostCount, repostResponse.wallRepostCount) &&
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
        sb.append(", mailRepostCount=").append(mailRepostCount);
        sb.append(", postId=").append(postId);
        sb.append(", success=").append(success);
        sb.append(", wallRepostCount=").append(wallRepostCount);
        sb.append(", repostsCount=").append(repostsCount);
        sb.append('}');
        return sb.toString();
    }
}
