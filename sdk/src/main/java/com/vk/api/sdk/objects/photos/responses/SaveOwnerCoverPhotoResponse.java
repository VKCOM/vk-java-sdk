package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * SaveOwnerCoverPhotoResponse object
 */
public class SaveOwnerCoverPhotoResponse implements Validable {
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

    public SaveOwnerCoverPhotoResponse setId(String id) {
        this.id = id;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public SaveOwnerCoverPhotoResponse setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public SaveOwnerCoverPhotoResponse setUrl(URI url) {
        this.url = url;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public SaveOwnerCoverPhotoResponse setWidth(Integer width) {
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
        SaveOwnerCoverPhotoResponse saveOwnerCoverPhotoResponse = (SaveOwnerCoverPhotoResponse) o;
        return Objects.equals(width, saveOwnerCoverPhotoResponse.width) &&
                Objects.equals(id, saveOwnerCoverPhotoResponse.id) &&
                Objects.equals(url, saveOwnerCoverPhotoResponse.url) &&
                Objects.equals(height, saveOwnerCoverPhotoResponse.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SaveOwnerCoverPhotoResponse{");
        sb.append("width=").append(width);
        sb.append(", id='").append(id).append("'");
        sb.append(", url=").append(url);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
