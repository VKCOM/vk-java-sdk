package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * University object
 */
public class University {
    /**
     * University ID
     */
    @SerializedName("id")
    private Integer id;

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
     * University name
     */
    @SerializedName("name")
    private String name;

    /**
     * Faculty ID
     */
    @SerializedName("faculty")
    private Integer faculty;

    /**
     * Faculty name
     */
    @SerializedName("faculty_name")
    private String facultyName;

    /**
     * Chair ID
     */
    @SerializedName("chair")
    private Integer chair;

    /**
     * Chair name
     */
    @SerializedName("chair_name")
    private String chairName;

    /**
     * Graduation year
     */
    @SerializedName("graduation")
    private Integer graduation;

    /**
     * Education form
     */
    @SerializedName("education_form")
    private String educationForm;

    /**
     * Education status
     */
    @SerializedName("education_status")
    private String educationStatus;

    public Integer getId() {
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

    public Integer getFaculty() {
        return faculty;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public Integer getChair() {
        return chair;
    }

    public String getChairName() {
        return chairName;
    }

    public Integer getGraduation() {
        return graduation;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public String getEducationStatus() {
        return educationStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, educationStatus, city, chairName, graduation, chair, name, id, facultyName, educationForm, faculty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University university = (University) o;
        return Objects.equals(id, university.id) &&
                Objects.equals(country, university.country) &&
                Objects.equals(city, university.city) &&
                Objects.equals(name, university.name) &&
                Objects.equals(faculty, university.faculty) &&
                Objects.equals(facultyName, university.facultyName) &&
                Objects.equals(chair, university.chair) &&
                Objects.equals(chairName, university.chairName) &&
                Objects.equals(graduation, university.graduation) &&
                Objects.equals(educationForm, university.educationForm) &&
                Objects.equals(educationStatus, university.educationStatus);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("University{");
        sb.append("id=").append(id);
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", name='").append(name).append("'");
        sb.append(", faculty=").append(faculty);
        sb.append(", facultyName='").append(facultyName).append("'");
        sb.append(", chair=").append(chair);
        sb.append(", chairName='").append(chairName).append("'");
        sb.append(", graduation=").append(graduation);
        sb.append(", educationForm='").append(educationForm).append("'");
        sb.append(", educationStatus='").append(educationStatus).append("'");
        sb.append('}');
        return sb.toString();
    }
}
