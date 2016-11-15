package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Country object
 */
public class Country {

    @SerializedName("visitors")
    private Integer visitors;

    /**
     * Country ID
     */
    @SerializedName("value")
    private String value;

    /**
     * Country code
     */
    @SerializedName("code")
    private String code;

    /**
     * Country name
     */
    @SerializedName("name")
    private String name;

    public Integer getVisitors() {
        return visitors;
    }

    public String getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(visitors, country.visitors) &&
                Objects.equals(value, country.value) &&
                Objects.equals(code, country.code) &&
                Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visitors, value, code, name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Country{");
        sb.append("visitors=").append(visitors);
        sb.append(", value='").append(value).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
