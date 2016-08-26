package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * LinkButton object
 */
public class LinkButton {
    /**
     * Button URL
     */
    @SerializedName("url")
    private String url;

    /**
     * Button title
     */
    @SerializedName("title")
    private String title;

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkButton linkButton = (LinkButton) o;
        return Objects.equals(url, linkButton.url) &&
                Objects.equals(title, linkButton.title);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkButton{");
        sb.append("url='").append(url).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
