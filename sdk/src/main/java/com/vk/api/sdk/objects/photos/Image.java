package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * Image object
 */
public class Image implements Validable {
    /**
     * Height of the photo in px.
     */
    @SerializedName("height")
    private Integer height;

    @SerializedName("type")
    private ImageType type;

    /**
     * Photo URL.
     */
    @SerializedName("url")
    private URI url;

    /**
     * Width of the photo in px.
     */
    @SerializedName("width")
    private Integer width;

    public Integer getHeight() {
        return height;
    }

    public Image setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public ImageType getType() {
        return type;
    }

    public Image setType(ImageType type) {
        this.type = type;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public Image setUrl(URI url) {
        this.url = url;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public Image setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, type, url, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(width, image.width) &&
                Objects.equals(type, image.type) &&
                Objects.equals(url, image.url) &&
                Objects.equals(height, image.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Image{");
        sb.append("width=").append(width);
        sb.append(", type=").append(type);
        sb.append(", url=").append(url);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
