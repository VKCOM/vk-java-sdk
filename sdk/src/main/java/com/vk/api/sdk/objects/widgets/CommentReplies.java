package com.vk.api.sdk.objects.widgets;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * CommentReplies object
 */
public class CommentReplies {
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

    @SerializedName("replies")
    private List<CommentRepliesItem> replies;

    public Integer getCount() {
        return count;
    }

    public Integer getCanPost() {
        return canPost;
    }

    public List<CommentRepliesItem> getReplies() {
        return replies;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canPost, replies, count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentReplies commentReplies = (CommentReplies) o;
        return Objects.equals(count, commentReplies.count) &&
                Objects.equals(canPost, commentReplies.canPost) &&
                Objects.equals(replies, commentReplies.replies);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommentReplies{");
        sb.append("count=").append(count);
        sb.append(", canPost=").append(canPost);
        sb.append(", replies=").append(replies);
        sb.append('}');
        return sb.toString();
    }
}
