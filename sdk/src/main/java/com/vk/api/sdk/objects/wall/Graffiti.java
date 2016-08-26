package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Graffiti object
 */
public class Graffiti {
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
    private String photo200;

    /**
     * URL of the preview image with 586 px in width
     */
    @SerializedName("photo_586")
    private String photo586;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getPhoto200() {
        return photo200;
    }

    public String getPhoto586() {
        return photo586;
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
        return Objects.equals(id, graffiti.id) &&
                Objects.equals(ownerId, graffiti.ownerId) &&
                Objects.equals(photo200, graffiti.photo200) &&
                Objects.equals(photo586, graffiti.photo586);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Graffiti{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", photo200='").append(photo200).append("'");
        sb.append(", photo586='").append(photo586).append("'");
        sb.append('}');
        return sb.toString();
    }
}
