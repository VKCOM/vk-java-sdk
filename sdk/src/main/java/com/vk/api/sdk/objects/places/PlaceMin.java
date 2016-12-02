package com.vk.api.sdk.objects.places;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * PlaceMin object
 */
public class PlaceMin {
    /**
     * Place ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Place title
     */
    @SerializedName("title")
    private String title;

    /**
     * Place latitude
     */
    @SerializedName("latitude")
    private Float latitude;

    /**
     * Place longitude
     */
    @SerializedName("longitude")
    private Float longitude;

    /**
     * Date of the place creation in Unixtime
     */
    @SerializedName("created")
    private Integer created;

    /**
     * URL of the place's icon
     */
    @SerializedName("icon")
    private String icon;

    /**
     * Checkins number
     */
    @SerializedName("checkins")
    private Integer checkins;

    /**
     * Place type
     */
    @SerializedName("type")
    private String type;

    /**
     * Country ID
     */
    @SerializedName("country")
    private Integer country;

    /**
     * City ID
     */
    @SerializedName("city")
    private Integer city;

    /**
     * Place address
     */
    @SerializedName("address")
    private String address;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public Integer getCreated() {
        return created;
    }

    public String getIcon() {
        return icon;
    }

    public Integer getCheckins() {
        return checkins;
    }

    public String getType() {
        return type;
    }

    public Integer getCountry() {
        return country;
    }

    public Integer getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, address, city, created, latitude, icon, id, title, type, checkins, longitude);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceMin place = (PlaceMin) o;
        return Objects.equals(id, place.id) &&
                Objects.equals(title, place.title) &&
                Objects.equals(latitude, place.latitude) &&
                Objects.equals(longitude, place.longitude) &&
                Objects.equals(created, place.created) &&
                Objects.equals(icon, place.icon) &&
                Objects.equals(checkins, place.checkins) &&
                Objects.equals(type, place.type) &&
                Objects.equals(country, place.country) &&
                Objects.equals(city, place.city) &&
                Objects.equals(address, place.address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlaceMin{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", created=").append(created);
        sb.append(", icon='").append(icon).append("'");
        sb.append(", checkins=").append(checkins);
        sb.append(", type='").append(type).append("'");
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", address='").append(address).append("'");
        sb.append('}');
        return sb.toString();
    }
}
