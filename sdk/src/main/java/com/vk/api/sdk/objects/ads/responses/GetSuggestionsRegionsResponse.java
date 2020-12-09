package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GetSuggestionsRegionsResponse object
 */
public class GetSuggestionsRegionsResponse implements Validable {
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
     * Object type
     */
    @SerializedName("type")
    private String type;

    public Integer getId() {
        return id;
    }

    public GetSuggestionsRegionsResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetSuggestionsRegionsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public GetSuggestionsRegionsResponse setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSuggestionsRegionsResponse getSuggestionsRegionsResponse = (GetSuggestionsRegionsResponse) o;
        return Objects.equals(name, getSuggestionsRegionsResponse.name) &&
                Objects.equals(id, getSuggestionsRegionsResponse.id) &&
                Objects.equals(type, getSuggestionsRegionsResponse.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSuggestionsRegionsResponse{");
        sb.append("name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
