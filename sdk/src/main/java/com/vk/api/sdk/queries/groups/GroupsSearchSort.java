package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum GroupsSearchSort implements EnumParam {

    /**
     * default sorting (similar th the full version of the site);
     */
    DEFAULT("0"),

    /**
     * by growth speed;
     */
    BY_GROWTH_SPEED("1"),

    /**
     * by the "day attendance/members number" ratio;
     */
    BY_DAY_ATTENDANCE_PER_MEMBERS_NUMBER_RATIO("2"),

    /**
     * by the "Likes number/members number" ratio;
     */
    BY_LIKES_NUMBER_PER_MEMBERS_NUMBER_RATIO("3"),

    /**
     * by the "comments number/members number" ratio;
     */
    BY_COMMENTS_NUMBER_PER_MEMBERS_NUMBER_RATIO("4"),

    /**
     * by the "boards entries number/members number" ratio.
     */
    BY_BOARD_ENTRIES_NUMBER_PER_MEMBERS_NUMBER_RATIO("5");


    private final String value;

    GroupsSearchSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
