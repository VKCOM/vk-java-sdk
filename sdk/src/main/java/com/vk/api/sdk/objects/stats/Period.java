package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * Period object
 */
public class Period {
    /**
     * Day (YYYY-MM-DD)
     */
    @SerializedName("day")
    private String day;

    /**
     * Views number
     */
    @SerializedName("views")
    private Integer views;

    /**
     * Visitors number
     */
    @SerializedName("visitors")
    private Integer visitors;

    /**
     * Total reach
     */
    @SerializedName("reach")
    private Integer reach;

    /**
     * Subscribers reach
     */
    @SerializedName("reach_subscribers")
    private Integer reachSubscribers;

    /**
     * Number of users subscribed
     */
    @SerializedName("subscribed")
    private Integer subscribed;

    /**
     * Number of users unsubscribed
     */
    @SerializedName("unsubscribed")
    private Integer unsubscribed;

    @SerializedName("sex")
    private List<Sex> sex;

    @SerializedName("age")
    private List<Age> age;

    @SerializedName("sex_age")
    private List<SexAge> sexAge;

    @SerializedName("cities")
    private List<City> cities;

    @SerializedName("countries")
    private List<Country> countries;

    public String getDay() {
        return day;
    }

    public Integer getViews() {
        return views;
    }

    public Integer getVisitors() {
        return visitors;
    }

    public Integer getReach() {
        return reach;
    }

    public Integer getReachSubscribers() {
        return reachSubscribers;
    }

    public Integer getSubscribed() {
        return subscribed;
    }

    public Integer getUnsubscribed() {
        return unsubscribed;
    }

    public List<Sex> getSex() {
        return sex;
    }

    public List<Age> getAge() {
        return age;
    }

    public List<SexAge> getSexAge() {
        return sexAge;
    }

    public List<City> getCities() {
        return cities;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public int hashCode() {
        return Objects.hash(visitors, subscribed, unsubscribed, cities, reachSubscribers, reach, sex, countries, day, sexAge, views, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Period period = (Period) o;
        return Objects.equals(day, period.day) &&
                Objects.equals(views, period.views) &&
                Objects.equals(visitors, period.visitors) &&
                Objects.equals(reach, period.reach) &&
                Objects.equals(reachSubscribers, period.reachSubscribers) &&
                Objects.equals(subscribed, period.subscribed) &&
                Objects.equals(unsubscribed, period.unsubscribed) &&
                Objects.equals(sex, period.sex) &&
                Objects.equals(age, period.age) &&
                Objects.equals(sexAge, period.sexAge) &&
                Objects.equals(cities, period.cities) &&
                Objects.equals(countries, period.countries);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Period{");
        sb.append("day='").append(day).append("'");
        sb.append(", views=").append(views);
        sb.append(", visitors=").append(visitors);
        sb.append(", reach=").append(reach);
        sb.append(", reachSubscribers=").append(reachSubscribers);
        sb.append(", subscribed=").append(subscribed);
        sb.append(", unsubscribed=").append(unsubscribed);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", sexAge=").append(sexAge);
        sb.append(", cities=").append(cities);
        sb.append(", countries=").append(countries);
        sb.append('}');
        return sb.toString();
    }
}
