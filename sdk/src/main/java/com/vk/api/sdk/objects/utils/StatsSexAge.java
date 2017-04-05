package com.vk.api.sdk.objects.utils;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * StatsSexAge object
 */
public class StatsSexAge {
    /**
     * Age denotation
     */
    @SerializedName("age_range")
    private String ageRange;

    /**
     * Views by female users
     */
    @SerializedName("female")
    private Integer female;

    /**
     * Views by male users
     */
    @SerializedName("male")
    private Integer male;

    public String getAgeRange() {
        return ageRange;
    }

    public Integer getFemale() {
        return female;
    }

    public Integer getMale() {
        return male;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsSexAge sexAge = (StatsSexAge) o;
        return Objects.equals(ageRange, sexAge.ageRange) &&
                Objects.equals(female, sexAge.female) &&
                Objects.equals(male, sexAge.male);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ageRange, female, male);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatsSexAge{");
        sb.append("ageRange='").append(ageRange).append('\'');
        sb.append(", female=").append(female);
        sb.append(", male=").append(male);
        sb.append('}');
        return sb.toString();
    }
}
