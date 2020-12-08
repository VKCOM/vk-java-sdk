package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URI;
import java.util.Objects;

/**
 * GroupLink object
 */
public class GroupLink implements Validable {
    /**
     * Link label
     */
    @SerializedName("name")
    private String name;

    /**
     * Link description
     */
    @SerializedName("desc")
    private String desc;

    /**
     * Information whether the title can be edited
     */
    @SerializedName("edit_title")
    private BoolInt editTitle;

    /**
     * Link ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Information whether the image on processing
     */
    @SerializedName("image_processing")
    private BoolInt imageProcessing;

    /**
     * Link URL
     */
    @SerializedName("url")
    private URI url;

    public String getName() {
        return name;
    }

    public GroupLink setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public GroupLink setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public boolean isEditTitle() {
        return editTitle == BoolInt.YES;
    }

    public BoolInt getEditTitle() {
        return editTitle;
    }

    public Integer getId() {
        return id;
    }

    public GroupLink setId(Integer id) {
        this.id = id;
        return this;
    }

    public boolean isImageProcessing() {
        return imageProcessing == BoolInt.YES;
    }

    public BoolInt getImageProcessing() {
        return imageProcessing;
    }

    public URI getUrl() {
        return url;
    }

    public GroupLink setUrl(URI url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(editTitle, name, id, imageProcessing, url, desc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupLink groupLink = (GroupLink) o;
        return Objects.equals(editTitle, groupLink.editTitle) &&
                Objects.equals(imageProcessing, groupLink.imageProcessing) &&
                Objects.equals(name, groupLink.name) &&
                Objects.equals(id, groupLink.id) &&
                Objects.equals(url, groupLink.url) &&
                Objects.equals(desc, groupLink.desc);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupLink{");
        sb.append("editTitle=").append(editTitle);
        sb.append(", imageProcessing=").append(imageProcessing);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", desc='").append(desc).append("'");
        sb.append('}');
        return sb.toString();
    }
}
