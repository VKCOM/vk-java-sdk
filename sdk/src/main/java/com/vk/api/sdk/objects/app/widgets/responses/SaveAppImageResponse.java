package com.vk.api.sdk.objects.app.widgets.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.app.widgets.ImageType;
import com.vk.api.sdk.objects.base.Image;

import java.util.List;
import java.util.Objects;

public class SaveAppImageResponse {

    @SerializedName("id")
    private String id;

    @SerializedName("type")
    private String type;

    @SerializedName("images")
    private List<Image> images;

    public String getId() {
        return id;
    }

    public List<Image> getImages() {
        return images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveAppImageResponse that = (SaveAppImageResponse) o;
        return Objects.equals(id, that.id) &&
                type == that.type &&
                Objects.equals(images, that.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, images);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SaveAppImageResponse{");
        sb.append("id='").append(id).append('\'');
        sb.append(", type=").append(type);
        sb.append(", images=").append(images);
        sb.append('}');
        return sb.toString();
    }
}
