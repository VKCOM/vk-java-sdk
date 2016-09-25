package com.vk.api.sdk.queries.ads;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AdsGetSuggestionsSection implements EnumParam {
    /**
     * request of a list of countries. If q is not set or blank, a short list of countries is shown.
     * Otherwise, a full list of countries is shown.
     */
    COUNTRIES("countries"),

    /**
     * requested list of regions.  "country" parameter is required.
     */
    REGIONS("regions"),

    /**
     * requested list of cities. "country" parameter is required.
     */
    CITIES("cities"),

    /**
     * requested list of districts.  "cities" parameter is required.
     */
    DISTRICTS("districts"),

    /**
     * requested list of subway stations.  "cities" parameter is required.
     */
    STATIONS("stations"),

    /**
     * requested list of cities. "cities" parameter is required.
     */
    STREETS("streets"),

    /**
     * requested list of educational organizations.  "cities" parameter is required.
     */
    SCHOOLS("schools"),

    /**
     * requested list of interests.
     */
    INTERESTS("interests"),

    /**
     * requested list of positions (professions).
     */
    POSITIONS("positions"),

    /**
     * requested list of group types.
     */
    GROUP_TYPES("group_types"),

    /**
     * requested list of religious commitments.
     */
    RELIGIONS("religions"),

    /**
     * requested list of browsers and mobile devices.
     */
    BROWSERS("browsers");


    private final String value;

    AdsGetSuggestionsSection(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
