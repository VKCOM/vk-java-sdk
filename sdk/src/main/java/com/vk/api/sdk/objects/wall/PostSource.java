package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * PostSource object
 */
public class PostSource implements Validable {
    /**
     * Additional data
     */
    @SerializedName("data")
    private String data;

    /**
     * Platform name
     */
    @SerializedName("platform")
    private String platform;

    @SerializedName("type")
    private PostSourceType type;

    /**
     * URL to an external site used to publish the post
     */
    @SerializedName("url")
    private URI url;

    public String getData() {
        return data;
    }

    public PostSource setData(String data) {
        this.data = data;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public PostSource setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public PostSourceType getType() {
        return type;
    }

    public PostSource setType(PostSourceType type) {
        this.type = type;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public PostSource setUrl(URI url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, type, platform, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostSource postSource = (PostSource) o;
        return Objects.equals(data, postSource.data) &&
                Objects.equals(type, postSource.type) &&
                Objects.equals(platform, postSource.platform) &&
                Objects.equals(url, postSource.url);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PostSource{");
        sb.append("data='").append(data).append("'");
        sb.append(", type=").append(type);
        sb.append(", platform='").append(platform).append("'");
        sb.append(", url=").append(url);
        sb.append('}');
        return sb.toString();
    }
}
