package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * AppPost object
 */
public class AppPost implements Validable {
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
    private URI photo130;

    /**
     * URL of the preview image with 604 px in width
     */
    @SerializedName("photo_604")
    private URI photo604;

    public Integer getId() {
        return id;
    }

    public AppPost setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AppPost setName(String name) {
        this.name = name;
        return this;
    }

    public URI getPhoto130() {
        return photo130;
    }

    public AppPost setPhoto130(URI photo130) {
        this.photo130 = photo130;
        return this;
    }

    public URI getPhoto604() {
        return photo604;
    }

    public AppPost setPhoto604(URI photo604) {
        this.photo604 = photo604;
        return this;
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
        return Objects.equals(photo604, appPost.photo604) &&
                Objects.equals(name, appPost.name) &&
                Objects.equals(photo130, appPost.photo130) &&
                Objects.equals(id, appPost.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AppPost{");
        sb.append("photo604=").append(photo604);
        sb.append(", name='").append(name).append("'");
        sb.append(", photo130=").append(photo130);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
