package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by tsivarev on 22.08.16.
 */
public enum GroupField implements EnumParam {
    SCREEN_NAME("screen_name"),
    IS_CLOSED("is_closed"),
    DEACTIVATED("deactivated"),
    IS_ADMIN("is_admin"),
    ADMIN_LEVEL("admin_level"),
    IS_MEMBER("is_member"),
    INVITED_BY("invited_by"),
    TYPE("type"),
    HAS_PHOTO("has_photo"),
    PHOTO_50("photo_50"),
    PHOTO_100("photo_100"),
    PHOTO_200("photo_200"),
    BAN_INFO("ban_info"),
    MEMBER_STATUS("member_status"),
    CITY("city"),
    COUNTRY("country"),
    PLACE("place"),
    DESCRIPTION("description"),
    WIKI_PAGE("wiki_page"),
    MEMBERS_COUNT("members_count"),
    COUNTERS("counters"),
    START_DATE("start_date"),
    FINISH_DATE("finish_date"),
    PUBLIC_DATE_LABEL("public_date_label"),
    CAN_MESSAGE("can_message"),
    IS_MESSAGES_ALLOWED("is_messages_allowed"),
    CAN_POST("can_post"),
    CAN_SEE_ALL_POSTS("can_see_all_posts"),
    CAN_UPLOAD_DOC("can_upload_doc"),
    CAN_UPLOAD_VIDEO("can_upload_video"),
    CAN_CREATE_TOPIC("can_create_topic"),
    ACTIVITY("activity"),
    STATUS("status"),
    CONTACTS("contacts"),
    LINKS("links"),
    FIXED_POST("fixed_post"),
    VERIFIED("verified"),
    SITE("site"),
    MAIN_ALBUM_ID("main_album_id"),
    IS_FAVORITE("is_favorite"),
    IS_HIDDEN_FROM_FEED("is_hidden_from_feed"),
    MAIN_SECTION("main_section"),
    MARKET("market"),
    AGE_LIMITS("age_limits"),
    COVER("cover");

    private final String value;

    GroupField(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
