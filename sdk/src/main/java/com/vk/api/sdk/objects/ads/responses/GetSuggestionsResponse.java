package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GetSuggestionsResponse object
 */
public class GetSuggestionsResponse implements Validable {
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

    public Integer getId() {
        return id;
    }

    public GetSuggestionsResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetSuggestionsResponse setName(String name) {
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
        GetSuggestionsResponse getSuggestionsResponse = (GetSuggestionsResponse) o;
        return Objects.equals(name, getSuggestionsResponse.name) &&
                Objects.equals(id, getSuggestionsResponse.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSuggestionsResponse{");
        sb.append("name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
