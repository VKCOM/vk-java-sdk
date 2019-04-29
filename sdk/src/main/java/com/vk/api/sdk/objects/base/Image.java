package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.net.URL;
import java.util.Objects;

/**
 * Image object
 */
public class Image {
    /**
     * Image height
     */
    @SerializedName("height")
    private Integer height;

    /**
     * Image url
     */
    @SerializedName("url")
    private URL url;

    /**
     * Image width
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

    public URL getUrl() {
        return url;
    }

    public Image setUrl(URL url) {
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
        return Objects.hash(width, url, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(width, image.width) &&
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
        sb.append(", url=").append(url);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
