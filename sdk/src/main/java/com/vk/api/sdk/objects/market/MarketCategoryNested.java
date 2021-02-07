package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * MarketCategoryNested object
 */
public class MarketCategoryNested implements Validable {
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

    @SerializedName("parent")
    private MarketCategoryNested parent;

    public Integer getId() {
        return id;
    }

    public MarketCategoryNested setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public MarketCategoryNested setName(String name) {
        this.name = name;
        return this;
    }

    public MarketCategoryNested getParent() {
        return parent;
    }

    public MarketCategoryNested setParent(MarketCategoryNested parent) {
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
        MarketCategoryNested marketCategoryNested = (MarketCategoryNested) o;
        return Objects.equals(parent, marketCategoryNested.parent) &&
                Objects.equals(name, marketCategoryNested.name) &&
                Objects.equals(id, marketCategoryNested.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketCategoryNested{");
        sb.append("parent=").append(parent);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
