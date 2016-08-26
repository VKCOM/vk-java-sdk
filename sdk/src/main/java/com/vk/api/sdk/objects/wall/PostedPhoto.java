package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * PostedPhoto object
 */
public class PostedPhoto {
    /**
     * Photo ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Photo owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * URL of the preview image with 130 px in width
     */
    @SerializedName("photo_130")
    private String photo130;

    /**
     * URL of the preview image with 604 px in width
     */
    @SerializedName("photo_604")
    private String photo604;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getPhoto130() {
        return photo130;
    }

    public String getPhoto604() {
        return photo604;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo604, photo130, id, ownerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostedPhoto postedPhoto = (PostedPhoto) o;
        return Objects.equals(id, postedPhoto.id) &&
                Objects.equals(ownerId, postedPhoto.ownerId) &&
                Objects.equals(photo130, postedPhoto.photo130) &&
                Objects.equals(photo604, postedPhoto.photo604);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PostedPhoto{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", photo130='").append(photo130).append("'");
        sb.append(", photo604='").append(photo604).append("'");
        sb.append('}');
        return sb.toString();
    }
}
