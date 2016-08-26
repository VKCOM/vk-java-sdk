package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * AppPost object
 */
public class AppPost {
    /**
     * Application ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Application name
     */
    @SerializedName("name")
    private String name;

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

    public String getName() {
        return name;
    }

    public String getPhoto130() {
        return photo130;
    }

    public String getPhoto604() {
        return photo604;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo604, photo130, name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppPost appPost = (AppPost) o;
        return Objects.equals(id, appPost.id) &&
                Objects.equals(name, appPost.name) &&
                Objects.equals(photo130, appPost.photo130) &&
                Objects.equals(photo604, appPost.photo604);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppPost{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", photo130='").append(photo130).append("'");
        sb.append(", photo604='").append(photo604).append("'");
        sb.append('}');
        return sb.toString();
    }
}
