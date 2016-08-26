package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * VideoAlbum object
 */
public class VideoAlbum {
    /**
     * Album ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Album owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Album title
     */
    @SerializedName("title")
    private String title;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoAlbum videoAlbum = (VideoAlbum) o;
        return Objects.equals(id, videoAlbum.id) &&
                Objects.equals(ownerId, videoAlbum.ownerId) &&
                Objects.equals(title, videoAlbum.title);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoAlbum{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
