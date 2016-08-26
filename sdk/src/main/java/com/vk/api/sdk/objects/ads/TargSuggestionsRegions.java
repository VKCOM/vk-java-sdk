package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * TargSuggestionsRegions object
 */
public class TargSuggestionsRegions {
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

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargSuggestionsRegions targSuggestionsRegions = (TargSuggestionsRegions) o;
        return Objects.equals(id, targSuggestionsRegions.id) &&
                Objects.equals(name, targSuggestionsRegions.name) &&
                Objects.equals(type, targSuggestionsRegions.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TargSuggestionsRegions{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
