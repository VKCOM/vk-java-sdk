package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * LikeAddRemove object
 */
public class LikeAddRemove implements Validable {
    @SerializedName("liker_id")
    private Integer likerId;

    @SerializedName("object_type")
    private LikeAddRemoveObjectType objectType;

    @SerializedName("object_owner_id")
    private Integer objectOwnerId;

    @SerializedName("object_id")
    private Integer objectId;

    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("thread_reply_id")
    private Integer threadReplyId;

    public Integer getLikerId() {
        return likerId;
    }

    public LikeAddRemove setLikerId(Integer likerId) {
        this.likerId = likerId;
        return this;
    }

    public LikeAddRemoveObjectType getObjectType() {
        return objectType;
    }

    public LikeAddRemove setObjectType(LikeAddRemoveObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    public Integer getObjectOwnerId() {
        return objectOwnerId;
    }

    public LikeAddRemove setObjectOwnerId(Integer objectOwnerId) {
        this.objectOwnerId = objectOwnerId;
        return this;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public LikeAddRemove setObjectId(Integer objectId) {
        this.objectId = objectId;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public LikeAddRemove setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public Integer getThreadReplyId() {
        return threadReplyId;
    }

    public LikeAddRemove setThreadReplyId(Integer threadReplyId) {
        this.threadReplyId = threadReplyId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(likerId, objectOwnerId, postId, objectId, threadReplyId, objectType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LikeAddRemove likeAddRemove = (LikeAddRemove) o;
        return Objects.equals(threadReplyId, likeAddRemove.threadReplyId) &&
                Objects.equals(postId, likeAddRemove.postId) &&
                Objects.equals(objectType, likeAddRemove.objectType) &&
                Objects.equals(likerId, likeAddRemove.likerId) &&
                Objects.equals(objectOwnerId, likeAddRemove.objectOwnerId) &&
                Objects.equals(objectId, likeAddRemove.objectId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LikeAddRemove{");
        sb.append("threadReplyId=").append(threadReplyId);
        sb.append(", postId=").append(postId);
        sb.append(", objectType='").append(objectType).append("'");
        sb.append(", likerId=").append(likerId);
        sb.append(", objectOwnerId=").append(objectOwnerId);
        sb.append(", objectId=").append(objectId);
        sb.append('}');
        return sb.toString();
    }
}
