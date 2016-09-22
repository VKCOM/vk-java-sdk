package com.vk.api.sdk.queries.account;


import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum AccountGetInfoField implements EnumParam {

    COUNTRY("country"),
    HTTPS_REQUIRED("https_required"),
    OWN_POSTS_DEFAULT("own_posts_default"),
    NO_WALL_REPLIES("no_wall_replies"),
    INTRO("intro"),
    LANG("lang");

    private final String value;

    AccountGetInfoField(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
