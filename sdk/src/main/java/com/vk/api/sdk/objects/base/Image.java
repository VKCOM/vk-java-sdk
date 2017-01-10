package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Image object
 */
public class Image {

    /**
     * Image URL
     */
    @SerializedName("url")
    private String url;

    /**
     * Image width
     */
    @SerializedName("width")
    private Integer width;

    /**
     * Image height
     */
    @SerializedName("height")
    private Integer height;

    public String getUrl() {
        return url;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(url, image.url) &&
                Objects.equals(width, image.width) &&
                Objects.equals(height, image.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, width, height);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Image{");
        sb.append("url='").append(url).append('\'');
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
