package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * BaseObjectWithName object
 */
public class BaseObjectWithName {
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

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseObjectWithName baseObject = (BaseObjectWithName) o;
        return Objects.equals(id, baseObject.id) &&
                Objects.equals(name, baseObject.name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseObjectWithName{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append('}');
        return sb.toString();
    }
}
