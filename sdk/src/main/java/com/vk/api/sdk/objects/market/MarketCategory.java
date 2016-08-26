package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * MarketCategory object
 */
public class MarketCategory {
    /**
     * Category ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Category name
     */
    @SerializedName("name")
    private String name;

    @SerializedName("section")
    private Section section;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Section getSection() {
        return section;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, section, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketCategory marketCategory = (MarketCategory) o;
        return Objects.equals(id, marketCategory.id) &&
                Objects.equals(name, marketCategory.name) &&
                Objects.equals(section, marketCategory.section);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketCategory{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", section=").append(section);
        sb.append('}');
        return sb.toString();
    }
}
