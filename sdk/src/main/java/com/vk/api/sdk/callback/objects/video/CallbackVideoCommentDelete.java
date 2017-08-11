package com.vk.api.sdk.callback.objects.video;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackVideoCommentDelete {

    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("id")
    private Integer id;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("video_id")
    private Integer videoId;

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackVideoCommentDelete that = (CallbackVideoCommentDelete) o;
        return Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(videoId, that.videoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, id, userId, videoId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackVideoCommentDelete{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", videoId=").append(videoId);
        sb.append('}');
        return sb.toString();
    }
}
