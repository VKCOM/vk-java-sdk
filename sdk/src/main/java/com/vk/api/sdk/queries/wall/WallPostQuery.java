package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.wall.responses.PostResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.post method
 */
public class WallPostQuery extends AbstractQueryBuilder<WallPostQuery, PostResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public WallPostQuery(VkApiClient client, UserActor actor) {
        super(client, "wall.post", PostResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * User ID or community ID. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * '1' — post will be available to friends only, '0' — post will be available to all users (default)
     *
     * @param value value of "friends only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery friendsOnly(Boolean value) {
        return unsafeParam("friends_only", value);
    }

    /**
     * For a community: '1' — post will be published by the community, '0' — post will be published by the user (default)
     *
     * @param value value of "from group" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery fromGroup(Boolean value) {
        return unsafeParam("from_group", value);
    }

    /**
     * (Required if 'attachments' is not set.) Text of the post.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * List of services or websites the update will be exported to, if the user has so requested. Sample values: 'twitter', 'facebook'.
     *
     * @param value value of "services" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery services(String value) {
        return unsafeParam("services", value);
    }

    /**
     * Only for posts in communities with 'from_group' set to '1': '1' — post will be signed with the name of the posting user, '0' — post will not be signed (default)
     *
     * @param value value of "signed" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery signed(Boolean value) {
        return unsafeParam("signed", value);
    }

    /**
     * Publication date (in Unix time). If used, posting will be delayed until the set time.
     *
     * @param value value of "publish date" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery publishDate(Integer value) {
        return unsafeParam("publish_date", value);
    }

    /**
     * Geographical latitude of a check-in, in degrees (from -90 to 90).
     *
     * @param value value of "lat" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery lat(Number value) {
        return unsafeParam("lat", value);
    }

    /**
     * Geographical longitude of a check-in, in degrees (from -180 to 180).
     *
     * @param value value of "long" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery lng(Number value) {
        return unsafeParam("long", value);
    }

    /**
     * ID of the location where the user was tagged.
     *
     * @param value value of "place id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery placeId(Integer value) {
        return unsafeParam("place_id", value);
    }

    /**
     * Post ID. Used for publishing of scheduled and suggested posts.
     *
     * @param value value of "post id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery postId(Integer value) {
        return unsafeParam("post_id", value);
    }

    /**
     * Set guid
     *
     * @param value value of "guid" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery guid(String value) {
        return unsafeParam("guid", value);
    }

    /**
     * Set mark as ads
     *
     * @param value value of "mark as ads" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery markAsAds(Boolean value) {
        return unsafeParam("mark_as_ads", value);
    }

    /**
     * Set close comments
     *
     * @param value value of "close comments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery closeComments(Boolean value) {
        return unsafeParam("close_comments", value);
    }

    /**
     * Set donut paid duration
     *
     * @param value value of "donut paid duration" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery donutPaidDuration(Integer value) {
        return unsafeParam("donut_paid_duration", value);
    }

    /**
     * Set mute notifications
     *
     * @param value value of "mute notifications" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery muteNotifications(Boolean value) {
        return unsafeParam("mute_notifications", value);
    }

    /**
     * Set copyright
     *
     * @param value value of "copyright" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery copyright(String value) {
        return unsafeParam("copyright", value);
    }

    /**
     * attachments
     * (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", ' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'page' — wiki-page, 'note' — note, 'poll' — poll, 'album' — photo album, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error will be thrown."
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery attachments(String... value) {
        return unsafeParam("attachments", value);
    }

    /**
     * (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", ' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'page' — wiki-page, 'note' — note, 'poll' — poll, 'album' — photo album, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error will be thrown."
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallPostQuery attachments(List<String> value) {
        return unsafeParam("attachments", value);
    }

    @Override
    protected WallPostQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
