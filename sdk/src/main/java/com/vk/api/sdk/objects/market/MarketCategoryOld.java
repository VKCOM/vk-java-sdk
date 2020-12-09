package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * MarketCategoryOld object
 */
public class MarketCategoryOld implements Validable {
    /**
     * Category ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Category name
     */
    @SerializedName("name")
    @Required
    private String name;

    @SerializedName("section")
    @Required
    private Section section;

    public Integer getId() {
        return id;
    }

    public MarketCategoryOld setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public MarketCategoryOld setName(String name) {
        this.name = name;
        return this;
    }

    public Section getSection() {
        return section;
    }

    public MarketCategoryOld setSection(Section section) {
        this.section = section;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, section, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketCategoryOld marketCategoryOld = (MarketCategoryOld) o;
        return Objects.equals(name, marketCategoryOld.name) &&
                Objects.equals(section, marketCategoryOld.section) &&
                Objects.equals(id, marketCategoryOld.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketCategoryOld{");
        sb.append("name='").append(name).append("'");
        sb.append(", section=").append(section);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
