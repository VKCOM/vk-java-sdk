package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Likes;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.Objects;

/**
 * NewsfeedPhoto object
 */
public class NewsfeedPhoto extends Photo {
    @SerializedName("likes")
    private Likes likes;

    @SerializedName("comments")
    private JsonObject comments;

    /**
     * Information whether current user can comment the photo
     */
    @SerializedName("can_comment")
    private BoolInt canComment;

    /**
     * Information whether current user can repost the photo
     */
    @SerializedName("can_repost")
    private BoolInt canRepost;

    public Likes getLikes() {
        return likes;
    }

    public JsonObject getComments() {
        return comments;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public boolean canRepost() {
        return canRepost == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, canRepost, canComment, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsfeedPhoto newsfeedPhoto = (NewsfeedPhoto) o;
        return Objects.equals(likes, newsfeedPhoto.likes) &&
                Objects.equals(comments, newsfeedPhoto.comments) &&
                Objects.equals(canComment, newsfeedPhoto.canComment) &&
                Objects.equals(canRepost, newsfeedPhoto.canRepost);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NewsfeedPhoto{");
        sb.append("likes=").append(likes);
        sb.append(", comments=").append(comments);
        sb.append(", canComment=").append(canComment);
        sb.append(", canRepost=").append(canRepost);
        sb.append('}');
        return sb.toString();
    }
}
