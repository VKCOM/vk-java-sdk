package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * MarketCategoryTree object
 */
public class MarketCategoryTree implements Validable {
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

    @SerializedName("children")
    private List<MarketCategoryTree> children;

    public Integer getId() {
        return id;
    }

    public MarketCategoryTree setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public MarketCategoryTree setName(String name) {
        this.name = name;
        return this;
    }

    public List<MarketCategoryTree> getChildren() {
        return children;
    }

    public MarketCategoryTree setChildren(List<MarketCategoryTree> children) {
        this.children = children;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(children, name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketCategoryTree marketCategoryTree = (MarketCategoryTree) o;
        return Objects.equals(children, marketCategoryTree.children) &&
                Objects.equals(name, marketCategoryTree.name) &&
                Objects.equals(id, marketCategoryTree.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketCategoryTree{");
        sb.append("children=").append(children);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
