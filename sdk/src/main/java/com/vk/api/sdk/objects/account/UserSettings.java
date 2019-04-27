package com.vk.api.sdk.objects.account;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BaseObject;
import com.vk.api.sdk.objects.base.Country;
import com.vk.api.sdk.objects.base.Sex;
import com.vk.api.sdk.objects.users.UserMin;
import java.util.List;
import java.util.Objects;

/**
 * UserSettings object
 */
public class UserSettings {
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
    private BaseObject city;

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

    /**
     * User phone number with some hidden digits
     */
    @SerializedName("phone")
    private String phone;

    /**
     * User relationship status
     */
    @SerializedName("relation")
    private Integer relation;

    @SerializedName("relation_partner")
    private UserMin relationPartner;

    /**
     * Information whether relation status is pending
     */
    @SerializedName("relation_pending")
    private Integer relationPending;

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
    private String status;

    public String getBdate() {
        return bdate;
    }

    public UserSettings setBdate(String bdate) {
        this.bdate = bdate;
        return this;
    }

    public Integer getBdateVisibility() {
        return bdateVisibility;
    }

    public UserSettings setBdateVisibility(Integer bdateVisibility) {
        this.bdateVisibility = bdateVisibility;
        return this;
    }

    public BaseObject getCity() {
        return city;
    }

    public UserSettings setCity(BaseObject city) {
        this.city = city;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public UserSettings setCountry(Country country) {
        this.country = country;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserSettings setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public UserSettings setHomeTown(String homeTown) {
        this.homeTown = homeTown;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserSettings setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public UserSettings setMaidenName(String maidenName) {
        this.maidenName = maidenName;
        return this;
    }

    public NameRequest getNameRequest() {
        return nameRequest;
    }

    public UserSettings setNameRequest(NameRequest nameRequest) {
        this.nameRequest = nameRequest;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserSettings setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Integer getRelation() {
        return relation;
    }

    public UserSettings setRelation(Integer relation) {
        this.relation = relation;
        return this;
    }

    public UserMin getRelationPartner() {
        return relationPartner;
    }

    public UserSettings setRelationPartner(UserMin relationPartner) {
        this.relationPartner = relationPartner;
        return this;
    }

    public Integer getRelationPending() {
        return relationPending;
    }

    public UserSettings setRelationPending(Integer relationPending) {
        this.relationPending = relationPending;
        return this;
    }

    public List<UserMin> getRelationRequests() {
        return relationRequests;
    }

    public UserSettings setRelationRequests(List<UserMin> relationRequests) {
        this.relationRequests = relationRequests;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public UserSettings setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public Sex getSex() {
        return sex;
    }

    public UserSettings setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserSettings setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, lastName, bdate, relationPartner, city, sex, maidenName, bdateVisibility, screenName, relation, firstName, relationRequests, homeTown, phone, relationPending, nameRequest, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSettings userSettings = (UserSettings) o;
        return Objects.equals(country, userSettings.country) &&
                Objects.equals(maidenName, userSettings.maidenName) &&
                Objects.equals(bdate, userSettings.bdate) &&
                Objects.equals(city, userSettings.city) &&
                Objects.equals(sex, userSettings.sex) &&
                Objects.equals(lastName, userSettings.lastName) &&
                Objects.equals(relation, userSettings.relation) &&
                Objects.equals(relationPartner, userSettings.relationPartner) &&
                Objects.equals(homeTown, userSettings.homeTown) &&
                Objects.equals(relationRequests, userSettings.relationRequests) &&
                Objects.equals(phone, userSettings.phone) &&
                Objects.equals(screenName, userSettings.screenName) &&
                Objects.equals(nameRequest, userSettings.nameRequest) &&
                Objects.equals(relationPending, userSettings.relationPending) &&
                Objects.equals(firstName, userSettings.firstName) &&
                Objects.equals(bdateVisibility, userSettings.bdateVisibility) &&
                Objects.equals(status, userSettings.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserSettings{");
        sb.append("country=").append(country);
        sb.append(", maidenName='").append(maidenName).append("'");
        sb.append(", bdate='").append(bdate).append("'");
        sb.append(", city=").append(city);
        sb.append(", sex=").append(sex);
        sb.append(", lastName='").append(lastName).append("'");
        sb.append(", relation=").append(relation);
        sb.append(", relationPartner=").append(relationPartner);
        sb.append(", homeTown='").append(homeTown).append("'");
        sb.append(", relationRequests=").append(relationRequests);
        sb.append(", phone='").append(phone).append("'");
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", nameRequest=").append(nameRequest);
        sb.append(", relationPending=").append(relationPending);
        sb.append(", firstName='").append(firstName).append("'");
        sb.append(", bdateVisibility=").append(bdateVisibility);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
