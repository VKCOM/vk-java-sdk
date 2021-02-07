package com.vk.api.sdk.objects.database.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetCountriesByIdResponse object
 */
public class GetCountriesByIdResponse implements Validable {
    /**
     * Country ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Country title
     */
    @SerializedName("title")
    @Required
    private String title;

    public Integer getId() {
        return id;
    }

    public GetCountriesByIdResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GetCountriesByIdResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCountriesByIdResponse getCountriesByIdResponse = (GetCountriesByIdResponse) o;
        return Objects.equals(id, getCountriesByIdResponse.id) &&
                Objects.equals(title, getCountriesByIdResponse.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCountriesByIdResponse{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
