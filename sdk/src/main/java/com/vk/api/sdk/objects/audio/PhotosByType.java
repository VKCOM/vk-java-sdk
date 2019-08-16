package com.vk.api.sdk.objects.audio;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.Image;
import java.util.List;
import java.util.Objects;

/**
 * PhotosByType object
 */
public class PhotosByType implements Validable {
    /**
     * Photos type
     */
    @SerializedName("type")
    @Required
    private String type;

    /**
     * Photos
     */
    @SerializedName("photo")
    @Required
    private List<Image> photo;

    public String getType() {
        return type;
    }

    public PhotosByType setType(String type) {
        this.type = type;
        return this;
    }

    public List<Image> getPhoto() {
        return photo;
    }

    public PhotosByType setPhoto(List<Image> photo) {
        this.photo = photo;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotosByType photosByType = (PhotosByType) o;
        return Objects.equals(photo, photosByType.photo) &&
                Objects.equals(type, photosByType.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotosByType{");
        sb.append("photo=").append(photo);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
