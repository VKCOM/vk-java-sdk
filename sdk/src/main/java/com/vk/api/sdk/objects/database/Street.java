package com.vk.api.sdk.objects.database;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Street object
 */
public class Street {
    /**
     * Street ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Street title
     */
    @SerializedName("title")
    private String title;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return Objects.equals(id, street.id) &&
                Objects.equals(title, street.title);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Street{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
