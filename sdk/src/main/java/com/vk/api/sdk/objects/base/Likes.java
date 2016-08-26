package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Likes object
 */
public class Likes {
    /**
     * Information whether current user likes the photo
     */
    @SerializedName("user_likes")
    private BoolInt userLikes;

    /**
     * Likes number
     */
    @SerializedName("count")
    private Integer count;

    public boolean isUserLikes() {
        return userLikes == BoolInt.YES;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, userLikes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Likes likes = (Likes) o;
        return Objects.equals(userLikes, likes.userLikes) &&
                Objects.equals(count, likes.count);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Likes{");
        sb.append("userLikes=").append(userLikes);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
