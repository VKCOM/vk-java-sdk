package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Geo object
 */
public class Geo {
    /**
     * Place type
     */
    @SerializedName("type")
    private String type;

    /**
     * String with coordinates
     */
    @SerializedName("coordinates")
    private String coordinates;

    @SerializedName("place")
    private Place place;

    /**
     * Information whether a map is showed
     */
    @SerializedName("showmap")
    private Integer showmap;

    public String getType() {
        return type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public Place getPlace() {
        return place;
    }

    public Integer getShowmap() {
        return showmap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(showmap, coordinates, place, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geo geo = (Geo) o;
        return Objects.equals(type, geo.type) &&
                Objects.equals(coordinates, geo.coordinates) &&
                Objects.equals(place, geo.place) &&
                Objects.equals(showmap, geo.showmap);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Geo{");
        sb.append("type='").append(type).append("'");
        sb.append(", coordinates='").append(coordinates).append("'");
        sb.append(", place=").append(place);
        sb.append(", showmap=").append(showmap);
        sb.append('}');
        return sb.toString();
    }
}
