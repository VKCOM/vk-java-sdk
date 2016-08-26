package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * PostSource object
 */
public class PostSource {
    /**
     * Type of post source
     */
    @SerializedName("type")
    private PostSourceType type;

    /**
     * Platform name
     */
    @SerializedName("platform")
    private String platform;

    /**
     * Additional data
     */
    @SerializedName("data")
    private String data;

    /**
     * URL to an external site used to publish the post
     */
    @SerializedName("url")
    private String url;

    public PostSourceType getType() {
        return type;
    }

    public String getPlatform() {
        return platform;
    }

    public String getData() {
        return data;
    }

    public String getUrl() {
        return url;
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
        return Objects.equals(type, postSource.type) &&
                Objects.equals(platform, postSource.platform) &&
                Objects.equals(data, postSource.data) &&
                Objects.equals(url, postSource.url);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PostSource{");
        sb.append("type='").append(type).append("'");
        sb.append(", platform='").append(platform).append("'");
        sb.append(", data='").append(data).append("'");
        sb.append(", url='").append(url).append("'");
        sb.append('}');
        return sb.toString();
    }
}
