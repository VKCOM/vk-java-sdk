package com.vk.api.sdk.streaming.objects;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Streaming event id object
 */
public class StreamingEventId {

    @SerializedName("post_owner_id")
    private Integer postOwnerId;

    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("comment_id")
    private Integer commentId;

    @SerializedName("shared_post_owner_id")
    private Integer sharedPostOwnerId;

    @SerializedName("shared_post_id")
    private Integer sharedPostId;

    public Integer getPostOwnerId() {
        return postOwnerId;
    }

    public Integer getPostId() {
        return postId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public Integer getSharedPostOwnerId() {
        return sharedPostOwnerId;
    }

    public Integer getSharedPostId() {
        return sharedPostId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreamingEventId that = (StreamingEventId) o;
        return Objects.equals(postOwnerId, that.postOwnerId) &&
                Objects.equals(postId, that.postId) &&
                Objects.equals(commentId, that.commentId) &&
                Objects.equals(sharedPostOwnerId, that.sharedPostOwnerId) &&
                Objects.equals(sharedPostId, that.sharedPostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postOwnerId, postId, commentId, sharedPostOwnerId, sharedPostId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingEventId{");
        sb.append("postOwnerId=").append(postOwnerId);
        sb.append(", postId=").append(postId);
        sb.append(", commentId=").append(commentId);
        sb.append(", sharedPostOwnerId=").append(sharedPostOwnerId);
        sb.append(", sharedPostId=").append(sharedPostId);
        sb.append('}');
        return sb.toString();
    }
}
