package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GroupAttach object
 */
public class GroupAttach implements Validable {
    /**
     * group ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * text of attach
     */
    @SerializedName("text")
    @Required
    private String text;

    /**
     * activity or category of group
     */
    @SerializedName("status")
    @Required
    private String status;

    /**
     * size of group
     */
    @SerializedName("size")
    @Required
    private Integer size;

    /**
     * is favorite
     */
    @SerializedName("is_favorite")
    private Boolean isFavorite;

    public Integer getId() {
        return id;
    }

    public GroupAttach setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public GroupAttach setText(String text) {
        this.text = text;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GroupAttach setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public GroupAttach setSize(Integer size) {
        this.size = size;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public GroupAttach setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, id, text, isFavorite, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupAttach groupAttach = (GroupAttach) o;
        return Objects.equals(isFavorite, groupAttach.isFavorite) &&
                Objects.equals(size, groupAttach.size) &&
                Objects.equals(id, groupAttach.id) &&
                Objects.equals(text, groupAttach.text) &&
                Objects.equals(status, groupAttach.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupAttach{");
        sb.append("isFavorite=").append(isFavorite);
        sb.append(", size=").append(size);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
