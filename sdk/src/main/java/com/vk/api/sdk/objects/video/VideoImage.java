package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.Image;
import com.vk.api.sdk.objects.base.PropertyExists;
import java.util.Objects;

/**
 * VideoImage object
 */
public class VideoImage extends Image implements Validable {
    @SerializedName("with_padding")
    private PropertyExists withPadding;

    public boolean isWithPadding() {
        return withPadding == PropertyExists.PROPERTY_EXISTS;
    }

    @Override
    public int hashCode() {
        return Objects.hash(withPadding);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoImage videoImage = (VideoImage) o;
        return Objects.equals(withPadding, videoImage.withPadding);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VideoImage{");
        sb.append("withPadding=").append(withPadding);
        sb.append('}');
        return sb.toString();
    }
}
