package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Image;
import java.util.List;
import java.util.Objects;

/**
 * Cover object
 */
public class Cover implements Validable {
    /**
     * Information whether cover is enabled
     */
    @SerializedName("enabled")
    @Required
    private BoolInt enabled;

    @SerializedName("images")
    private List<Image> images;

    public boolean isEnabled() {
        return enabled == BoolInt.YESBOOL;
    }

    public BoolInt getEnabled() {
        return enabled;
    }

    public List<Image> getImages() {
        return images;
    }

    public Cover setImages(List<Image> images) {
        this.images = images;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(images, enabled);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cover cover = (Cover) o;
        return Objects.equals(images, cover.images) &&
                Objects.equals(enabled, cover.enabled);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Cover{");
        sb.append("images=").append(images);
        sb.append(", enabled=").append(enabled);
        sb.append('}');
        return sb.toString();
    }
}
