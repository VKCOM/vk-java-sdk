package com.vk.api.sdk.objects.widgets;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.List;
import java.util.Objects;

/**
 * CommentReplies object
 */
public class CommentReplies implements Validable {
    /**
     * Information whether current user can comment the post
     */
    @SerializedName("can_post")
    private BoolInt canPost;

    /**
     * Comments number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("replies")
    private List<CommentRepliesItem> replies;

    public boolean canPost() {
        return canPost == BoolInt.YESBOOL;
    }

    public BoolInt getCanPost() {
        return canPost;
    }

    public Integer getCount() {
        return count;
    }

    public CommentReplies setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<CommentRepliesItem> getReplies() {
        return replies;
    }

    public CommentReplies setReplies(List<CommentRepliesItem> replies) {
        this.replies = replies;
        return this;
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
        return Objects.equals(replies, commentReplies.replies) &&
                Objects.equals(count, commentReplies.count) &&
                Objects.equals(canPost, commentReplies.canPost);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CommentReplies{");
        sb.append("replies=").append(replies);
        sb.append(", count=").append(count);
        sb.append(", canPost=").append(canPost);
        sb.append('}');
        return sb.toString();
    }
}
