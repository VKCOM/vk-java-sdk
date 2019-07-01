package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URL;
import java.util.Objects;

/**
 * LinkButtonAction object
 */
public class LinkButtonAction implements Validable {
    @SerializedName("type")
    private LinkButtonActionType type;

    /**
     * Action URL
     */
    @SerializedName("url")
    private URL url;

    public LinkButtonActionType getType() {
        return type;
    }

    public LinkButtonAction setType(LinkButtonActionType type) {
        this.type = type;
        return this;
    }

    public URL getUrl() {
        return url;
    }

    public LinkButtonAction setUrl(URL url) {
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
        LinkButtonAction linkButtonAction = (LinkButtonAction) o;
        return Objects.equals(type, linkButtonAction.type) &&
                Objects.equals(url, linkButtonAction.url);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LinkButtonAction{");
        sb.append("type=").append(type);
        sb.append(", url=").append(url);
        sb.append('}');
        return sb.toString();
    }
}
