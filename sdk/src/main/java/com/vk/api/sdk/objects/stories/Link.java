package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Link {

    @SerializedName("text")
    private String text;

    @SerializedName("url")
    private String url;

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link storyLink = (Link) o;
        return Objects.equals(text, storyLink.text) &&
            Objects.equals(url, storyLink.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, url);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Link{");
        sb.append("text='").append(text).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
