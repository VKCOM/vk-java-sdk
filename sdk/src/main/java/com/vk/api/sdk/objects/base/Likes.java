package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Likes object
 */
public class Likes implements Validable {
    /**
     * Likes number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Information whether current user likes the photo
     */
    @SerializedName("user_likes")
    private BoolInt userLikes;

    public Integer getCount() {
        return count;
    }

    public Likes setCount(Integer count) {
        this.count = count;
        return this;
    }

    public boolean isUserLikes() {
        return userLikes == BoolInt.YESBOOL;
    }

    public BoolInt getUserLikes() {
        return userLikes;
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
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Likes{");
        sb.append("userLikes=").append(userLikes);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
