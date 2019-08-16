package com.vk.api.sdk.objects.fave;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.Link;
import com.vk.api.sdk.objects.market.MarketItem;
import com.vk.api.sdk.objects.video.Video;
import com.vk.api.sdk.objects.wall.WallpostFull;
import java.util.List;
import java.util.Objects;

/**
 * Bookmark object
 */
public class Bookmark implements Validable {
    /**
     * Timestamp, when this item was bookmarked
     */
    @SerializedName("added_date")
    private Integer addedDate;

    @SerializedName("link")
    private Link link;

    @SerializedName("post")
    private WallpostFull post;

    @SerializedName("product")
    private MarketItem product;

    /**
     * Has user seen this item
     */
    @SerializedName("seen")
    @Required
    private Boolean seen;

    @SerializedName("tags")
    @Required
    private List<Tag> tags;

    /**
     * Item type
     */
    @SerializedName("type")
    @Required
    private BookmarkType type;

    @SerializedName("video")
    private Video video;

    public Integer getAddedDate() {
        return addedDate;
    }

    public Bookmark setAddedDate(Integer addedDate) {
        this.addedDate = addedDate;
        return this;
    }

    public Link getLink() {
        return link;
    }

    public Bookmark setLink(Link link) {
        this.link = link;
        return this;
    }

    public WallpostFull getPost() {
        return post;
    }

    public Bookmark setPost(WallpostFull post) {
        this.post = post;
        return this;
    }

    public MarketItem getProduct() {
        return product;
    }

    public Bookmark setProduct(MarketItem product) {
        this.product = product;
        return this;
    }

    public Boolean getSeen() {
        return seen;
    }

    public Bookmark setSeen(Boolean seen) {
        this.seen = seen;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public Bookmark setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public BookmarkType getType() {
        return type;
    }

    public Bookmark setType(BookmarkType type) {
        this.type = type;
        return this;
    }

    public Video getVideo() {
        return video;
    }

    public Bookmark setVideo(Video video) {
        this.video = video;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, addedDate, post, link, video, type, seen, tags);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookmark bookmark = (Bookmark) o;
        return Objects.equals(product, bookmark.product) &&
                Objects.equals(post, bookmark.post) &&
                Objects.equals(addedDate, bookmark.addedDate) &&
                Objects.equals(link, bookmark.link) &&
                Objects.equals(video, bookmark.video) &&
                Objects.equals(type, bookmark.type) &&
                Objects.equals(seen, bookmark.seen) &&
                Objects.equals(tags, bookmark.tags);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Bookmark{");
        sb.append("product=").append(product);
        sb.append(", post=").append(post);
        sb.append(", addedDate=").append(addedDate);
        sb.append(", link=").append(link);
        sb.append(", video=").append(video);
        sb.append(", type=").append(type);
        sb.append(", seen=").append(seen);
        sb.append(", tags=").append(tags);
        sb.append('}');
        return sb.toString();
    }
}
