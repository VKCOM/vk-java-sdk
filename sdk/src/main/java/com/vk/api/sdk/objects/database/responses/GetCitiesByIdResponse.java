package com.vk.api.sdk.objects.database.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetCitiesByIdResponse object
 */
public class GetCitiesByIdResponse implements Validable {
    /**
     * Object ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Object title
     */
    @SerializedName("title")
    @Required
    private String title;

    public Integer getId() {
        return id;
    }

    public GetCitiesByIdResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GetCitiesByIdResponse setTitle(String title) {
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
        GetCitiesByIdResponse getCitiesByIdResponse = (GetCitiesByIdResponse) o;
        return Objects.equals(id, getCitiesByIdResponse.id) &&
                Objects.equals(title, getCitiesByIdResponse.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCitiesByIdResponse{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
