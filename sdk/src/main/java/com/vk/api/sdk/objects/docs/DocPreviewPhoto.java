package com.vk.api.sdk.objects.docs;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.photos.PhotoSizes;

import java.util.List;
import java.util.Objects;

/**
 * DocPreviewPhoto object
 */
public class DocPreviewPhoto {

    @SerializedName("sizes")
    private List<PhotoSizes> sizes;

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPreviewPhoto that = (DocPreviewPhoto) o;
        return Objects.equals(sizes, that.sizes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizes);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocPreviewPhoto{");
        sb.append("sizes=").append(sizes);
        sb.append('}');
        return sb.toString();
    }
}
