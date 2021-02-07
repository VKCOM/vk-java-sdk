package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.wall.responses.EditResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.edit method
 */
public class WallEditQuery extends AbstractQueryBuilder<WallEditQuery, EditResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param postId value of "post id" parameter. Minimum is 0.
     */
    public WallEditQuery(VkApiClient client, UserActor actor, int postId) {
        super(client, "wall.edit", EditResponse.class);
        accessToken(actor.getAccessToken());
        postId(postId);
    }

    /**
     * User ID or community ID. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set post id
     *
     * @param value value of "post id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallEditQuery postId(int value) {
        return unsafeParam("post_id", value);
    }

    /**
     * Set friends only
     *
     * @param value value of "friends only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery friendsOnly(Boolean value) {
        return unsafeParam("friends_only", value);
    }

    /**
     * (Required if 'attachments' is not set.) Text of the post.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Set services
     *
     * @param value value of "services" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery services(String value) {
        return unsafeParam("services", value);
    }

    /**
     * Set signed
     *
     * @param value value of "signed" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery signed(Boolean value) {
        return unsafeParam("signed", value);
    }

    /**
     * Set publish date
     *
     * @param value value of "publish date" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery publishDate(Integer value) {
        return unsafeParam("publish_date", value);
    }

    /**
     * Set lat
     *
     * @param value value of "lat" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery lat(Number value) {
        return unsafeParam("lat", value);
    }

    /**
     * Set long
     *
     * @param value value of "long" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery lng(Number value) {
        return unsafeParam("long", value);
    }

    /**
     * Set place id
     *
     * @param value value of "place id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery placeId(Integer value) {
        return unsafeParam("place_id", value);
    }

    /**
     * Set mark as ads
     *
     * @param value value of "mark as ads" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery markAsAds(Boolean value) {
        return unsafeParam("mark_as_ads", value);
    }

    /**
     * Set close comments
     *
     * @param value value of "close comments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery closeComments(Boolean value) {
        return unsafeParam("close_comments", value);
    }

    /**
     * Set donut paid duration
     *
     * @param value value of "donut paid duration" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery donutPaidDuration(Integer value) {
        return unsafeParam("donut_paid_duration", value);
    }

    /**
     * Set poster bkg id
     *
     * @param value value of "poster bkg id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery posterBkgId(Integer value) {
        return unsafeParam("poster_bkg_id", value);
    }

    /**
     * Set poster bkg owner id
     *
     * @param value value of "poster bkg owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery posterBkgOwnerId(Integer value) {
        return unsafeParam("poster_bkg_owner_id", value);
    }

    /**
     * Set poster bkg access hash
     *
     * @param value value of "poster bkg access hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery posterBkgAccessHash(String value) {
        return unsafeParam("poster_bkg_access_hash", value);
    }

    /**
     * Set copyright
     *
     * @param value value of "copyright" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery copyright(String value) {
        return unsafeParam("copyright", value);
    }

    /**
     * attachments
     * (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", ' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error is thrown."
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery attachments(String... value) {
        return unsafeParam("attachments", value);
    }

    /**
     * (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", ' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error is thrown."
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery attachments(List<String> value) {
        return unsafeParam("attachments", value);
    }

    @Override
    protected WallEditQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("post_id", "access_token");
    }
}
