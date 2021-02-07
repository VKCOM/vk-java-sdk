package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetTagListResponse object
 */
public class GetTagListResponse implements Validable {
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("name")
    @Required
    private String name;

    @SerializedName("color")
    @Required
    private GetTagListResponseColor color;

    @SerializedName("uses")
    private Integer uses;

    public Integer getId() {
        return id;
    }

    public GetTagListResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetTagListResponse setName(String name) {
        this.name = name;
        return this;
    }

    public GetTagListResponseColor getColor() {
        return color;
    }

    public GetTagListResponse setColor(GetTagListResponseColor color) {
        this.color = color;
        return this;
    }

    public Integer getUses() {
        return uses;
    }

    public GetTagListResponse setUses(Integer uses) {
        this.uses = uses;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name, uses, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTagListResponse getTagListResponse = (GetTagListResponse) o;
        return Objects.equals(color, getTagListResponse.color) &&
                Objects.equals(name, getTagListResponse.name) &&
                Objects.equals(uses, getTagListResponse.uses) &&
                Objects.equals(id, getTagListResponse.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetTagListResponse{");
        sb.append("color='").append(color).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", uses=").append(uses);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
