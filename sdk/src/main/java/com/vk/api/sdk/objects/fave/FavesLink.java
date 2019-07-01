package com.vk.api.sdk.objects.fave;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URL;
import java.util.Objects;

/**
 * FavesLink object
 */
public class FavesLink implements Validable {
    /**
     * Link description
     */
    @SerializedName("description")
    private String description;

    /**
     * Link ID
     */
    @SerializedName("id")
    private String id;

    /**
     * URL of the preview image with 100 px in width
     */
    @SerializedName("photo_100")
    private URL photo100;

    /**
     * URL of the preview image with 200 px in width
     */
    @SerializedName("photo_200")
    private URL photo200;

    /**
     * URL of the preview image with 50 px in width
     */
    @SerializedName("photo_50")
    private URL photo50;

    /**
     * Link title
     */
    @SerializedName("title")
    private URL title;

    /**
     * Link URL
     */
    @SerializedName("url")
    private URL url;

    public String getDescription() {
        return description;
    }

    public FavesLink setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getId() {
        return id;
    }

    public FavesLink setId(String id) {
        this.id = id;
        return this;
    }

    public URL getPhoto100() {
        return photo100;
    }

    public FavesLink setPhoto100(URL photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URL getPhoto200() {
        return photo200;
    }

    public FavesLink setPhoto200(URL photo200) {
        this.photo200 = photo200;
        return this;
    }

    public URL getPhoto50() {
        return photo50;
    }

    public FavesLink setPhoto50(URL photo50) {
        this.photo50 = photo50;
        return this;
    }

    public URL getTitle() {
        return title;
    }

    public FavesLink setTitle(URL title) {
        this.title = title;
        return this;
    }

    public URL getUrl() {
        return url;
    }

    public FavesLink setUrl(URL url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, photo50, description, id, photo200, title, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavesLink favesLink = (FavesLink) o;
        return Objects.equals(photo50, favesLink.photo50) &&
                Objects.equals(description, favesLink.description) &&
                Objects.equals(id, favesLink.id) &&
                Objects.equals(photo100, favesLink.photo100) &&
                Objects.equals(title, favesLink.title) &&
                Objects.equals(photo200, favesLink.photo200) &&
                Objects.equals(url, favesLink.url);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("FavesLink{");
        sb.append("photo50=").append(photo50);
        sb.append(", description='").append(description).append("'");
        sb.append(", id='").append(id).append("'");
        sb.append(", photo100=").append(photo100);
        sb.append(", title=").append(title);
        sb.append(", photo200=").append(photo200);
        sb.append(", url=").append(url);
        sb.append('}');
        return sb.toString();
    }
}
