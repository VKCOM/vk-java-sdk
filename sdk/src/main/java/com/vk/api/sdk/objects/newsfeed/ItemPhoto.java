package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ItemPhoto object
 */
public class ItemPhoto {

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

    public Integer getPostId() {
        return postId;
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
        return Objects.equals(photos, itemPhoto.photos) &&
                Objects.equals(postId, itemPhoto.postId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemPhoto{");
        sb.append("photos=").append(photos);
        sb.append(", postId=").append(postId);
        sb.append('}');
        return sb.toString();
    }
}
