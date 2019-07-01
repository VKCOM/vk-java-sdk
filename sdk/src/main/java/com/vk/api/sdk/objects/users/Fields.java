package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum Fields implements EnumParam {
    @SerializedName("photo_id")
    PHOTO_ID("photo_id"),

    @SerializedName("verified")
    VERIFIED("verified"),

    @SerializedName("sex")
    SEX("sex"),

    @SerializedName("bdate")
    BDATE("bdate"),

    @SerializedName("city")
    CITY("city"),

    @SerializedName("country")
    COUNTRY("country"),

    @SerializedName("home_town")
    HOME_TOWN("home_town"),

    @SerializedName("has_photo")
    HAS_PHOTO("has_photo"),

    @SerializedName("photo_50")
    PHOTO_50("photo_50"),

    @SerializedName("photo_100")
    PHOTO_100("photo_100"),

    @SerializedName("photo_200_orig")
    PHOTO_200_ORIG("photo_200_orig"),

    @SerializedName("photo_200")
    PHOTO_200("photo_200"),

    @SerializedName("photo_400_orig")
    PHOTO_400_ORIG("photo_400_orig"),

    @SerializedName("photo_max")
    PHOTO_MAX("photo_max"),

    @SerializedName("photo_max_orig")
    PHOTO_MAX_ORIG("photo_max_orig"),

    @SerializedName("online")
    ONLINE("online"),

    @SerializedName("lists")
    LISTS("lists"),

    @SerializedName("domain")
    DOMAIN("domain"),

    @SerializedName("has_mobile")
    HAS_MOBILE("has_mobile"),

    @SerializedName("contacts")
    CONTACTS("contacts"),

    @SerializedName("site")
    SITE("site"),

    @SerializedName("education")
    EDUCATION("education"),

    @SerializedName("universities")
    UNIVERSITIES("universities"),

    @SerializedName("schools")
    SCHOOLS("schools"),

    @SerializedName("status")
    STATUS("status"),

    @SerializedName("last_seen")
    LAST_SEEN("last_seen"),

    @SerializedName("followers_count")
    FOLLOWERS_COUNT("followers_count"),

    @SerializedName("counters")
    COUNTERS("counters"),

    @SerializedName("common_count")
    COMMON_COUNT("common_count"),

    @SerializedName("occupation")
    OCCUPATION("occupation"),

    @SerializedName("nickname")
    NICKNAME("nickname"),

    @SerializedName("relatives")
    RELATIVES("relatives"),

    @SerializedName("relation")
    RELATION("relation"),

    @SerializedName("personal")
    PERSONAL("personal"),

    @SerializedName("connections")
    CONNECTIONS("connections"),

    @SerializedName("exports")
    EXPORTS("exports"),

    @SerializedName("wall_comments")
    WALL_COMMENTS("wall_comments"),

    @SerializedName("activities")
    ACTIVITIES("activities"),

    @SerializedName("interests")
    INTERESTS("interests"),

    @SerializedName("music")
    MUSIC("music"),

    @SerializedName("movies")
    MOVIES("movies"),

    @SerializedName("tv")
    TV("tv"),

    @SerializedName("books")
    BOOKS("books"),

    @SerializedName("games")
    GAMES("games"),

    @SerializedName("about")
    ABOUT("about"),

    @SerializedName("quotes")
    QUOTES("quotes"),

    @SerializedName("can_post")
    CAN_POST("can_post"),

    @SerializedName("can_see_all_posts")
    CAN_SEE_ALL_POSTS("can_see_all_posts"),

    @SerializedName("can_see_audio")
    CAN_SEE_AUDIO("can_see_audio"),

    @SerializedName("can_write_private_message")
    CAN_WRITE_PRIVATE_MESSAGE("can_write_private_message"),

    @SerializedName("can_send_friend_request")
    CAN_SEND_FRIEND_REQUEST("can_send_friend_request"),

    @SerializedName("is_favorite")
    IS_FAVORITE("is_favorite"),

    @SerializedName("is_hidden_from_feed")
    IS_HIDDEN_FROM_FEED("is_hidden_from_feed"),

    @SerializedName("timezone")
    TIMEZONE("timezone"),

    @SerializedName("screen_name")
    SCREEN_NAME("screen_name"),

    @SerializedName("maiden_name")
    MAIDEN_NAME("maiden_name"),

    @SerializedName("crop_photo")
    CROP_PHOTO("crop_photo"),

    @SerializedName("is_friend")
    IS_FRIEND("is_friend"),

    @SerializedName("friend_status")
    FRIEND_STATUS("friend_status"),

    @SerializedName("career")
    CAREER("career"),

    @SerializedName("military")
    MILITARY("military"),

    @SerializedName("blacklisted")
    BLACKLISTED("blacklisted"),

    @SerializedName("blacklisted_by_me")
    BLACKLISTED_BY_ME("blacklisted_by_me"),

    @SerializedName("can_subscribe_posts")
    CAN_SUBSCRIBE_POSTS("can_subscribe_posts"),

    @SerializedName("descriptions")
    DESCRIPTIONS("descriptions"),

    @SerializedName("trending")
    TRENDING("trending"),

    @SerializedName("mutual")
    MUTUAL("mutual");

    private final String value;

    Fields(String value) {
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
