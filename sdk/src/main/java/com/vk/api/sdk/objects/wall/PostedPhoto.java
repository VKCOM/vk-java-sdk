package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * PostedPhoto object
 */
public class PostedPhoto implements Validable {
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
    private URI photo130;

    /**
     * URL of the preview image with 604 px in width
     */
    @SerializedName("photo_604")
    private URI photo604;

    public Integer getId() {
        return id;
    }

    public PostedPhoto setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public PostedPhoto setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public URI getPhoto130() {
        return photo130;
    }

    public PostedPhoto setPhoto130(URI photo130) {
        this.photo130 = photo130;
        return this;
    }

    public URI getPhoto604() {
        return photo604;
    }

    public PostedPhoto setPhoto604(URI photo604) {
        this.photo604 = photo604;
        return this;
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
        return Objects.equals(photo604, postedPhoto.photo604) &&
                Objects.equals(ownerId, postedPhoto.ownerId) &&
                Objects.equals(photo130, postedPhoto.photo130) &&
                Objects.equals(id, postedPhoto.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PostedPhoto{");
        sb.append("photo604=").append(photo604);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", photo130=").append(photo130);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
