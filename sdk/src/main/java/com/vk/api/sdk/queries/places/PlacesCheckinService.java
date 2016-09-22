package com.vk.api.sdk.queries.places;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum PlacesCheckinService implements EnumParam {

    TWITTER("twitter"),
    FACEBOOK("facebook");

    private final String value;

    PlacesCheckinService(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
