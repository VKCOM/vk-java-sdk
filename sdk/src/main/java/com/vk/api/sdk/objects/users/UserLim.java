package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * UserLim object
 */
public class UserLim {
    /**
     * User ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * URL of square photo of the user with 50 pixels in width
     */
    @SerializedName("photo")
    private String photo;

    /**
     * User name and last name
     */
    @SerializedName("name")
    private String name;

    /**
     * User name in genitive declension
     */
    @SerializedName("name_gen")
    private String nameGen;

    public Integer getId() {
        return id;
    }

    public String getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public String getNameGen() {
        return nameGen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameGen, name, photo, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLim userLim = (UserLim) o;
        return Objects.equals(id, userLim.id) &&
                Objects.equals(photo, userLim.photo) &&
                Objects.equals(name, userLim.name) &&
                Objects.equals(nameGen, userLim.nameGen);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserLim{");
        sb.append("id=").append(id);
        sb.append(", photo='").append(photo).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", nameGen='").append(nameGen).append("'");
        sb.append('}');
        return sb.toString();
    }
}
