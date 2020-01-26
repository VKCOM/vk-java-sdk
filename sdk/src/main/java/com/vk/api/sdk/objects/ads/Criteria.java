package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.PropertyExists;
import java.util.Objects;

/**
 * Criteria object
 */
public class Criteria implements Validable {
    /**
     * Age from
     */
    @SerializedName("age_from")
    private Integer ageFrom;

    /**
     * Age to
     */
    @SerializedName("age_to")
    private Integer ageTo;

    /**
     * Apps IDs
     */
    @SerializedName("apps")
    private String apps;

    /**
     * Apps IDs to except
     */
    @SerializedName("apps_not")
    private String appsNot;

    /**
     * Days to birthday
     */
    @SerializedName("birthday")
    private Integer birthday;

    /**
     * Cities IDs
     */
    @SerializedName("cities")
    private String cities;

    /**
     * Cities IDs to except
     */
    @SerializedName("cities_not")
    private String citiesNot;

    /**
     * Country ID
     */
    @SerializedName("country")
    private Integer country;

    /**
     * Districts IDs
     */
    @SerializedName("districts")
    private String districts;

    /**
     * Communities IDs
     */
    @SerializedName("groups")
    private String groups;

    /**
     * Interests categories IDs
     */
    @SerializedName("interest_categories")
    private String interestCategories;

    /**
     * Interests
     */
    @SerializedName("interests")
    private String interests;

    /**
     * Information whether the user has proceeded VK payments before
     */
    @SerializedName("paying")
    private BoolInt paying;

    /**
     * Positions IDs
     */
    @SerializedName("positions")
    private String positions;

    /**
     * Religions IDs
     */
    @SerializedName("religions")
    private String religions;

    /**
     * Retargeting groups IDs
     */
    @SerializedName("retargeting_groups")
    private String retargetingGroups;

    /**
     * Retargeting groups IDs to except
     */
    @SerializedName("retargeting_groups_not")
    private String retargetingGroupsNot;

    /**
     * School graduation year from
     */
    @SerializedName("school_from")
    private Integer schoolFrom;

    /**
     * School graduation year to
     */
    @SerializedName("school_to")
    private Integer schoolTo;

    /**
     * Schools IDs
     */
    @SerializedName("schools")
    private String schools;

    @SerializedName("sex")
    private CriteriaSex sex;

    /**
     * Stations IDs
     */
    @SerializedName("stations")
    private String stations;

    /**
     * Relationship statuses
     */
    @SerializedName("statuses")
    private String statuses;

    /**
     * Streets IDs
     */
    @SerializedName("streets")
    private String streets;

    /**
     * Travellers only
     */
    @SerializedName("travellers")
    private PropertyExists travellers;

    /**
     * University graduation year from
     */
    @SerializedName("uni_from")
    private Integer uniFrom;

    /**
     * University graduation year to
     */
    @SerializedName("uni_to")
    private Integer uniTo;

    /**
     * Browsers
     */
    @SerializedName("user_browsers")
    private String userBrowsers;

    /**
     * Devices
     */
    @SerializedName("user_devices")
    private String userDevices;

    /**
     * Operating systems
     */
    @SerializedName("user_os")
    private String userOs;

    public Integer getAgeFrom() {
        return ageFrom;
    }

    public Criteria setAgeFrom(Integer ageFrom) {
        this.ageFrom = ageFrom;
        return this;
    }

    public Integer getAgeTo() {
        return ageTo;
    }

    public Criteria setAgeTo(Integer ageTo) {
        this.ageTo = ageTo;
        return this;
    }

    public String getApps() {
        return apps;
    }

    public Criteria setApps(String apps) {
        this.apps = apps;
        return this;
    }

    public String getAppsNot() {
        return appsNot;
    }

    public Criteria setAppsNot(String appsNot) {
        this.appsNot = appsNot;
        return this;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public Criteria setBirthday(Integer birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getCities() {
        return cities;
    }

    public Criteria setCities(String cities) {
        this.cities = cities;
        return this;
    }

    public String getCitiesNot() {
        return citiesNot;
    }

    public Criteria setCitiesNot(String citiesNot) {
        this.citiesNot = citiesNot;
        return this;
    }

    public Integer getCountry() {
        return country;
    }

    public Criteria setCountry(Integer country) {
        this.country = country;
        return this;
    }

    public String getDistricts() {
        return districts;
    }

    public Criteria setDistricts(String districts) {
        this.districts = districts;
        return this;
    }

    public String getGroups() {
        return groups;
    }

    public Criteria setGroups(String groups) {
        this.groups = groups;
        return this;
    }

    public String getInterestCategories() {
        return interestCategories;
    }

    public Criteria setInterestCategories(String interestCategories) {
        this.interestCategories = interestCategories;
        return this;
    }

    public String getInterests() {
        return interests;
    }

    public Criteria setInterests(String interests) {
        this.interests = interests;
        return this;
    }

    public boolean isPaying() {
        return paying == BoolInt.YESBOOL;
    }

    public BoolInt getPaying() {
        return paying;
    }

    public String getPositions() {
        return positions;
    }

    public Criteria setPositions(String positions) {
        this.positions = positions;
        return this;
    }

    public String getReligions() {
        return religions;
    }

    public Criteria setReligions(String religions) {
        this.religions = religions;
        return this;
    }

    public String getRetargetingGroups() {
        return retargetingGroups;
    }

    public Criteria setRetargetingGroups(String retargetingGroups) {
        this.retargetingGroups = retargetingGroups;
        return this;
    }

    public String getRetargetingGroupsNot() {
        return retargetingGroupsNot;
    }

    public Criteria setRetargetingGroupsNot(String retargetingGroupsNot) {
        this.retargetingGroupsNot = retargetingGroupsNot;
        return this;
    }

    public Integer getSchoolFrom() {
        return schoolFrom;
    }

    public Criteria setSchoolFrom(Integer schoolFrom) {
        this.schoolFrom = schoolFrom;
        return this;
    }

    public Integer getSchoolTo() {
        return schoolTo;
    }

    public Criteria setSchoolTo(Integer schoolTo) {
        this.schoolTo = schoolTo;
        return this;
    }

    public String getSchools() {
        return schools;
    }

    public Criteria setSchools(String schools) {
        this.schools = schools;
        return this;
    }

    public CriteriaSex getSex() {
        return sex;
    }

    public Criteria setSex(CriteriaSex sex) {
        this.sex = sex;
        return this;
    }

    public String getStations() {
        return stations;
    }

    public Criteria setStations(String stations) {
        this.stations = stations;
        return this;
    }

    public String getStatuses() {
        return statuses;
    }

    public Criteria setStatuses(String statuses) {
        this.statuses = statuses;
        return this;
    }

    public String getStreets() {
        return streets;
    }

    public Criteria setStreets(String streets) {
        this.streets = streets;
        return this;
    }

    public boolean isTravellers() {
        return travellers == PropertyExists.PROPERTY_EXISTS;
    }

    public Integer getUniFrom() {
        return uniFrom;
    }

    public Criteria setUniFrom(Integer uniFrom) {
        this.uniFrom = uniFrom;
        return this;
    }

    public Integer getUniTo() {
        return uniTo;
    }

    public Criteria setUniTo(Integer uniTo) {
        this.uniTo = uniTo;
        return this;
    }

    public String getUserBrowsers() {
        return userBrowsers;
    }

    public Criteria setUserBrowsers(String userBrowsers) {
        this.userBrowsers = userBrowsers;
        return this;
    }

    public String getUserDevices() {
        return userDevices;
    }

    public Criteria setUserDevices(String userDevices) {
        this.userDevices = userDevices;
        return this;
    }

    public String getUserOs() {
        return userOs;
    }

    public Criteria setUserOs(String userOs) {
        this.userOs = userOs;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthday, retargetingGroups, country, streets, retargetingGroupsNot, districts, paying, userBrowsers, religions, citiesNot, ageTo, interestCategories, apps, userOs, cities, travellers, sex, userDevices, groups, positions, stations, uniFrom, uniTo, schools, schoolTo, ageFrom, statuses, appsNot, interests, schoolFrom);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Criteria criteria = (Criteria) o;
        return Objects.equals(birthday, criteria.birthday) &&
                Objects.equals(country, criteria.country) &&
                Objects.equals(userDevices, criteria.userDevices) &&
                Objects.equals(streets, criteria.streets) &&
                Objects.equals(retargetingGroupsNot, criteria.retargetingGroupsNot) &&
                Objects.equals(districts, criteria.districts) &&
                Objects.equals(schoolFrom, criteria.schoolFrom) &&
                Objects.equals(uniTo, criteria.uniTo) &&
                Objects.equals(ageFrom, criteria.ageFrom) &&
                Objects.equals(citiesNot, criteria.citiesNot) &&
                Objects.equals(paying, criteria.paying) &&
                Objects.equals(userBrowsers, criteria.userBrowsers) &&
                Objects.equals(religions, criteria.religions) &&
                Objects.equals(ageTo, criteria.ageTo) &&
                Objects.equals(interestCategories, criteria.interestCategories) &&
                Objects.equals(apps, criteria.apps) &&
                Objects.equals(retargetingGroups, criteria.retargetingGroups) &&
                Objects.equals(userOs, criteria.userOs) &&
                Objects.equals(cities, criteria.cities) &&
                Objects.equals(travellers, criteria.travellers) &&
                Objects.equals(sex, criteria.sex) &&
                Objects.equals(groups, criteria.groups) &&
                Objects.equals(appsNot, criteria.appsNot) &&
                Objects.equals(positions, criteria.positions) &&
                Objects.equals(stations, criteria.stations) &&
                Objects.equals(schoolTo, criteria.schoolTo) &&
                Objects.equals(schools, criteria.schools) &&
                Objects.equals(uniFrom, criteria.uniFrom) &&
                Objects.equals(statuses, criteria.statuses) &&
                Objects.equals(interests, criteria.interests);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Criteria{");
        sb.append("birthday=").append(birthday);
        sb.append(", country=").append(country);
        sb.append(", userDevices='").append(userDevices).append("'");
        sb.append(", streets='").append(streets).append("'");
        sb.append(", retargetingGroupsNot='").append(retargetingGroupsNot).append("'");
        sb.append(", districts='").append(districts).append("'");
        sb.append(", schoolFrom=").append(schoolFrom);
        sb.append(", uniTo=").append(uniTo);
        sb.append(", ageFrom=").append(ageFrom);
        sb.append(", citiesNot='").append(citiesNot).append("'");
        sb.append(", paying=").append(paying);
        sb.append(", userBrowsers='").append(userBrowsers).append("'");
        sb.append(", religions='").append(religions).append("'");
        sb.append(", ageTo=").append(ageTo);
        sb.append(", interestCategories='").append(interestCategories).append("'");
        sb.append(", apps='").append(apps).append("'");
        sb.append(", retargetingGroups='").append(retargetingGroups).append("'");
        sb.append(", userOs='").append(userOs).append("'");
        sb.append(", cities='").append(cities).append("'");
        sb.append(", travellers=").append(travellers);
        sb.append(", sex=").append(sex);
        sb.append(", groups='").append(groups).append("'");
        sb.append(", appsNot='").append(appsNot).append("'");
        sb.append(", positions='").append(positions).append("'");
        sb.append(", stations='").append(stations).append("'");
        sb.append(", schoolTo=").append(schoolTo);
        sb.append(", schools='").append(schools).append("'");
        sb.append(", uniFrom=").append(uniFrom);
        sb.append(", statuses='").append(statuses).append("'");
        sb.append(", interests='").append(interests).append("'");
        sb.append('}');
        return sb.toString();
    }
}
