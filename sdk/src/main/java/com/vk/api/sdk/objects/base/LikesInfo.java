package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * LikesInfo object
 */
public class LikesInfo implements Validable {
    /**
     * Information whether current user can like the post
     */
    @SerializedName("can_like")
    private BoolInt canLike;

    /**
     * Information whether current user can repost
     */
    @SerializedName("can_publish")
    private BoolInt canPublish;

    /**
     * Likes number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    /**
     * Information whether current uer has liked the post
     */
    @SerializedName("user_likes")
    private Integer userLikes;

    public boolean canLike() {
        return canLike == BoolInt.YESBOOL;
    }

    public BoolInt getCanLike() {
        return canLike;
    }

    public boolean canPublish() {
        return canPublish == BoolInt.YESBOOL;
    }

    public BoolInt getCanPublish() {
        return canPublish;
    }

    public Integer getCount() {
        return count;
    }

    public LikesInfo setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getUserLikes() {
        return userLikes;
    }

    public LikesInfo setUserLikes(Integer userLikes) {
        this.userLikes = userLikes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canLike, canPublish, count, userLikes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LikesInfo likesInfo = (LikesInfo) o;
        return Objects.equals(userLikes, likesInfo.userLikes) &&
                Objects.equals(canPublish, likesInfo.canPublish) &&
                Objects.equals(canLike, likesInfo.canLike) &&
                Objects.equals(count, likesInfo.count);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LikesInfo{");
        sb.append("userLikes=").append(userLikes);
        sb.append(", canPublish=").append(canPublish);
        sb.append(", canLike=").append(canLike);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
