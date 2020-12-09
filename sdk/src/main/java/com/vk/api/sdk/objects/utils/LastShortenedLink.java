package com.vk.api.sdk.objects.utils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * LastShortenedLink object
 */
public class LastShortenedLink implements Validable {
    /**
     * Access key for private stats
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Link key (characters after vk.cc/)
     */
    @SerializedName("key")
    private String key;

    /**
     * Short link URL
     */
    @SerializedName("short_url")
    private URI shortUrl;

    /**
     * Creation time in Unixtime
     */
    @SerializedName("timestamp")
    private Integer timestamp;

    /**
     * Full URL
     */
    @SerializedName("url")
    private URI url;

    /**
     * Total views number
     */
    @SerializedName("views")
    private Integer views;

    public String getAccessKey() {
        return accessKey;
    }

    public LastShortenedLink setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public String getKey() {
        return key;
    }

    public LastShortenedLink setKey(String key) {
        this.key = key;
        return this;
    }

    public URI getShortUrl() {
        return shortUrl;
    }

    public LastShortenedLink setShortUrl(URI shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public LastShortenedLink setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public LastShortenedLink setUrl(URI url) {
        this.url = url;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public LastShortenedLink setViews(Integer views) {
        this.views = views;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey, shortUrl, key, url, views, timestamp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LastShortenedLink lastShortenedLink = (LastShortenedLink) o;
        return Objects.equals(accessKey, lastShortenedLink.accessKey) &&
                Objects.equals(key, lastShortenedLink.key) &&
                Objects.equals(url, lastShortenedLink.url) &&
                Objects.equals(views, lastShortenedLink.views) &&
                Objects.equals(shortUrl, lastShortenedLink.shortUrl) &&
                Objects.equals(timestamp, lastShortenedLink.timestamp);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LastShortenedLink{");
        sb.append("accessKey='").append(accessKey).append("'");
        sb.append(", key='").append(key).append("'");
        sb.append(", url=").append(url);
        sb.append(", views=").append(views);
        sb.append(", shortUrl=").append(shortUrl);
        sb.append(", timestamp=").append(timestamp);
        sb.append('}');
        return sb.toString();
    }
}
