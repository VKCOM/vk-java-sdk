package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ItemPhotoTag object
 */
public class ItemPhotoTag extends ItemBase implements Validable {
    @SerializedName("photo_tags")
    private ItemPhotoTagPhotoTags photoTags;

    /**
     * Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    public ItemPhotoTagPhotoTags getPhotoTags() {
        return photoTags;
    }

    public ItemPhotoTag setPhotoTags(ItemPhotoTagPhotoTags photoTags) {
        this.photoTags = photoTags;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public ItemPhotoTag setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, photoTags);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPhotoTag itemPhotoTag = (ItemPhotoTag) o;
        return Objects.equals(postId, itemPhotoTag.postId) &&
                Objects.equals(photoTags, itemPhotoTag.photoTags);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemPhotoTag{");
        sb.append("postId=").append(postId);
        sb.append(", photoTags=").append(photoTags);
        sb.append('}');
        return sb.toString();
    }
}
