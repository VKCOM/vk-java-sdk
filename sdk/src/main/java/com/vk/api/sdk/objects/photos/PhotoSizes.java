package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URL;
import java.util.Objects;

/**
 * PhotoSizes object
 */
public class PhotoSizes implements Validable {
    /**
     * Height in px
     */
    @SerializedName("height")
    @Required
    private Integer height;

    /**
     * URL of the image
     */
    @SerializedName("url")
    @Required
    private URL url;

    @SerializedName("type")
    @Required
    private PhotoSizesType type;

    /**
     * Width in px
     */
    @SerializedName("width")
    @Required
    private Integer width;

    public Integer getHeight() {
        return height;
    }

    public PhotoSizes setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public URL getUrl() {
        return url;
    }

    public PhotoSizes setUrl(URL url) {
        this.url = url;
        return this;
    }

    public PhotoSizesType getType() {
        return type;
    }

    public PhotoSizes setType(PhotoSizesType type) {
        this.type = type;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public PhotoSizes setWidth(Integer width) {
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
        PhotoSizes photoSizes = (PhotoSizes) o;
        return Objects.equals(width, photoSizes.width) &&
                Objects.equals(type, photoSizes.type) &&
                Objects.equals(url, photoSizes.url) &&
                Objects.equals(height, photoSizes.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoSizes{");
        sb.append("width=").append(width);
        sb.append(", type=").append(type);
        sb.append(", url=").append(url);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
