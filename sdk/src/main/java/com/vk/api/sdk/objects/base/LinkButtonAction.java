package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * LinkButtonAction object
 */
public class LinkButtonAction {

    /**
     * Action type
     */
    @SerializedName("type")
    private LinkButtonActionType type;

    /**
     * Action URL
     */
    @SerializedName("url")
    private String url;

    public LinkButtonActionType getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkButtonAction that = (LinkButtonAction) o;
        return type == that.type &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, url);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkButtonAction{");
        sb.append("type=").append(type);
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
