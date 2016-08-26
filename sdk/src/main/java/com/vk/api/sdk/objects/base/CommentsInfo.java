package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * CommentsInfo object
 */
public class CommentsInfo {
    /**
     * Comments number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Information whether current user can comment the post
     */
    @SerializedName("can_post")
    private Integer canPost;

    public Integer getCount() {
        return count;
    }

    public Integer getCanPost() {
        return canPost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canPost, count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsInfo commentsInfo = (CommentsInfo) o;
        return Objects.equals(count, commentsInfo.count) &&
                Objects.equals(canPost, commentsInfo.canPost);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommentsInfo{");
        sb.append("count=").append(count);
        sb.append(", canPost=").append(canPost);
        sb.append('}');
        return sb.toString();
    }
}
