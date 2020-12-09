package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * School object
 */
public class School implements Validable {
    /**
     * City ID
     */
    @SerializedName("city")
    private Integer city;

    /**
     * School class letter
     */
    @SerializedName("class")
    private String className;

    /**
     * Country ID
     */
    @SerializedName("country")
    private Integer country;

    /**
     * School ID
     */
    @SerializedName("id")
    private String id;

    /**
     * School name
     */
    @SerializedName("name")
    private String name;

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

    /**
     * Year the user started to study
     */
    @SerializedName("year_from")
    private Integer yearFrom;

    /**
     * Graduation year
     */
    @SerializedName("year_graduated")
    private Integer yearGraduated;

    /**
     * Year the user finished to study
     */
    @SerializedName("year_to")
    private Integer yearTo;

    @SerializedName("speciality")
    private String speciality;

    public Integer getCity() {
        return city;
    }

    public School setCity(Integer city) {
        this.city = city;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public School setClassName(String className) {
        this.className = className;
        return this;
    }

    public Integer getCountry() {
        return country;
    }

    public School setCountry(Integer country) {
        this.country = country;
        return this;
    }

    public String getId() {
        return id;
    }

    public School setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public School setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public School setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getTypeStr() {
        return typeStr;
    }

    public School setTypeStr(String typeStr) {
        this.typeStr = typeStr;
        return this;
    }

    public Integer getYearFrom() {
        return yearFrom;
    }

    public School setYearFrom(Integer yearFrom) {
        this.yearFrom = yearFrom;
        return this;
    }

    public Integer getYearGraduated() {
        return yearGraduated;
    }

    public School setYearGraduated(Integer yearGraduated) {
        this.yearGraduated = yearGraduated;
        return this;
    }

    public Integer getYearTo() {
        return yearTo;
    }

    public School setYearTo(Integer yearTo) {
        this.yearTo = yearTo;
        return this;
    }

    public String getSpeciality() {
        return speciality;
    }

    public School setSpeciality(String speciality) {
        this.speciality = speciality;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, speciality, typeStr, city, yearFrom, name, className, id, yearGraduated, type, yearTo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(country, school.country) &&
                Objects.equals(speciality, school.speciality) &&
                Objects.equals(yearFrom, school.yearFrom) &&
                Objects.equals(city, school.city) &&
                Objects.equals(name, school.name) &&
                Objects.equals(typeStr, school.typeStr) &&
                Objects.equals(yearTo, school.yearTo) &&
                Objects.equals(id, school.id) &&
                Objects.equals(yearGraduated, school.yearGraduated) &&
                Objects.equals(type, school.type) &&
                Objects.equals(className, school.className);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("School{");
        sb.append("country=").append(country);
        sb.append(", speciality='").append(speciality).append("'");
        sb.append(", yearFrom=").append(yearFrom);
        sb.append(", city=").append(city);
        sb.append(", name='").append(name).append("'");
        sb.append(", typeStr='").append(typeStr).append("'");
        sb.append(", yearTo=").append(yearTo);
        sb.append(", id='").append(id).append("'");
        sb.append(", yearGraduated=").append(yearGraduated);
        sb.append(", type=").append(type);
        sb.append(", className='").append(className).append("'");
        sb.append('}');
        return sb.toString();
    }
}
