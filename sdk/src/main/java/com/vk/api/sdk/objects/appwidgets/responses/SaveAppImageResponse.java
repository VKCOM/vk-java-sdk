package com.vk.api.sdk.objects.appwidgets.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.Image;
import java.util.List;
import java.util.Objects;

/**
 * SaveAppImageResponse object
 */
public class SaveAppImageResponse implements Validable {
    /**
     * Image ID
     */
    @SerializedName("id")
    @Required
    private String id;

    @SerializedName("images")
    @Required
    private List<Image> images;

    public String getId() {
        return id;
    }

    public SaveAppImageResponse setId(String id) {
        this.id = id;
        return this;
    }

    public List<Image> getImages() {
        return images;
    }

    public SaveAppImageResponse setImages(List<Image> images) {
        this.images = images;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(images, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveAppImageResponse saveAppImageResponse = (SaveAppImageResponse) o;
        return Objects.equals(images, saveAppImageResponse.images) &&
                Objects.equals(id, saveAppImageResponse.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SaveAppImageResponse{");
        sb.append("images=").append(images);
        sb.append(", id='").append(id).append("'");
        sb.append('}');
        return sb.toString();
    }
}
