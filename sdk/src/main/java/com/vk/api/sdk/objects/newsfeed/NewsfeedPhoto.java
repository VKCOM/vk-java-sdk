package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BaseCount;
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
    private BaseCount comments;

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

    public BaseCount getComments() {
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
        return Objects.hash(super.hashCode(), comments, canRepost, canComment, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NewsfeedPhoto newsfeedPhoto = (NewsfeedPhoto) o;
        return Objects.equals(likes, newsfeedPhoto.likes) &&
                Objects.equals(comments, newsfeedPhoto.comments) &&
                Objects.equals(canComment, newsfeedPhoto.canComment) &&
                Objects.equals(canRepost, newsfeedPhoto.canRepost);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NewsfeedPhoto{");
        sb.append("accessKey='").append(getAccessKey()).append('\'');
        sb.append(", albumId=").append(getAlbumId());
        sb.append(", canComment=").append(canComment);
        sb.append(", canRepost=").append(canRepost);
        sb.append(", comments=").append(comments);
        sb.append(", date=").append(getDate());
        sb.append(", height=").append(getHeight());
        sb.append(", id=").append(getId());
        sb.append(", lat=").append(getLat());
        sb.append(", likes=").append(likes);
        sb.append(", lng=").append(getLng());
        sb.append(", ownerId=").append(getOwnerId());
        sb.append(", photo1280='").append(getPhoto1280()).append('\'');
        sb.append(", photo130='").append(getPhoto130()).append('\'');
        sb.append(", photo2560='").append(getPhoto2560()).append('\'');
        sb.append(", photo604='").append(getPhoto604()).append('\'');
        sb.append(", photo75='").append(getPhoto75()).append('\'');
        sb.append(", photo807='").append(getPhoto807()).append('\'');
        sb.append(", postId=").append(getPostId());
        sb.append(", sizes=").append(getSizes());
        sb.append(", text='").append(getText()).append('\'');
        sb.append(", userId=").append(getUserId());
        sb.append(", width=").append(getWidth());
        sb.append('}');
        return sb.toString();
    }
}
