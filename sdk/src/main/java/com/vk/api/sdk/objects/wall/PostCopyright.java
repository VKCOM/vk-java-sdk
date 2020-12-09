package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * PostCopyright object
 */
public class PostCopyright implements Validable {
    @SerializedName("id")
    private Integer id;

    @SerializedName("link")
    @Required
    private String link;

    @SerializedName("name")
    @Required
    private String name;

    @SerializedName("type")
    @Required
    private String type;

    public Integer getId() {
        return id;
    }

    public PostCopyright setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLink() {
        return link;
    }

    public PostCopyright setLink(String link) {
        this.link = link;
        return this;
    }

    public String getName() {
        return name;
    }

    public PostCopyright setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public PostCopyright setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, name, id, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostCopyright postCopyright = (PostCopyright) o;
        return Objects.equals(link, postCopyright.link) &&
                Objects.equals(name, postCopyright.name) &&
                Objects.equals(id, postCopyright.id) &&
                Objects.equals(type, postCopyright.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PostCopyright{");
        sb.append("link='").append(link).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
