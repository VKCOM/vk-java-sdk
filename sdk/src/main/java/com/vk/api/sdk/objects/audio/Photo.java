package com.vk.api.sdk.objects.audio;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URL;
import java.util.List;
import java.util.Objects;

/**
 * Photo object
 */
public class Photo implements Validable {
    /**
     * Photo width
     */
    @SerializedName("width")
    @Required
    private Integer width;

    /**
     * Photo height
     */
    @SerializedName("height")
    @Required
    private Integer height;

    /**
     * Photo size 34
     */
    @SerializedName("photo_34")
    private URL photo34;

    /**
     * Photo size 68
     */
    @SerializedName("photo_68")
    private URL photo68;

    /**
     * Photo size 135
     */
    @SerializedName("photo_135")
    private URL photo135;

    /**
     * Photo size 270
     */
    @SerializedName("photo_270")
    private URL photo270;

    /**
     * Photo size 300
     */
    @SerializedName("photo_300")
    private URL photo300;

    /**
     * Photo size 600
     */
    @SerializedName("photo_600")
    private URL photo600;

    /**
     * Photo sizes
     */
    @SerializedName("sizes")
    private List<PhotoSizes> sizes;

    public Integer getWidth() {
        return width;
    }

    public Photo setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Photo setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public URL getPhoto34() {
        return photo34;
    }

    public Photo setPhoto34(URL photo34) {
        this.photo34 = photo34;
        return this;
    }

    public URL getPhoto68() {
        return photo68;
    }

    public Photo setPhoto68(URL photo68) {
        this.photo68 = photo68;
        return this;
    }

    public URL getPhoto135() {
        return photo135;
    }

    public Photo setPhoto135(URL photo135) {
        this.photo135 = photo135;
        return this;
    }

    public URL getPhoto270() {
        return photo270;
    }

    public Photo setPhoto270(URL photo270) {
        this.photo270 = photo270;
        return this;
    }

    public URL getPhoto300() {
        return photo300;
    }

    public Photo setPhoto300(URL photo300) {
        this.photo300 = photo300;
        return this;
    }

    public URL getPhoto600() {
        return photo600;
    }

    public Photo setPhoto600(URL photo600) {
        this.photo600 = photo600;
        return this;
    }

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    public Photo setSizes(List<PhotoSizes> sizes) {
        this.sizes = sizes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo68, photo270, sizes, photo34, width, photo135, photo300, photo600, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Objects.equals(photo600, photo.photo600) &&
                Objects.equals(photo34, photo.photo34) &&
                Objects.equals(photo68, photo.photo68) &&
                Objects.equals(sizes, photo.sizes) &&
                Objects.equals(photo270, photo.photo270) &&
                Objects.equals(width, photo.width) &&
                Objects.equals(photo135, photo.photo135) &&
                Objects.equals(photo300, photo.photo300) &&
                Objects.equals(height, photo.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Photo{");
        sb.append("photo600=").append(photo600);
        sb.append(", photo34=").append(photo34);
        sb.append(", photo68=").append(photo68);
        sb.append(", sizes=").append(sizes);
        sb.append(", photo270=").append(photo270);
        sb.append(", width=").append(width);
        sb.append(", photo135=").append(photo135);
        sb.append(", photo300=").append(photo300);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
