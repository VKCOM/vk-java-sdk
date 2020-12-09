package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Likes;
import com.vk.api.sdk.objects.base.ObjectCount;
import com.vk.api.sdk.objects.photos.Photo;
import java.util.Objects;

/**
 * NewsfeedPhoto object
 */
public class NewsfeedPhoto extends Photo implements Validable {
    @SerializedName("likes")
    private Likes likes;

    @SerializedName("comments")
    private ObjectCount comments;

    /**
     * Information whether current user can repost the photo
     */
    @SerializedName("can_repost")
    private BoolInt canRepost;

    public Likes getLikes() {
        return likes;
    }

    public NewsfeedPhoto setLikes(Likes likes) {
        this.likes = likes;
        return this;
    }

    public ObjectCount getComments() {
        return comments;
    }

    public NewsfeedPhoto setComments(ObjectCount comments) {
        this.comments = comments;
        return this;
    }

    public boolean canRepost() {
        return canRepost == BoolInt.YES;
    }

    public BoolInt getCanRepost() {
        return canRepost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, canRepost, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsfeedPhoto newsfeedPhoto = (NewsfeedPhoto) o;
        return Objects.equals(canRepost, newsfeedPhoto.canRepost) &&
                Objects.equals(comments, newsfeedPhoto.comments) &&
                Objects.equals(likes, newsfeedPhoto.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("NewsfeedPhoto{");
        sb.append("canRepost=").append(canRepost);
        sb.append(", comments=").append(comments);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
