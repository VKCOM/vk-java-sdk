package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * LikesInfo object
 */
public class LikesInfo {
    /**
     * Likes number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Information whether current uer has liked the post
     */
    @SerializedName("user_likes")
    private Integer userLikes;

    /**
     * Information whether current user can like the post
     */
    @SerializedName("can_like")
    private Integer canLike;

    /**
     * Information whether current user can repost
     */
    @SerializedName("can_publish")
    private Integer canPublish;

    public Integer getCount() {
        return count;
    }

    public Integer getUserLikes() {
        return userLikes;
    }

    public Integer getCanLike() {
        return canLike;
    }

    public Integer getCanPublish() {
        return canPublish;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canLike, count, canPublish, userLikes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LikesInfo likesInfo = (LikesInfo) o;
        return Objects.equals(count, likesInfo.count) &&
                Objects.equals(userLikes, likesInfo.userLikes) &&
                Objects.equals(canLike, likesInfo.canLike) &&
                Objects.equals(canPublish, likesInfo.canPublish);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LikesInfo{");
        sb.append("count=").append(count);
        sb.append(", userLikes=").append(userLikes);
        sb.append(", canLike=").append(canLike);
        sb.append(", canPublish=").append(canPublish);
        sb.append('}');
        return sb.toString();
    }
}
