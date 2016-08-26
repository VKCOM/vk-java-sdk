package com.vk.api.sdk.objects.fave;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * FavesLink object
 */
public class FavesLink {
    /**
     * Link ID
     */
    @SerializedName("id")
    private Integer id;

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
     * URL of the preview image with 50 px in width
     */
    @SerializedName("photo_50")
    private String photo50;

    /**
     * URL of the preview image with 100 px in width
     */
    @SerializedName("photo_100")
    private String photo100;

    /**
     * URL of the preview image with 200 px in width
     */
    @SerializedName("photo_200")
    private String photo200;

    public Integer getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoto50() {
        return photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public String getPhoto200() {
        return photo200;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, description, photo50, id, photo200, title, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavesLink favesLink = (FavesLink) o;
        return Objects.equals(id, favesLink.id) &&
                Objects.equals(url, favesLink.url) &&
                Objects.equals(title, favesLink.title) &&
                Objects.equals(description, favesLink.description) &&
                Objects.equals(photo50, favesLink.photo50) &&
                Objects.equals(photo100, favesLink.photo100) &&
                Objects.equals(photo200, favesLink.photo200);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FavesLink{");
        sb.append("id=").append(id);
        sb.append(", url='").append(url).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", photo50='").append(photo50).append("'");
        sb.append(", photo100='").append(photo100).append("'");
        sb.append(", photo200='").append(photo200).append("'");
        sb.append('}');
        return sb.toString();
    }
}
