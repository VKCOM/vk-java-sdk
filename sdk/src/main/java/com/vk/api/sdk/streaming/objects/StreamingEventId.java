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

    @SerializedName("topic_owner_id")
    private Integer topicOwnerId;

    @SerializedName("topic_id")
    private Integer topicId;

    @SerializedName("topic_post_id")
    private Integer topicPostId;


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

    public Integer getTopicOwnerId() {
        return topicOwnerId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public Integer getTopicPostId() {
        return topicPostId;
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
                Objects.equals(sharedPostId, that.sharedPostId) &&
                Objects.equals(topicOwnerId, that.topicOwnerId) &&
                Objects.equals(topicId, that.topicId) &&
                Objects.equals(topicPostId, that.topicPostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postOwnerId, postId, commentId, sharedPostOwnerId, sharedPostId, topicOwnerId, topicId, topicPostId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingEventId{");
        sb.append("postOwnerId=").append(postOwnerId);
        sb.append(", postId=").append(postId);
        sb.append(", commentId=").append(commentId);
        sb.append(", sharedPostOwnerId=").append(sharedPostOwnerId);
        sb.append(", sharedPostId=").append(sharedPostId);
        sb.append(", topicOwnerId=").append(topicOwnerId);
        sb.append(", topicId=").append(topicId);
        sb.append(", topicPostId=").append(topicPostId);
        sb.append('}');
        return sb.toString();
    }
}
