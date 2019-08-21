package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.account.NameRequest;
import com.vk.api.sdk.objects.account.UserSettingsInterests;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.City;
import com.vk.api.sdk.objects.base.Country;
import com.vk.api.sdk.objects.base.Sex;
import java.util.List;
import java.util.Objects;

/**
 * UserSettingsXtr object
 */
public class UserSettingsXtr implements Validable {
    @SerializedName("connections")
    private UserConnections connections;

    /**
     * User's date of birth
     */
    @SerializedName("bdate")
    private String bdate;

    /**
     * Information whether user's birthdate are hidden
     */
    @SerializedName("bdate_visibility")
    private Integer bdateVisibility;

    @SerializedName("city")
    private City city;

    @SerializedName("country")
    private Country country;

    /**
     * User first name
     */
    @SerializedName("first_name")
    private String firstName;

    /**
     * User's hometown
     */
    @SerializedName("home_town")
    private String homeTown;

    /**
     * User last name
     */
    @SerializedName("last_name")
    private String lastName;

    /**
     * User maiden name
     */
    @SerializedName("maiden_name")
    private String maidenName;

    @SerializedName("name_request")
    private NameRequest nameRequest;

    @SerializedName("personal")
    private Personal personal;

    /**
     * User phone number with some hidden digits
     */
    @SerializedName("phone")
    private String phone;

    /**
     * User relationship status
     */
    @SerializedName("relation")
    private UserRelation relation;

    @SerializedName("relation_partner")
    private UserMin relationPartner;

    /**
     * Information whether relation status is pending
     */
    @SerializedName("relation_pending")
    private BoolInt relationPending;

    @SerializedName("relation_requests")
    private List<UserMin> relationRequests;

    /**
     * Domain name of the user's page
     */
    @SerializedName("screen_name")
    private String screenName;

    /**
     * User sex
     */
    @SerializedName("sex")
    private Sex sex;

    /**
     * User status
     */
    @SerializedName("status")
    @Required
    private String status;

    @SerializedName("status_audio")
    private Audio statusAudio;

    @SerializedName("interests")
    private UserSettingsInterests interests;

    @SerializedName("languages")
    private List<String> languages;

    public UserConnections getConnections() {
        return connections;
    }

    public UserSettingsXtr setConnections(UserConnections connections) {
        this.connections = connections;
        return this;
    }

    public String getBdate() {
        return bdate;
    }

    public UserSettingsXtr setBdate(String bdate) {
        this.bdate = bdate;
        return this;
    }

    public Integer getBdateVisibility() {
        return bdateVisibility;
    }

    public UserSettingsXtr setBdateVisibility(Integer bdateVisibility) {
        this.bdateVisibility = bdateVisibility;
        return this;
    }

    public City getCity() {
        return city;
    }

    public UserSettingsXtr setCity(City city) {
        this.city = city;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public UserSettingsXtr setCountry(Country country) {
        this.country = country;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserSettingsXtr setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public UserSettingsXtr setHomeTown(String homeTown) {
        this.homeTown = homeTown;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserSettingsXtr setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public UserSettingsXtr setMaidenName(String maidenName) {
        this.maidenName = maidenName;
        return this;
    }

    public NameRequest getNameRequest() {
        return nameRequest;
    }

    public UserSettingsXtr setNameRequest(NameRequest nameRequest) {
        this.nameRequest = nameRequest;
        return this;
    }

    public Personal getPersonal() {
        return personal;
    }

    public UserSettingsXtr setPersonal(Personal personal) {
        this.personal = personal;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserSettingsXtr setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserRelation getRelation() {
        return relation;
    }

    public UserSettingsXtr setRelation(UserRelation relation) {
        this.relation = relation;
        return this;
    }

    public UserMin getRelationPartner() {
        return relationPartner;
    }

    public UserSettingsXtr setRelationPartner(UserMin relationPartner) {
        this.relationPartner = relationPartner;
        return this;
    }

    public boolean isRelationPending() {
        return relationPending == BoolInt.YES;
    }

    public BoolInt getRelationPending() {
        return relationPending;
    }

    public List<UserMin> getRelationRequests() {
        return relationRequests;
    }

    public UserSettingsXtr setRelationRequests(List<UserMin> relationRequests) {
        this.relationRequests = relationRequests;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public UserSettingsXtr setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public Sex getSex() {
        return sex;
    }

    public UserSettingsXtr setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserSettingsXtr setStatus(String status) {
        this.status = status;
        return this;
    }

    public Audio getStatusAudio() {
        return statusAudio;
    }

    public UserSettingsXtr setStatusAudio(Audio statusAudio) {
        this.statusAudio = statusAudio;
        return this;
    }

    public UserSettingsInterests getInterests() {
        return interests;
    }

    public UserSettingsXtr setInterests(UserSettingsInterests interests) {
        this.interests = interests;
        return this;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public UserSettingsXtr setLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, lastName, bdate, relationPartner, languages, city, sex, maidenName, personal, bdateVisibility, screenName, relation, firstName, relationRequests, homeTown, phone, relationPending, interests, nameRequest, connections, statusAudio, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSettingsXtr userSettingsXtr = (UserSettingsXtr) o;
        return Objects.equals(country, userSettingsXtr.country) &&
                Objects.equals(maidenName, userSettingsXtr.maidenName) &&
                Objects.equals(bdate, userSettingsXtr.bdate) &&
                Objects.equals(languages, userSettingsXtr.languages) &&
                Objects.equals(city, userSettingsXtr.city) &&
                Objects.equals(sex, userSettingsXtr.sex) &&
                Objects.equals(lastName, userSettingsXtr.lastName) &&
                Objects.equals(personal, userSettingsXtr.personal) &&
                Objects.equals(statusAudio, userSettingsXtr.statusAudio) &&
                Objects.equals(relation, userSettingsXtr.relation) &&
                Objects.equals(relationPartner, userSettingsXtr.relationPartner) &&
                Objects.equals(homeTown, userSettingsXtr.homeTown) &&
                Objects.equals(relationRequests, userSettingsXtr.relationRequests) &&
                Objects.equals(phone, userSettingsXtr.phone) &&
                Objects.equals(screenName, userSettingsXtr.screenName) &&
                Objects.equals(nameRequest, userSettingsXtr.nameRequest) &&
                Objects.equals(relationPending, userSettingsXtr.relationPending) &&
                Objects.equals(interests, userSettingsXtr.interests) &&
                Objects.equals(firstName, userSettingsXtr.firstName) &&
                Objects.equals(connections, userSettingsXtr.connections) &&
                Objects.equals(bdateVisibility, userSettingsXtr.bdateVisibility) &&
                Objects.equals(status, userSettingsXtr.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserSettingsXtr{");
        sb.append("country=").append(country);
        sb.append(", maidenName='").append(maidenName).append("'");
        sb.append(", bdate='").append(bdate).append("'");
        sb.append(", languages='").append(languages).append("'");
        sb.append(", city=").append(city);
        sb.append(", sex=").append(sex);
        sb.append(", lastName='").append(lastName).append("'");
        sb.append(", personal=").append(personal);
        sb.append(", statusAudio=").append(statusAudio);
        sb.append(", relation=").append(relation);
        sb.append(", relationPartner=").append(relationPartner);
        sb.append(", homeTown='").append(homeTown).append("'");
        sb.append(", relationRequests=").append(relationRequests);
        sb.append(", phone='").append(phone).append("'");
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", nameRequest=").append(nameRequest);
        sb.append(", relationPending=").append(relationPending);
        sb.append(", interests=").append(interests);
        sb.append(", firstName='").append(firstName).append("'");
        sb.append(", connections=").append(connections);
        sb.append(", bdateVisibility=").append(bdateVisibility);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
