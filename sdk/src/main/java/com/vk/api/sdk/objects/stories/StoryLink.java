package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.net.URL;
import java.util.Objects;

/**
 * StoryLink object
 */
public class StoryLink {
    /**
     * Link text
     */
    @SerializedName("text")
    private String text;

    /**
     * Link URL
     */
    @SerializedName("url")
    private URL url;

    public String getText() {
        return text;
    }

    public StoryLink setText(String text) {
        this.text = text;
        return this;
    }

    public URL getUrl() {
        return url;
    }

    public StoryLink setUrl(URL url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoryLink storyLink = (StoryLink) o;
        return Objects.equals(text, storyLink.text) &&
                Objects.equals(url, storyLink.url);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StoryLink{");
        sb.append("text='").append(text).append("'");
        sb.append(", url=").append(url);
        sb.append('}');
        return sb.toString();
    }
}
