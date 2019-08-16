package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ItemPhoto object
 */
public class ItemPhoto extends ItemBase implements Validable {
    @SerializedName("photos")
    private ItemPhotoPhotos photos;

    /**
     * Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    public ItemPhotoPhotos getPhotos() {
        return photos;
    }

    public ItemPhoto setPhotos(ItemPhotoPhotos photos) {
        this.photos = photos;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public ItemPhoto setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, photos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPhoto itemPhoto = (ItemPhoto) o;
        return Objects.equals(postId, itemPhoto.postId) &&
                Objects.equals(photos, itemPhoto.photos);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemPhoto{");
        sb.append("postId=").append(postId);
        sb.append(", photos=").append(photos);
        sb.append('}');
        return sb.toString();
    }
}
