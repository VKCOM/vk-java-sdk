package com.vk.api.sdk.objects.adsweb.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetAdCategoriesResponseCategoriesCategory object
 */
public class GetAdCategoriesResponseCategoriesCategory implements Validable {
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("name")
    @Required
    private String name;

    public Integer getId() {
        return id;
    }

    public GetAdCategoriesResponseCategoriesCategory setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetAdCategoriesResponseCategoriesCategory setName(String name) {
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
        GetAdCategoriesResponseCategoriesCategory getAdCategoriesResponseCategoriesCategory = (GetAdCategoriesResponseCategoriesCategory) o;
        return Objects.equals(name, getAdCategoriesResponseCategoriesCategory.name) &&
                Objects.equals(id, getAdCategoriesResponseCategoriesCategory.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAdCategoriesResponseCategoriesCategory{");
        sb.append("name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
