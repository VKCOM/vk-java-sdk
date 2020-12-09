package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * StoryLink object
 */
public class StoryLink implements Validable {
    /**
     * Link text
     */
    @SerializedName("text")
    @Required
    private String text;

    /**
     * Link URL
     */
    @SerializedName("url")
    @Required
    private URI url;

    public String getText() {
        return text;
    }

    public StoryLink setText(String text) {
        this.text = text;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public StoryLink setUrl(URI url) {
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
