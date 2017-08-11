package com.vk.api.sdk.callback.objects.photo;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 12.09.16.
 */
public class CallbackPhotoCommentDelete {

    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("id")
    private Integer id;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("photo_id")
    private Integer photoId;

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackPhotoCommentDelete that = (CallbackPhotoCommentDelete) o;
        return Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(photoId, that.photoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, id, userId, photoId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackPhotoCommentDelete{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", photoId=").append(photoId);
        sb.append('}');
        return sb.toString();
    }
}
