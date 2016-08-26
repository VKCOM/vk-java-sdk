package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Occupation object
 */
public class Occupation {
    /**
     * Type of occupation
     */
    @SerializedName("type")
    private String type;

    /**
     * ID of school, university, company group
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Name of occupation
     */
    @SerializedName("name")
    private String name;

    public String getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Occupation occupation = (Occupation) o;
        return Objects.equals(type, occupation.type) &&
                Objects.equals(id, occupation.id) &&
                Objects.equals(name, occupation.name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Occupation{");
        sb.append("type='").append(type).append("'");
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append('}');
        return sb.toString();
    }
}
