package com.vk.api.sdk.objects.fave.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * AddTagResponse object
 */
public class AddTagResponse implements Validable {
    /**
     * Tag id
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Tag name
     */
    @SerializedName("name")
    private String name;

    public Integer getId() {
        return id;
    }

    public AddTagResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AddTagResponse setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddTagResponse addTagResponse = (AddTagResponse) o;
        return Objects.equals(name, addTagResponse.name) &&
                Objects.equals(id, addTagResponse.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AddTagResponse{");
        sb.append("name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
