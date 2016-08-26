package com.vk.api.sdk.objects.gifts;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Layout object
 */
public class Layout {
    /**
     * Gift ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * URL of the preview image with 256 px in width
     */
    @SerializedName("thumb_256")
    private String thumb256;

    /**
     * URL of the preview image with 96 px in width
     */
    @SerializedName("thumb_96")
    private String thumb96;

    /**
     * URL of the preview image with 48 px in width
     */
    @SerializedName("thumb_48")
    private String thumb48;

    public Integer getId() {
        return id;
    }

    public String getThumb256() {
        return thumb256;
    }

    public String getThumb96() {
        return thumb96;
    }

    public String getThumb48() {
        return thumb48;
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
        return Objects.equals(id, layout.id) &&
                Objects.equals(thumb256, layout.thumb256) &&
                Objects.equals(thumb96, layout.thumb96) &&
                Objects.equals(thumb48, layout.thumb48);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Layout{");
        sb.append("id=").append(id);
        sb.append(", thumb256='").append(thumb256).append("'");
        sb.append(", thumb96='").append(thumb96).append("'");
        sb.append(", thumb48='").append(thumb48).append("'");
        sb.append('}');
        return sb.toString();
    }
}
