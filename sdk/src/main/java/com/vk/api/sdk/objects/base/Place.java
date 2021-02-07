package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * Place object
 */
public class Place implements Validable {
    /**
     * Place address
     */
    @SerializedName("address")
    private String address;

    /**
     * Checkins number
     */
    @SerializedName("checkins")
    private Integer checkins;

    /**
     * City name
     */
    @SerializedName("city")
    private String city;

    /**
     * Country name
     */
    @SerializedName("country")
    private String country;

    /**
     * Date of the place creation in Unixtime
     */
    @SerializedName("created")
    private Integer created;

    /**
     * URL of the place's icon
     */
    @SerializedName("icon")
    private URI icon;

    /**
     * Place ID
     */
    @SerializedName("id")
    private Integer id;

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
     * Place title
     */
    @SerializedName("title")
    private String title;

    /**
     * Place type
     */
    @SerializedName("type")
    private String type;

    public String getAddress() {
        return address;
    }

    public Place setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getCheckins() {
        return checkins;
    }

    public Place setCheckins(Integer checkins) {
        this.checkins = checkins;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Place setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Place setCountry(String country) {
        this.country = country;
        return this;
    }

    public Integer getCreated() {
        return created;
    }

    public Place setCreated(Integer created) {
        this.created = created;
        return this;
    }

    public URI getIcon() {
        return icon;
    }

    public Place setIcon(URI icon) {
        this.icon = icon;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Place setId(Integer id) {
        this.id = id;
        return this;
    }

    public Float getLatitude() {
        return latitude;
    }

    public Place setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    public Float getLongitude() {
        return longitude;
    }

    public Place setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Place setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getType() {
        return type;
    }

    public Place setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, address, city, created, latitude, icon, id, title, type, checkins, longitude);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(country, place.country) &&
                Objects.equals(address, place.address) &&
                Objects.equals(city, place.city) &&
                Objects.equals(created, place.created) &&
                Objects.equals(latitude, place.latitude) &&
                Objects.equals(icon, place.icon) &&
                Objects.equals(id, place.id) &&
                Objects.equals(title, place.title) &&
                Objects.equals(type, place.type) &&
                Objects.equals(checkins, place.checkins) &&
                Objects.equals(longitude, place.longitude);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Place{");
        sb.append("country='").append(country).append("'");
        sb.append(", address='").append(address).append("'");
        sb.append(", city='").append(city).append("'");
        sb.append(", created=").append(created);
        sb.append(", latitude=").append(latitude);
        sb.append(", icon=").append(icon);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", checkins=").append(checkins);
        sb.append(", longitude=").append(longitude);
        sb.append('}');
        return sb.toString();
    }
}
