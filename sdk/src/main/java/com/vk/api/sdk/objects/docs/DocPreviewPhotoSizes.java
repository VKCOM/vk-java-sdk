package com.vk.api.sdk.objects.docs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.photos.PhotoSizesType;
import java.net.URI;
import java.util.Objects;

/**
 * DocPreviewPhotoSizes object
 */
public class DocPreviewPhotoSizes implements Validable {
    /**
     * URL of the image
     */
    @SerializedName("src")
    @Required
    private URI src;

    /**
     * Width in px
     */
    @SerializedName("width")
    @Required
    private Integer width;

    /**
     * Height in px
     */
    @SerializedName("height")
    @Required
    private Integer height;

    @SerializedName("type")
    @Required
    private PhotoSizesType type;

    public URI getSrc() {
        return src;
    }

    public DocPreviewPhotoSizes setSrc(URI src) {
        this.src = src;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public DocPreviewPhotoSizes setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public DocPreviewPhotoSizes setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public PhotoSizesType getType() {
        return type;
    }

    public DocPreviewPhotoSizes setType(PhotoSizesType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(src, width, type, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPreviewPhotoSizes docPreviewPhotoSizes = (DocPreviewPhotoSizes) o;
        return Objects.equals(src, docPreviewPhotoSizes.src) &&
                Objects.equals(width, docPreviewPhotoSizes.width) &&
                Objects.equals(type, docPreviewPhotoSizes.type) &&
                Objects.equals(height, docPreviewPhotoSizes.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DocPreviewPhotoSizes{");
        sb.append("src=").append(src);
        sb.append(", width=").append(width);
        sb.append(", type=").append(type);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
