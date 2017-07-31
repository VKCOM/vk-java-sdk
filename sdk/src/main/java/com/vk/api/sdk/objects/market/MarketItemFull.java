package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Likes;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.List;
import java.util.Objects;

/**
 * MarketItemFull object
 */
public class MarketItemFull extends MarketItem {
    @SerializedName("photos")
    private List<Photo> photos;

    /**
     * Information whether current use can comment the item
     */
    @SerializedName("can_comment")
    private BoolInt canComment;

    /**
     * Information whether current use can repost the item
     */
    @SerializedName("can_repost")
    private BoolInt canRepost;

    @SerializedName("likes")
    private Likes likes;

    /**
     * Views number
     */
    @SerializedName("views_count")
    private Integer viewsCount;

    public List<Photo> getPhotos() {
        return photos;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public boolean canRepost() {
        return canRepost == BoolInt.YES;
    }

    public Likes getLikes() {
        return likes;
    }

    public Integer getViewsCount() {
        return viewsCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), canRepost, viewsCount, canComment, photos, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MarketItemFull marketItemFull = (MarketItemFull) o;
        return Objects.equals(photos, marketItemFull.photos) &&
                Objects.equals(canComment, marketItemFull.canComment) &&
                Objects.equals(canRepost, marketItemFull.canRepost) &&
                Objects.equals(likes, marketItemFull.likes) &&
                Objects.equals(viewsCount, marketItemFull.viewsCount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketItemFull{");
        sb.append("availability=").append(getAvailability());
        sb.append(", canComment=").append(canComment);
        sb.append(", canRepost=").append(canRepost);
        sb.append(", category=").append(getCategory());
        sb.append(", date=").append(getDate());
        sb.append(", description='").append(getDescription()).append('\'');
        sb.append(", id=").append(getId());
        sb.append(", likes=").append(likes);
        sb.append(", ownerId=").append(getOwnerId());
        sb.append(", photos=").append(photos);
        sb.append(", price=").append(getPrice());
        sb.append(", thumbPhoto='").append(getThumbPhoto()).append('\'');
        sb.append(", title='").append(getTitle()).append('\'');
        sb.append(", viewsCount=").append(viewsCount);
        sb.append('}');
        return sb.toString();
    }
}
