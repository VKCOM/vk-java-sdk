package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by tsivarev on 22.08.16.
 */
public enum UserField implements EnumParam {
    PHOTO_ID("photo_id"),
    VERIFIED("verified"),
    SEX("sex"),
    BDATE("bdate"),
    CITY("city"),
    COUNTRY("country"),
    HOME_TOWN("home_town"),
    HAS_PHOTO("has_photo"),
    PHOTO_50("photo_50"),
    PHOTO_100("photo_100"),
    PHOTO_200_ORIG("photo_200_orig"),
    PHOTO_200("photo_200"),
    PHOTO_400_ORIG("photo_400_orig"),
    PHOTO_MAX("photo_max"),
    PHOTO_MAX_ORIG("photo_max_orig"),
    ONLINE("online"),
    LISTS("lists"),
    DOMAIN("domain"),
    HAS_MOBILE("has_mobile"),
    CONTACTS("contacts"),
    SITE("site"),
    EDUCATION("education"),
    UNIVERSITIES("universities"),
    SCHOOLS("schools"),
    STATUS("status"),
    LAST_SEEN("last_seen"),
    FOLLOWERS_COUNT("followers_count"),
    COUNTERS("counters"),
    COMMON_COUNT("common_count"),
    OCCUPATION("occupation"),
    NICKNAME("nickname"),
    RELATIVES("relatives"),
    RELATION("relation"),
    PERSONAL("personal"),
    CONNECTIONS("connections"),
    EXPORTS("exports"),
    WALL_COMMENTS("wall_comments"),
    ACTIVITIES("activities"),
    INTERESTS("interests"),
    MUSIC("music"),
    MOVIES("movies"),
    TV("tv"),
    BOOKS("books"),
    GAMES("games"),
    ABOUT("about"),
    QUOTES("quotes"),
    CAN_POST("can_post"),
    CAN_SEE_ALL_POSTS("can_see_all_posts"),
    CAN_SEE_AUDIO("can_see_audio"),
    CAN_WRITE_PRIVATE_MESSAGE("can_write_private_message"),
    CAN_SEND_FRIEND_REQUEST("can_send_friend_request"),
    IS_FAVORITE("is_favorite"),
    IS_HIDDEN_FROM_FEED("is_hidden_from_feed"),
    TIMEZONE("timezone"),
    SCREEN_NAME("screen_name"),
    MAIDEN_NAME("maiden_name"),
    CROP_PHOTO("crop_photo"),
    IS_FRIEND("is_friend"),
    FRIEND_STATUS("friend_status"),
    CAREER("career"),
    MILITARY("military"),
    BLACKLISTED("blacklisted"),
    BLACKLISTED_BY_ME("blacklisted_by_me");

    private final String value;

    UserField(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
