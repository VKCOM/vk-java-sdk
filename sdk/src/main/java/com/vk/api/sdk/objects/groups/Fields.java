package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum Fields implements EnumParam {
    @SerializedName("market")
    MARKET("market"),

    @SerializedName("member_status")
    MEMBER_STATUS("member_status"),

    @SerializedName("is_favorite")
    IS_FAVORITE("is_favorite"),

    @SerializedName("is_subscribed")
    IS_SUBSCRIBED("is_subscribed"),

    @SerializedName("city")
    CITY("city"),

    @SerializedName("country")
    COUNTRY("country"),

    @SerializedName("verified")
    VERIFIED("verified"),

    @SerializedName("description")
    DESCRIPTION("description"),

    @SerializedName("wiki_page")
    WIKI_PAGE("wiki_page"),

    @SerializedName("members_count")
    MEMBERS_COUNT("members_count"),

    @SerializedName("counters")
    COUNTERS("counters"),

    @SerializedName("cover")
    COVER("cover"),

    @SerializedName("can_post")
    CAN_POST("can_post"),

    @SerializedName("can_see_all_posts")
    CAN_SEE_ALL_POSTS("can_see_all_posts"),

    @SerializedName("activity")
    ACTIVITY("activity"),

    @SerializedName("fixed_post")
    FIXED_POST("fixed_post"),

    @SerializedName("can_create_topic")
    CAN_CREATE_TOPIC("can_create_topic"),

    @SerializedName("can_upload_video")
    CAN_UPLOAD_VIDEO("can_upload_video"),

    @SerializedName("has_photo")
    HAS_PHOTO("has_photo"),

    @SerializedName("status")
    STATUS("status"),

    @SerializedName("main_album_id")
    MAIN_ALBUM_ID("main_album_id"),

    @SerializedName("links")
    LINKS("links"),

    @SerializedName("contacts")
    CONTACTS("contacts"),

    @SerializedName("site")
    SITE("site"),

    @SerializedName("main_section")
    MAIN_SECTION("main_section"),

    @SerializedName("trending")
    TRENDING("trending"),

    @SerializedName("can_message")
    CAN_MESSAGE("can_message"),

    @SerializedName("is_market_cart_enabled")
    IS_MARKET_CART_ENABLED("is_market_cart_enabled"),

    @SerializedName("is_messages_blocked")
    IS_MESSAGES_BLOCKED("is_messages_blocked"),

    @SerializedName("can_send_notify")
    CAN_SEND_NOTIFY("can_send_notify"),

    @SerializedName("online_status")
    ONLINE_STATUS("online_status"),

    @SerializedName("start_date")
    START_DATE("start_date"),

    @SerializedName("finish_date")
    FINISH_DATE("finish_date"),

    @SerializedName("age_limits")
    AGE_LIMITS("age_limits"),

    @SerializedName("ban_info")
    BAN_INFO("ban_info"),

    @SerializedName("action_button")
    ACTION_BUTTON("action_button"),

    @SerializedName("author_id")
    AUTHOR_ID("author_id"),

    @SerializedName("phone")
    PHONE("phone"),

    @SerializedName("has_market_app")
    HAS_MARKET_APP("has_market_app"),

    @SerializedName("addresses")
    ADDRESSES("addresses"),

    @SerializedName("live_covers")
    LIVE_COVERS("live_covers"),

    @SerializedName("is_adult")
    IS_ADULT("is_adult"),

    @SerializedName("can_subscribe_posts")
    CAN_SUBSCRIBE_POSTS("can_subscribe_posts"),

    @SerializedName("warning_notification")
    WARNING_NOTIFICATION("warning_notification");

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
