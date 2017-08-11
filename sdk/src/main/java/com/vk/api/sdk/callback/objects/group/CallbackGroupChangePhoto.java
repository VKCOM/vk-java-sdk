package com.vk.api.sdk.callback.objects.group;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 11.08.17.
 */
public class CallbackGroupChangePhoto {

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("photo")
    private Photo photo;

    public Integer getUserId() {
        return userId;
    }

    public Photo getPhoto() {
        return photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackGroupChangePhoto that = (CallbackGroupChangePhoto) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, photo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackGroupChangePhoto{");
        sb.append("photo=").append(photo);
        sb.append(", userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }
}
