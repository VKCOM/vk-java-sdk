package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * DocPreviewPhoto object
 */
public class DocPreviewPhoto implements Validable {
    @SerializedName("sizes")
    private List<DocPreviewPhotoSizes> sizes;

    public List<DocPreviewPhotoSizes> getSizes() {
        return sizes;
    }

    public DocPreviewPhoto setSizes(List<DocPreviewPhotoSizes> sizes) {
        this.sizes = sizes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPreviewPhoto docPreviewPhoto = (DocPreviewPhoto) o;
        return Objects.equals(sizes, docPreviewPhoto.sizes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DocPreviewPhoto{");
        sb.append("sizes=").append(sizes);
        sb.append('}');
        return sb.toString();
    }
}
