package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * School object
 */
public class School {
    /**
     * School ID
     */
    @SerializedName("id")
    private String id;

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
     * School name
     */
    @SerializedName("name")
    private String name;

    /**
     * Year the user started to study
     */
    @SerializedName("year_from")
    private Integer yearFrom;

    /**
     * Year the user finished to study
     */
    @SerializedName("year_to")
    private Integer yearTo;

    /**
     * Graduation year
     */
    @SerializedName("year_graduated")
    private Integer yearGraduated;

    /**
     * School class letter
     */
    @SerializedName("class")
    private String className;

    /**
     * School type ID
     */
    @SerializedName("type")
    private Integer type;

    /**
     * School type name
     */
    @SerializedName("type_str")
    private String typeStr;

    public String getId() {
        return id;
    }

    public Integer getCountry() {
        return country;
    }

    public Integer getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public Integer getYearFrom() {
        return yearFrom;
    }

    public Integer getYearTo() {
        return yearTo;
    }

    public Integer getYearGraduated() {
        return yearGraduated;
    }

    public String getClassName() {
        return className;
    }

    public Integer getType() {
        return type;
    }

    public String getTypeStr() {
        return typeStr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, typeStr, city, yearFrom, name, className, id, yearGraduated, type, yearTo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(id, school.id) &&
                Objects.equals(country, school.country) &&
                Objects.equals(city, school.city) &&
                Objects.equals(name, school.name) &&
                Objects.equals(yearFrom, school.yearFrom) &&
                Objects.equals(yearTo, school.yearTo) &&
                Objects.equals(yearGraduated, school.yearGraduated) &&
                Objects.equals(className, school.className) &&
                Objects.equals(type, school.type) &&
                Objects.equals(typeStr, school.typeStr);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("School{");
        sb.append("id='").append(id).append("'");
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", name='").append(name).append("'");
        sb.append(", yearFrom=").append(yearFrom);
        sb.append(", yearTo=").append(yearTo);
        sb.append(", yearGraduated=").append(yearGraduated);
        sb.append(", className='").append(className).append("'");
        sb.append(", type=").append(type);
        sb.append(", typeStr='").append(typeStr).append("'");
        sb.append('}');
        return sb.toString();
    }
}
