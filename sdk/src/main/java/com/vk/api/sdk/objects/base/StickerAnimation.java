package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * StickerAnimation object
 */
public class StickerAnimation implements Validable {
    /**
     * Type of animation script
     */
    @SerializedName("type")
    private StickerAnimationType type;

    /**
     * URL of animation script
     */
    @SerializedName("url")
    private URI url;

    public StickerAnimationType getType() {
        return type;
    }

    public StickerAnimation setType(StickerAnimationType type) {
        this.type = type;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public StickerAnimation setUrl(URI url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StickerAnimation stickerAnimation = (StickerAnimation) o;
        return Objects.equals(type, stickerAnimation.type) &&
                Objects.equals(url, stickerAnimation.url);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StickerAnimation{");
        sb.append("type='").append(type).append("'");
        sb.append(", url=").append(url);
        sb.append('}');
        return sb.toString();
    }
}
