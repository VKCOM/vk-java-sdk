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

    @SerializedName("is_subscribed_podcasts")
    IS_SUBSCRIBED_PODCASTS("is_subscribed_podcasts"),

    @SerializedName("can_subscribe_podcasts")
    CAN_SUBSCRIBE_PODCASTS("can_subscribe_podcasts"),

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

    @SerializedName("requests_count")
    REQUESTS_COUNT("requests_count"),

    @SerializedName("counters")
    COUNTERS("counters"),

    @SerializedName("cover")
    COVER("cover"),

    @SerializedName("can_post")
    CAN_POST("can_post"),

    @SerializedName("can_suggest")
    CAN_SUGGEST("can_suggest"),

    @SerializedName("can_upload_story")
    CAN_UPLOAD_STORY("can_upload_story"),

    @SerializedName("can_upload_doc")
    CAN_UPLOAD_DOC("can_upload_doc"),

    @SerializedName("can_upload_video")
    CAN_UPLOAD_VIDEO("can_upload_video"),

    @SerializedName("can_see_all_posts")
    CAN_SEE_ALL_POSTS("can_see_all_posts"),

    @SerializedName("can_create_topic")
    CAN_CREATE_TOPIC("can_create_topic"),

    @SerializedName("activity")
    ACTIVITY("activity"),

    @SerializedName("fixed_post")
    FIXED_POST("fixed_post"),

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

    @SerializedName("secondary_section")
    SECONDARY_SECTION("secondary_section"),

    @SerializedName("wall")
    WALL("wall"),

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

    @SerializedName("has_group_channel")
    HAS_GROUP_CHANNEL("has_group_channel"),

    @SerializedName("group_channel")
    GROUP_CHANNEL("group_channel"),

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
    WARNING_NOTIFICATION("warning_notification"),

    @SerializedName("msg_push_allowed")
    MSG_PUSH_ALLOWED("msg_push_allowed"),

    @SerializedName("stories_archive_count")
    STORIES_ARCHIVE_COUNT("stories_archive_count"),

    @SerializedName("video_live_level")
    VIDEO_LIVE_LEVEL("video_live_level"),

    @SerializedName("video_live_count")
    VIDEO_LIVE_COUNT("video_live_count"),

    @SerializedName("clips_count")
    CLIPS_COUNT("clips_count"),

    @SerializedName("is_business")
    IS_BUSINESS("is_business");

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
