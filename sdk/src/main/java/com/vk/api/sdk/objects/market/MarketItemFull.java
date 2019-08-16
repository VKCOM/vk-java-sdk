package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Likes;
import com.vk.api.sdk.objects.base.RepostsInfo;
import com.vk.api.sdk.objects.photos.Photo;
import java.util.List;
import java.util.Objects;

/**
 * MarketItemFull object
 */
public class MarketItemFull extends MarketItem implements Validable {
    @SerializedName("albums_ids")
    private List<Integer> albumsIds;

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

    @SerializedName("reposts")
    private RepostsInfo reposts;

    /**
     * Views number
     */
    @SerializedName("views_count")
    private Integer viewsCount;

    public List<Integer> getAlbumsIds() {
        return albumsIds;
    }

    public MarketItemFull setAlbumsIds(List<Integer> albumsIds) {
        this.albumsIds = albumsIds;
        return this;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public MarketItemFull setPhotos(List<Photo> photos) {
        this.photos = photos;
        return this;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public BoolInt getCanComment() {
        return canComment;
    }

    public boolean canRepost() {
        return canRepost == BoolInt.YES;
    }

    public BoolInt getCanRepost() {
        return canRepost;
    }

    public Likes getLikes() {
        return likes;
    }

    public MarketItemFull setLikes(Likes likes) {
        this.likes = likes;
        return this;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public MarketItemFull setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
        return this;
    }

    public Integer getViewsCount() {
        return viewsCount;
    }

    public MarketItemFull setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canRepost, viewsCount, albumsIds, canComment, photos, reposts, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketItemFull marketItemFull = (MarketItemFull) o;
        return Objects.equals(canRepost, marketItemFull.canRepost) &&
                Objects.equals(canComment, marketItemFull.canComment) &&
                Objects.equals(viewsCount, marketItemFull.viewsCount) &&
                Objects.equals(albumsIds, marketItemFull.albumsIds) &&
                Objects.equals(photos, marketItemFull.photos) &&
                Objects.equals(reposts, marketItemFull.reposts) &&
                Objects.equals(likes, marketItemFull.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketItemFull{");
        sb.append("canRepost=").append(canRepost);
        sb.append(", canComment=").append(canComment);
        sb.append(", viewsCount=").append(viewsCount);
        sb.append(", albumsIds=").append(albumsIds);
        sb.append(", photos=").append(photos);
        sb.append(", reposts=").append(reposts);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
