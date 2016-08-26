package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * PhotoSizes object
 */
public class PhotoSizes {
    /**
     * URL of the image
     */
    @SerializedName("src")
    private String src;

    /**
     * Width in px
     */
    @SerializedName("width")
    private Integer width;

    /**
     * Height in px
     */
    @SerializedName("height")
    private Integer height;

    /**
     * Size type
     */
    @SerializedName("type")
    private PhotoSizesType type;

    public String getSrc() {
        return src;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public PhotoSizesType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(src, width, type, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoSizes photoSizes = (PhotoSizes) o;
        return Objects.equals(src, photoSizes.src) &&
                Objects.equals(width, photoSizes.width) &&
                Objects.equals(height, photoSizes.height) &&
                Objects.equals(type, photoSizes.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhotoSizes{");
        sb.append("src='").append(src).append("'");
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
