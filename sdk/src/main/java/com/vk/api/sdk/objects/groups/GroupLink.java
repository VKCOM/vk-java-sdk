package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * GroupLink object
 */
public class GroupLink {
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
     * Information whether the title can be edited
     */
    @SerializedName("edit_title")
    private BoolInt editTitle;

    /**
     * Link description
     */
    @SerializedName("desc")
    private String desc;

    /**
     * Information whether the image on processing
     */
    @SerializedName("image_processing")
    private BoolInt imageProcessing;

    public Integer getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public boolean isEditTitle() {
        return editTitle == BoolInt.YES;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isImageProcessing() {
        return imageProcessing == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(editTitle, id, imageProcessing, url, desc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupLink groupLink = (GroupLink) o;
        return Objects.equals(id, groupLink.id) &&
                Objects.equals(url, groupLink.url) &&
                Objects.equals(editTitle, groupLink.editTitle) &&
                Objects.equals(desc, groupLink.desc) &&
                Objects.equals(imageProcessing, groupLink.imageProcessing);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupLink{");
        sb.append("id=").append(id);
        sb.append(", url='").append(url).append("'");
        sb.append(", editTitle=").append(editTitle);
        sb.append(", desc='").append(desc).append("'");
        sb.append(", imageProcessing=").append(imageProcessing);
        sb.append('}');
        return sb.toString();
    }
}
