package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URI;
import java.util.Objects;

/**
 * LinksItem object
 */
public class LinksItem implements Validable {
    /**
     * Link description
     */
    @SerializedName("desc")
    private String desc;

    /**
     * Information whether the link title can be edited
     */
    @SerializedName("edit_title")
    private BoolInt editTitle;

    /**
     * Link ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Link title
     */
    @SerializedName("name")
    private String name;

    /**
     * URL of square image of the link with 100 pixels in width
     */
    @SerializedName("photo_100")
    private URI photo100;

    /**
     * URL of square image of the link with 50 pixels in width
     */
    @SerializedName("photo_50")
    private URI photo50;

    /**
     * Link URL
     */
    @SerializedName("url")
    private URI url;

    public String getDesc() {
        return desc;
    }

    public LinksItem setDesc(String desc) {
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

    public LinksItem setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public LinksItem setName(String name) {
        this.name = name;
        return this;
    }

    public URI getPhoto100() {
        return photo100;
    }

    public LinksItem setPhoto100(URI photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URI getPhoto50() {
        return photo50;
    }

    public LinksItem setPhoto50(URI photo50) {
        this.photo50 = photo50;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public LinksItem setUrl(URI url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, editTitle, name, photo50, id, url, desc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinksItem linksItem = (LinksItem) o;
        return Objects.equals(editTitle, linksItem.editTitle) &&
                Objects.equals(photo50, linksItem.photo50) &&
                Objects.equals(name, linksItem.name) &&
                Objects.equals(id, linksItem.id) &&
                Objects.equals(photo100, linksItem.photo100) &&
                Objects.equals(url, linksItem.url) &&
                Objects.equals(desc, linksItem.desc);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LinksItem{");
        sb.append("editTitle=").append(editTitle);
        sb.append(", photo50=").append(photo50);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", photo100=").append(photo100);
        sb.append(", url=").append(url);
        sb.append(", desc='").append(desc).append("'");
        sb.append('}');
        return sb.toString();
    }
}
