package com.vk.api.sdk.objects.widgets;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * CommentMedia object
 */
public class CommentMedia implements Validable {
    /**
     * Media item ID
     */
    @SerializedName("item_id")
    private Integer itemId;

    /**
     * Media owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * URL of the preview image (type=photo only)
     */
    @SerializedName("thumb_src")
    private URI thumbSrc;

    @SerializedName("type")
    private CommentMediaType type;

    public Integer getItemId() {
        return itemId;
    }

    public CommentMedia setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public CommentMedia setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public URI getThumbSrc() {
        return thumbSrc;
    }

    public CommentMedia setThumbSrc(URI thumbSrc) {
        this.thumbSrc = thumbSrc;
        return this;
    }

    public CommentMediaType getType() {
        return type;
    }

    public CommentMedia setType(CommentMediaType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, thumbSrc, ownerId, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentMedia commentMedia = (CommentMedia) o;
        return Objects.equals(itemId, commentMedia.itemId) &&
                Objects.equals(ownerId, commentMedia.ownerId) &&
                Objects.equals(thumbSrc, commentMedia.thumbSrc) &&
                Objects.equals(type, commentMedia.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CommentMedia{");
        sb.append("itemId=").append(itemId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", thumbSrc=").append(thumbSrc);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
