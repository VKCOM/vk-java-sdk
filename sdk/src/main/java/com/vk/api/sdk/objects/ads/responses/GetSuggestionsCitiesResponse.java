package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GetSuggestionsCitiesResponse object
 */
public class GetSuggestionsCitiesResponse implements Validable {
    /**
     * Object ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Object name
     */
    @SerializedName("name")
    private String name;

    /**
     * Parent object
     */
    @SerializedName("parent")
    private String parent;

    public Integer getId() {
        return id;
    }

    public GetSuggestionsCitiesResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetSuggestionsCitiesResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getParent() {
        return parent;
    }

    public GetSuggestionsCitiesResponse setParent(String parent) {
        this.parent = parent;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSuggestionsCitiesResponse getSuggestionsCitiesResponse = (GetSuggestionsCitiesResponse) o;
        return Objects.equals(parent, getSuggestionsCitiesResponse.parent) &&
                Objects.equals(name, getSuggestionsCitiesResponse.name) &&
                Objects.equals(id, getSuggestionsCitiesResponse.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSuggestionsCitiesResponse{");
        sb.append("parent='").append(parent).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
