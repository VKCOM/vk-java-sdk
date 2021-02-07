package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * Graffiti object
 */
public class Graffiti implements Validable {
    /**
     * Graffiti ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Graffiti owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * URL of the preview image with 200 px in width
     */
    @SerializedName("photo_200")
    private URI photo200;

    /**
     * URL of the preview image with 586 px in width
     */
    @SerializedName("photo_586")
    private URI photo586;

    public Integer getId() {
        return id;
    }

    public Graffiti setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Graffiti setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public URI getPhoto200() {
        return photo200;
    }

    public Graffiti setPhoto200(URI photo200) {
        this.photo200 = photo200;
        return this;
    }

    public URI getPhoto586() {
        return photo586;
    }

    public Graffiti setPhoto586(URI photo586) {
        this.photo586 = photo586;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo586, id, photo200, ownerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Graffiti graffiti = (Graffiti) o;
        return Objects.equals(ownerId, graffiti.ownerId) &&
                Objects.equals(id, graffiti.id) &&
                Objects.equals(photo200, graffiti.photo200) &&
                Objects.equals(photo586, graffiti.photo586);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Graffiti{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", id=").append(id);
        sb.append(", photo200=").append(photo200);
        sb.append(", photo586=").append(photo586);
        sb.append('}');
        return sb.toString();
    }
}
