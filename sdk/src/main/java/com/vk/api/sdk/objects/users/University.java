package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * University object
 */
public class University implements Validable {
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
     * City ID
     */
    @SerializedName("city")
    private Integer city;

    /**
     * Country ID
     */
    @SerializedName("country")
    private Integer country;

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
     * Graduation year
     */
    @SerializedName("graduation")
    private Integer graduation;

    /**
     * University ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * University name
     */
    @SerializedName("name")
    private String name;

    @SerializedName("university_group_id")
    private Integer universityGroupId;

    public Integer getChair() {
        return chair;
    }

    public University setChair(Integer chair) {
        this.chair = chair;
        return this;
    }

    public String getChairName() {
        return chairName;
    }

    public University setChairName(String chairName) {
        this.chairName = chairName;
        return this;
    }

    public Integer getCity() {
        return city;
    }

    public University setCity(Integer city) {
        this.city = city;
        return this;
    }

    public Integer getCountry() {
        return country;
    }

    public University setCountry(Integer country) {
        this.country = country;
        return this;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public University setEducationForm(String educationForm) {
        this.educationForm = educationForm;
        return this;
    }

    public String getEducationStatus() {
        return educationStatus;
    }

    public University setEducationStatus(String educationStatus) {
        this.educationStatus = educationStatus;
        return this;
    }

    public Integer getFaculty() {
        return faculty;
    }

    public University setFaculty(Integer faculty) {
        this.faculty = faculty;
        return this;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public University setFacultyName(String facultyName) {
        this.facultyName = facultyName;
        return this;
    }

    public Integer getGraduation() {
        return graduation;
    }

    public University setGraduation(Integer graduation) {
        this.graduation = graduation;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public University setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public University setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getUniversityGroupId() {
        return universityGroupId;
    }

    public University setUniversityGroupId(Integer universityGroupId) {
        this.universityGroupId = universityGroupId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, educationStatus, universityGroupId, city, graduation, chairName, chair, name, facultyName, id, educationForm, faculty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University university = (University) o;
        return Objects.equals(country, university.country) &&
                Objects.equals(facultyName, university.facultyName) &&
                Objects.equals(universityGroupId, university.universityGroupId) &&
                Objects.equals(city, university.city) &&
                Objects.equals(graduation, university.graduation) &&
                Objects.equals(chair, university.chair) &&
                Objects.equals(name, university.name) &&
                Objects.equals(id, university.id) &&
                Objects.equals(educationStatus, university.educationStatus) &&
                Objects.equals(educationForm, university.educationForm) &&
                Objects.equals(chairName, university.chairName) &&
                Objects.equals(faculty, university.faculty);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("University{");
        sb.append("country=").append(country);
        sb.append(", facultyName='").append(facultyName).append("'");
        sb.append(", universityGroupId=").append(universityGroupId);
        sb.append(", city=").append(city);
        sb.append(", graduation=").append(graduation);
        sb.append(", chair=").append(chair);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", educationStatus='").append(educationStatus).append("'");
        sb.append(", educationForm='").append(educationForm).append("'");
        sb.append(", chairName='").append(chairName).append("'");
        sb.append(", faculty=").append(faculty);
        sb.append('}');
        return sb.toString();
    }
}
