package com.vk.api.sdk.objects.account;

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
     * User first name
     */
    @SerializedName("first_name")
    private String firstName;

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
     * User's date of birth
     */
    @SerializedName("bdate")
    private String bdate;

    /**
     * Information whether user's birthdate are hidden
     */
    @SerializedName("bdate_visibility")
    private Integer bdateVisibility;

    /**
     * User's hometown
     */
    @SerializedName("home_town")
    private String homeTown;

    @SerializedName("country")
    private Country country;

    @SerializedName("city")
    private BaseObject city;

    /**
     * User status
     */
    @SerializedName("status")
    private String status;

    /**
     * User phone number with some hidden digits
     */
    @SerializedName("phone")
    private String phone;

    @SerializedName("name_request")
    private NameRequest nameRequest;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public String getScreenName() {
        return screenName;
    }

    public Sex getSex() {
        return sex;
    }

    public Integer getRelation() {
        return relation;
    }

    public UserMin getRelationPartner() {
        return relationPartner;
    }

    public Integer getRelationPending() {
        return relationPending;
    }

    public List<UserMin> getRelationRequests() {
        return relationRequests;
    }

    public String getBdate() {
        return bdate;
    }

    public Integer getBdateVisibility() {
        return bdateVisibility;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public Country getCountry() {
        return country;
    }

    public BaseObject getCity() {
        return city;
    }

    public String getStatus() {
        return status;
    }

    public String getPhone() {
        return phone;
    }

    public NameRequest getNameRequest() {
        return nameRequest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, country, relationPartner, bdate, city, sex, maidenName, bdateVisibility, screenName, relation, firstName, relationRequests, homeTown, phone, relationPending, nameRequest, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSettings userSettings = (UserSettings) o;
        return Objects.equals(firstName, userSettings.firstName) &&
                Objects.equals(lastName, userSettings.lastName) &&
                Objects.equals(maidenName, userSettings.maidenName) &&
                Objects.equals(screenName, userSettings.screenName) &&
                Objects.equals(sex, userSettings.sex) &&
                Objects.equals(relation, userSettings.relation) &&
                Objects.equals(relationPartner, userSettings.relationPartner) &&
                Objects.equals(relationPending, userSettings.relationPending) &&
                Objects.equals(relationRequests, userSettings.relationRequests) &&
                Objects.equals(bdate, userSettings.bdate) &&
                Objects.equals(bdateVisibility, userSettings.bdateVisibility) &&
                Objects.equals(homeTown, userSettings.homeTown) &&
                Objects.equals(country, userSettings.country) &&
                Objects.equals(city, userSettings.city) &&
                Objects.equals(status, userSettings.status) &&
                Objects.equals(phone, userSettings.phone) &&
                Objects.equals(nameRequest, userSettings.nameRequest);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserSettings{");
        sb.append("firstName='").append(firstName).append("'");
        sb.append(", lastName='").append(lastName).append("'");
        sb.append(", maidenName='").append(maidenName).append("'");
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", sex=").append(sex);
        sb.append(", relation=").append(relation);
        sb.append(", relationPartner=").append(relationPartner);
        sb.append(", relationPending=").append(relationPending);
        sb.append(", relationRequests=").append(relationRequests);
        sb.append(", bdate='").append(bdate).append("'");
        sb.append(", bdateVisibility=").append(bdateVisibility);
        sb.append(", homeTown='").append(homeTown).append("'");
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", status='").append(status).append("'");
        sb.append(", phone='").append(phone).append("'");
        sb.append(", nameRequest=").append(nameRequest);
        sb.append('}');
        return sb.toString();
    }
}
