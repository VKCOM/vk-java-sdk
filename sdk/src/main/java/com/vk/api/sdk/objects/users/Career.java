package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Career object
 */
public class Career {
    /**
     * Community ID
     */
    @SerializedName("group_id")
    private Integer groupId;

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
     * City ID
     */
    @SerializedName("city_id")
    private Integer cityId;

    /**
     * From year
     */
    @SerializedName("from")
    private Integer from;

    /**
     * Till year
     */
    @SerializedName("until")
    private Integer until;

    /**
     * Position
     */
    @SerializedName("position")
    private String position;

    public Integer getGroupId() {
        return groupId;
    }

    public String getCompany() {
        return company;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public Integer getFrom() {
        return from;
    }

    public Integer getUntil() {
        return until;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, company, from, until, cityId, position, countryId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Career career = (Career) o;
        return Objects.equals(groupId, career.groupId) &&
                Objects.equals(company, career.company) &&
                Objects.equals(countryId, career.countryId) &&
                Objects.equals(cityId, career.cityId) &&
                Objects.equals(from, career.from) &&
                Objects.equals(until, career.until) &&
                Objects.equals(position, career.position);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Career{");
        sb.append("groupId=").append(groupId);
        sb.append(", company=").append(company);
        sb.append(", countryId=").append(countryId);
        sb.append(", cityId=").append(cityId);
        sb.append(", from=").append(from);
        sb.append(", until=").append(until);
        sb.append(", position='").append(position).append("'");
        sb.append('}');
        return sb.toString();
    }
}
