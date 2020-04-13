package com.vk.api.sdk.objects.database;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BaseObject;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * City object
 */
public class City extends BaseObject implements Validable {
    /**
     * Area title
     */
    @SerializedName("area")
    private String area;

    /**
     * Region title
     */
    @SerializedName("region")
    private String region;

    /**
     * Information whether the city is included in important cities list
     */
    @SerializedName("important")
    private BoolInt important;

    public String getArea() {
        return area;
    }

    public City setArea(String area) {
        this.area = area;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public City setRegion(String region) {
        this.region = region;
        return this;
    }

    public boolean isImportant() {
        return important == BoolInt.YESBOOL;
    }

    public BoolInt getImportant() {
        return important;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, important, region);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(area, city.area) &&
                Objects.equals(important, city.important) &&
                Objects.equals(region, city.region);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("area='").append(area).append("'");
        sb.append(", important=").append(important);
        sb.append(", region='").append(region).append("'");
        sb.append('}');
        return sb.toString();
    }
}
