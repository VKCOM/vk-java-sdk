package com.vk.api.sdk.objects.places;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * PlaceFull object
 */
public class PlaceFull {
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

    /**
     * Distance to the place
     */
    @SerializedName("distance")
    private Integer distance;

    /**
     * Community ID
     */
    @SerializedName("group_id")
    private Integer groupId;

    /**
     * URL of the community's photo
     */
    @SerializedName("group_photo")
    private String groupPhoto;

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

    public Integer getDistance() {
        return distance;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public String getGroupPhoto() {
        return groupPhoto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, address, distance, city, created, latitude, groupId, icon, groupPhoto, title, type, id, checkins, longitude);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceFull placeFull = (PlaceFull) o;
        return Objects.equals(id, placeFull.id) &&
                Objects.equals(title, placeFull.title) &&
                Objects.equals(latitude, placeFull.latitude) &&
                Objects.equals(longitude, placeFull.longitude) &&
                Objects.equals(created, placeFull.created) &&
                Objects.equals(icon, placeFull.icon) &&
                Objects.equals(checkins, placeFull.checkins) &&
                Objects.equals(type, placeFull.type) &&
                Objects.equals(country, placeFull.country) &&
                Objects.equals(city, placeFull.city) &&
                Objects.equals(address, placeFull.address) &&
                Objects.equals(distance, placeFull.distance) &&
                Objects.equals(groupId, placeFull.groupId) &&
                Objects.equals(groupPhoto, placeFull.groupPhoto);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlaceFull{");
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
        sb.append(", distance=").append(distance);
        sb.append(", groupId=").append(groupId);
        sb.append(", groupPhoto='").append(groupPhoto).append("'");
        sb.append('}');
        return sb.toString();
    }
}
