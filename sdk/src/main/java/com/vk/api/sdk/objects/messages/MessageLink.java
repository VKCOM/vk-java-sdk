package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * MessageLink object
 */
public class MessageLink {
    /**
     * Link URL
     */
    @SerializedName("url")
    private String url;

    /**
     * Link title
     */
    @SerializedName("title")
    private String title;

    /**
     * Link description
     */
    @SerializedName("description")
    private String description;

    /**
     * URL of the preview image
     */
    @SerializedName("image_src")
    private String imageSrc;

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, imageSrc, title, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageLink messageLink = (MessageLink) o;
        return Objects.equals(url, messageLink.url) &&
                Objects.equals(title, messageLink.title) &&
                Objects.equals(description, messageLink.description) &&
                Objects.equals(imageSrc, messageLink.imageSrc);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MessageLink{");
        sb.append("url='").append(url).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", imageSrc='").append(imageSrc).append("'");
        sb.append('}');
        return sb.toString();
    }
}
