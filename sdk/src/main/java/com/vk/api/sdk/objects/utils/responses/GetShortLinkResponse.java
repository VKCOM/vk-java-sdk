package com.vk.api.sdk.objects.utils.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * GetShortLinkResponse object
 */
public class GetShortLinkResponse implements Validable {
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
     * Full URL
     */
    @SerializedName("url")
    private URI url;

    public String getAccessKey() {
        return accessKey;
    }

    public GetShortLinkResponse setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public String getKey() {
        return key;
    }

    public GetShortLinkResponse setKey(String key) {
        this.key = key;
        return this;
    }

    public URI getShortUrl() {
        return shortUrl;
    }

    public GetShortLinkResponse setShortUrl(URI shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public GetShortLinkResponse setUrl(URI url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey, shortUrl, key, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetShortLinkResponse getShortLinkResponse = (GetShortLinkResponse) o;
        return Objects.equals(accessKey, getShortLinkResponse.accessKey) &&
                Objects.equals(key, getShortLinkResponse.key) &&
                Objects.equals(url, getShortLinkResponse.url) &&
                Objects.equals(shortUrl, getShortLinkResponse.shortUrl);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetShortLinkResponse{");
        sb.append("accessKey='").append(accessKey).append("'");
        sb.append(", key='").append(key).append("'");
        sb.append(", url=").append(url);
        sb.append(", shortUrl=").append(shortUrl);
        sb.append('}');
        return sb.toString();
    }
}
