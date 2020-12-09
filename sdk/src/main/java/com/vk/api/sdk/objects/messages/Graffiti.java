package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * Graffiti object
 */
public class Graffiti implements Validable {
    /**
     * Access key for graffiti
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Graffiti height
     */
    @SerializedName("height")
    @Required
    private Integer height;

    /**
     * Graffiti ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Graffiti owner ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Graffiti URL
     */
    @SerializedName("url")
    @Required
    private URI url;

    /**
     * Graffiti width
     */
    @SerializedName("width")
    @Required
    private Integer width;

    public String getAccessKey() {
        return accessKey;
    }

    public Graffiti setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Graffiti setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Graffiti setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Graffiti setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public Graffiti setUrl(URI url) {
        this.url = url;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public Graffiti setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey, width, id, ownerId, url, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Graffiti graffiti = (Graffiti) o;
        return Objects.equals(ownerId, graffiti.ownerId) &&
                Objects.equals(accessKey, graffiti.accessKey) &&
                Objects.equals(width, graffiti.width) &&
                Objects.equals(id, graffiti.id) &&
                Objects.equals(url, graffiti.url) &&
                Objects.equals(height, graffiti.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Graffiti{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", width=").append(width);
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
