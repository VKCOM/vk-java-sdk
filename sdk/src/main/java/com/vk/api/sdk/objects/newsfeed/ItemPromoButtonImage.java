package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ItemPromoButtonImage object
 */
public class ItemPromoButtonImage implements Validable {
    @SerializedName("width")
    private Integer width;

    @SerializedName("height")
    private Integer height;

    @SerializedName("url")
    private String url;

    public Integer getWidth() {
        return width;
    }

    public ItemPromoButtonImage setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public ItemPromoButtonImage setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ItemPromoButtonImage setUrl(String url) {
        this.url = url;
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
        ItemPromoButtonImage itemPromoButtonImage = (ItemPromoButtonImage) o;
        return Objects.equals(width, itemPromoButtonImage.width) &&
                Objects.equals(url, itemPromoButtonImage.url) &&
                Objects.equals(height, itemPromoButtonImage.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemPromoButtonImage{");
        sb.append("width=").append(width);
        sb.append(", url='").append(url).append("'");
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
