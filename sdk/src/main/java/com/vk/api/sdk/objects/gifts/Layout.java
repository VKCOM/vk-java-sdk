package com.vk.api.sdk.objects.gifts;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URL;
import java.util.Objects;

/**
 * Layout object
 */
public class Layout implements Validable {
    /**
     * Gift ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * URL of the preview image with 256 px in width
     */
    @SerializedName("thumb_256")
    private URL thumb256;

    /**
     * URL of the preview image with 48 px in width
     */
    @SerializedName("thumb_48")
    private URL thumb48;

    /**
     * URL of the preview image with 96 px in width
     */
    @SerializedName("thumb_96")
    private URL thumb96;

    public Integer getId() {
        return id;
    }

    public Layout setId(Integer id) {
        this.id = id;
        return this;
    }

    public URL getThumb256() {
        return thumb256;
    }

    public Layout setThumb256(URL thumb256) {
        this.thumb256 = thumb256;
        return this;
    }

    public URL getThumb48() {
        return thumb48;
    }

    public Layout setThumb48(URL thumb48) {
        this.thumb48 = thumb48;
        return this;
    }

    public URL getThumb96() {
        return thumb96;
    }

    public Layout setThumb96(URL thumb96) {
        this.thumb96 = thumb96;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(thumb48, thumb256, id, thumb96);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Layout layout = (Layout) o;
        return Objects.equals(thumb96, layout.thumb96) &&
                Objects.equals(thumb48, layout.thumb48) &&
                Objects.equals(id, layout.id) &&
                Objects.equals(thumb256, layout.thumb256);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Layout{");
        sb.append("thumb96=").append(thumb96);
        sb.append(", thumb48=").append(thumb48);
        sb.append(", id=").append(id);
        sb.append(", thumb256=").append(thumb256);
        sb.append('}');
        return sb.toString();
    }
}
