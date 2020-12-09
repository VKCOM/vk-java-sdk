package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Career object
 */
public class Career implements Validable {
    /**
     * City ID
     */
    @SerializedName("city_id")
    private Integer cityId;

    /**
     * City name
     */
    @SerializedName("city_name")
    private String cityName;

    /**
     * Company name
     */
    @SerializedName("company")
    private String company;

    /**
     * Country ID
     */
    @SerializedName("country_id")
    private Integer countryId;

    /**
     * From year
     */
    @SerializedName("from")
    private Integer from;

    /**
     * Community ID
     */
    @SerializedName("group_id")
    private Integer groupId;

    /**
     * Career ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Position
     */
    @SerializedName("position")
    private String position;

    /**
     * Till year
     */
    @SerializedName("until")
    private Integer until;

    public Integer getCityId() {
        return cityId;
    }

    public Career setCityId(Integer cityId) {
        this.cityId = cityId;
        return this;
    }

    public String getCityName() {
        return cityName;
    }

    public Career setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Career setCompany(String company) {
        this.company = company;
        return this;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public Career setCountryId(Integer countryId) {
        this.countryId = countryId;
        return this;
    }

    public Integer getFrom() {
        return from;
    }

    public Career setFrom(Integer from) {
        this.from = from;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Career setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Career setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public Career setPosition(String position) {
        this.position = position;
        return this;
    }

    public Integer getUntil() {
        return until;
    }

    public Career setUntil(Integer until) {
        this.until = until;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, groupId, company, from, until, id, position, cityId, countryId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Career career = (Career) o;
        return Objects.equals(cityName, career.cityName) &&
                Objects.equals(groupId, career.groupId) &&
                Objects.equals(company, career.company) &&
                Objects.equals(from, career.from) &&
                Objects.equals(until, career.until) &&
                Objects.equals(id, career.id) &&
                Objects.equals(position, career.position) &&
                Objects.equals(countryId, career.countryId) &&
                Objects.equals(cityId, career.cityId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Career{");
        sb.append("cityName='").append(cityName).append("'");
        sb.append(", groupId=").append(groupId);
        sb.append(", company='").append(company).append("'");
        sb.append(", from=").append(from);
        sb.append(", until=").append(until);
        sb.append(", id=").append(id);
        sb.append(", position='").append(position).append("'");
        sb.append(", countryId=").append(countryId);
        sb.append(", cityId=").append(cityId);
        sb.append('}');
        return sb.toString();
    }
}
