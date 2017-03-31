package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ShortLink object
 */
public class ShortLink {
    /**
     * Short link URL
     */
    @SerializedName("short_url")
    private String shortUrl;

    /**
     * Full link URL
     */
    @SerializedName("url")
    private String url;

    /**
     * Short link key (characters after "vk.cc")
     */
    @SerializedName("key")
    private String key;

    /**
     * Access key for private stats
     */
    @SerializedName("access_key")
    private String accessKey;

    public String getShortUrl() {
        return shortUrl;
    }

    public String getUrl() {
        return url;
    }

    public String getKey() {
        return key;
    }

    public String getAccessKey() {
        return accessKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortLink shortLink = (ShortLink) o;
        return Objects.equals(shortUrl, shortLink.shortUrl) &&
                Objects.equals(url, shortLink.url) &&
                Objects.equals(key, shortLink.key) &&
                Objects.equals(accessKey, shortLink.accessKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortUrl, url, key, accessKey);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ShortLink{");
        sb.append("shortUrl='").append(shortUrl).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", key='").append(key).append('\'');
        sb.append(", accessKey='").append(accessKey).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
