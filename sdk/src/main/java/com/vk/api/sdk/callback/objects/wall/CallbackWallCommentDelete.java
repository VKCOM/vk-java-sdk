package com.vk.api.sdk.callback.objects.wall;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackWallCommentDelete {

    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("id")
    private Integer id;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("video_id")
    private Integer postId;

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getPostId() {
        return postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackWallCommentDelete that = (CallbackWallCommentDelete) o;
        return Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(postId, that.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, id, userId, postId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackWallCommentDelete{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", postId=").append(postId);
        sb.append('}');
        return sb.toString();
    }
}
