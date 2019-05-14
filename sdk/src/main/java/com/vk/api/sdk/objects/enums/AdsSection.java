package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Section, suggestions are retrieved in. Available values: *countries — request of a list of countries. If q is not set or blank, a short list of countries is shown. Otherwise, a full list of countries is shown. *regions — requested list of regions. 'country' parameter is required. *cities — requested list of cities. 'country' parameter is required. *districts — requested list of districts. 'cities' parameter is required. *stations — requested list of subway stations. 'cities' parameter is required. *streets — requested list of streets. 'cities' parameter is required. *schools — requested list of educational organizations. 'cities' parameter is required. *interests — requested list of interests. *positions — requested list of positions (professions). *group_types — requested list of group types. *religions — requested list of religious commitments. *browsers — requested list of browsers and mobile devices.
 */
public enum AdsSection implements EnumParam {
    @SerializedName("countries")
    COUNTRIES("countries"),

    @SerializedName("regions")
    REGIONS("regions"),

    @SerializedName("cities")
    CITIES("cities"),

    @SerializedName("districts")
    DISTRICTS("districts"),

    @SerializedName("stations")
    STATIONS("stations"),

    @SerializedName("streets")
    STREETS("streets"),

    @SerializedName("schools")
    SCHOOLS("schools"),

    @SerializedName("interests")
    INTERESTS("interests"),

    @SerializedName("positions")
    POSITIONS("positions"),

    @SerializedName("group_types")
    GROUP_TYPES("group_types"),

    @SerializedName("religions")
    RELIGIONS("religions"),

    @SerializedName("browsers")
    BROWSERS("browsers");

    private final String value;

    AdsSection(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
