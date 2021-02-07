package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.AddressTimetable;
import com.vk.api.sdk.objects.groups.AddressWorkInfoStatus;
import java.util.Objects;

/**
 * EditAddressResponse object
 */
public class EditAddressResponse implements Validable {
    /**
     * Additional address to the place (6 floor, left door)
     */
    @SerializedName("additional_address")
    private String additionalAddress;

    /**
     * String address to the place (Nevsky, 28)
     */
    @SerializedName("address")
    private String address;

    /**
     * City id of address
     */
    @SerializedName("city_id")
    private Integer cityId;

    /**
     * Country id of address
     */
    @SerializedName("country_id")
    private Integer countryId;

    /**
     * Distance from the point
     */
    @SerializedName("distance")
    private Integer distance;

    /**
     * Address id
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Address latitude
     */
    @SerializedName("latitude")
    private Float latitude;

    /**
     * Address longitude
     */
    @SerializedName("longitude")
    private Float longitude;

    /**
     * Metro id of address
     */
    @SerializedName("metro_station_id")
    private Integer metroStationId;

    /**
     * Address phone
     */
    @SerializedName("phone")
    private String phone;

    /**
     * Time offset int minutes from utc time
     */
    @SerializedName("time_offset")
    private Integer timeOffset;

    /**
     * Week timetable for the address
     */
    @SerializedName("timetable")
    private AddressTimetable timetable;

    /**
     * Title of the place (Zinger, etc)
     */
    @SerializedName("title")
    private String title;

    /**
     * Status of information about timetable
     */
    @SerializedName("work_info_status")
    private AddressWorkInfoStatus workInfoStatus;

    public String getAdditionalAddress() {
        return additionalAddress;
    }

    public EditAddressResponse setAdditionalAddress(String additionalAddress) {
        this.additionalAddress = additionalAddress;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public EditAddressResponse setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getCityId() {
        return cityId;
    }

    public EditAddressResponse setCityId(Integer cityId) {
        this.cityId = cityId;
        return this;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public EditAddressResponse setCountryId(Integer countryId) {
        this.countryId = countryId;
        return this;
    }

    public Integer getDistance() {
        return distance;
    }

    public EditAddressResponse setDistance(Integer distance) {
        this.distance = distance;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public EditAddressResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Float getLatitude() {
        return latitude;
    }

    public EditAddressResponse setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    public Float getLongitude() {
        return longitude;
    }

    public EditAddressResponse setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    public Integer getMetroStationId() {
        return metroStationId;
    }

    public EditAddressResponse setMetroStationId(Integer metroStationId) {
        this.metroStationId = metroStationId;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public EditAddressResponse setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Integer getTimeOffset() {
        return timeOffset;
    }

    public EditAddressResponse setTimeOffset(Integer timeOffset) {
        this.timeOffset = timeOffset;
        return this;
    }

    public AddressTimetable getTimetable() {
        return timetable;
    }

    public EditAddressResponse setTimetable(AddressTimetable timetable) {
        this.timetable = timetable;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public EditAddressResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public AddressWorkInfoStatus getWorkInfoStatus() {
        return workInfoStatus;
    }

    public EditAddressResponse setWorkInfoStatus(AddressWorkInfoStatus workInfoStatus) {
        this.workInfoStatus = workInfoStatus;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, workInfoStatus, distance, latitude, metroStationId, timeOffset, cityId, title, countryId, timetable, phone, additionalAddress, id, longitude);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditAddressResponse editAddressResponse = (EditAddressResponse) o;
        return Objects.equals(additionalAddress, editAddressResponse.additionalAddress) &&
                Objects.equals(address, editAddressResponse.address) &&
                Objects.equals(distance, editAddressResponse.distance) &&
                Objects.equals(timeOffset, editAddressResponse.timeOffset) &&
                Objects.equals(latitude, editAddressResponse.latitude) &&
                Objects.equals(metroStationId, editAddressResponse.metroStationId) &&
                Objects.equals(title, editAddressResponse.title) &&
                Objects.equals(timetable, editAddressResponse.timetable) &&
                Objects.equals(workInfoStatus, editAddressResponse.workInfoStatus) &&
                Objects.equals(phone, editAddressResponse.phone) &&
                Objects.equals(id, editAddressResponse.id) &&
                Objects.equals(countryId, editAddressResponse.countryId) &&
                Objects.equals(cityId, editAddressResponse.cityId) &&
                Objects.equals(longitude, editAddressResponse.longitude);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("EditAddressResponse{");
        sb.append("additionalAddress='").append(additionalAddress).append("'");
        sb.append(", address='").append(address).append("'");
        sb.append(", distance=").append(distance);
        sb.append(", timeOffset=").append(timeOffset);
        sb.append(", latitude=").append(latitude);
        sb.append(", metroStationId=").append(metroStationId);
        sb.append(", title='").append(title).append("'");
        sb.append(", timetable=").append(timetable);
        sb.append(", workInfoStatus=").append(workInfoStatus);
        sb.append(", phone='").append(phone).append("'");
        sb.append(", id=").append(id);
        sb.append(", countryId=").append(countryId);
        sb.append(", cityId=").append(cityId);
        sb.append(", longitude=").append(longitude);
        sb.append('}');
        return sb.toString();
    }
}
