package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * PhotoAlbum object
 */
public class PhotoAlbum {
    /**
     * Photo album ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("thumb")
    private Photo thumb;

    /**
     * Album owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Photo album title
     */
    @SerializedName("title")
    private String title;

    /**
     * Photo album description
     */
    @SerializedName("description")
    private String description;

    /**
     * Date when the album has been created in Unixtime
     */
    @SerializedName("created")
    private Integer created;

    /**
     * Date when the album has been updated last time in Unixtime
     */
    @SerializedName("updated")
    private Integer updated;

    /**
     * Photos number
     */
    @SerializedName("size")
    private Integer size;

    public Integer getId() {
        return id;
    }

    public Photo getThumb() {
        return thumb;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCreated() {
        return created;
    }

    public Integer getUpdated() {
        return updated;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, thumb, created, description, id, ownerId, title, updated);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoAlbum photoAlbum = (PhotoAlbum) o;
        return Objects.equals(id, photoAlbum.id) &&
                Objects.equals(thumb, photoAlbum.thumb) &&
                Objects.equals(ownerId, photoAlbum.ownerId) &&
                Objects.equals(title, photoAlbum.title) &&
                Objects.equals(description, photoAlbum.description) &&
                Objects.equals(created, photoAlbum.created) &&
                Objects.equals(updated, photoAlbum.updated) &&
                Objects.equals(size, photoAlbum.size);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhotoAlbum{");
        sb.append("id=").append(id);
        sb.append(", thumb=").append(thumb);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
