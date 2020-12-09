package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.photos.Photo;
import java.util.Objects;

/**
 * CropPhoto object
 */
public class CropPhoto implements Validable {
    @SerializedName("photo")
    @Required
    private Photo photo;

    @SerializedName("crop")
    @Required
    private CropPhotoCrop crop;

    @SerializedName("rect")
    @Required
    private CropPhotoRect rect;

    public Photo getPhoto() {
        return photo;
    }

    public CropPhoto setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public CropPhotoCrop getCrop() {
        return crop;
    }

    public CropPhoto setCrop(CropPhotoCrop crop) {
        this.crop = crop;
        return this;
    }

    public CropPhotoRect getRect() {
        return rect;
    }

    public CropPhoto setRect(CropPhotoRect rect) {
        this.rect = rect;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rect, photo, crop);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CropPhoto cropPhoto = (CropPhoto) o;
        return Objects.equals(rect, cropPhoto.rect) &&
                Objects.equals(photo, cropPhoto.photo) &&
                Objects.equals(crop, cropPhoto.crop);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CropPhoto{");
        sb.append("rect=").append(rect);
        sb.append(", photo=").append(photo);
        sb.append(", crop=").append(crop);
        sb.append('}');
        return sb.toString();
    }
}
