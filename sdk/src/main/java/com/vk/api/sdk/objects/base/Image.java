package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * Image object
 */
public class Image implements Validable {
    @SerializedName("id")
    private String id;

    /**
     * Image height
     */
    @SerializedName("height")
    @Required
    private Integer height;

    /**
     * Image url
     */
    @SerializedName("url")
    @Required
    private URI url;

    /**
     * Image width
     */
    @SerializedName("width")
    @Required
    private Integer width;

    public String getId() {
        return id;
    }

    public Image setId(String id) {
        this.id = id;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Image setHeight(Integer height) {
        this.height = height;
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
        return Objects.hash(width, id, url, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(width, image.width) &&
                Objects.equals(id, image.id) &&
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
        sb.append(", id='").append(id).append("'");
        sb.append(", url=").append(url);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
